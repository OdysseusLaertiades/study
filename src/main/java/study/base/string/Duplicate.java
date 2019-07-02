package study.base.string;

/**
 * find - method should find the letter in the string that occurs most often, if there are none - return empty string,
 * if several letters have the same number of repetitions, return one that was detected first. Ignore whitespaces and punctuation. Case sensitive
 * without - method should return source string without all duplicate letters. Ignore whitespaces and punctuation. Case sensitive
 * find("without") → "t"
 * find("letters") → "e"
 * find("lEtters") → "t"
 * find("the")→ ""
 * without("letters") → "lrs";
 * without("leTters") → "lTtrs";
 */

public class Duplicate {

    public String find(String source) {
        return findMostRepeatedLetter(withoutWhitespace(source));
    }

    public String without(String source) {
        return removeDuplicateLetters(source);
    }

    private String withoutWhitespace(String source) {
        return source.replaceAll(" ", "");
    }

    private String findMostRepeatedLetter(String byFind) {
        int count = 1;
        int biggestCount = 0;
        String result = "";

        for (int i = 0; i < byFind.length(); i++) {
            if (!Character.toString(byFind.charAt(i)).equals("")) {
                for (int j = i + 1; j < byFind.length(); j++) {
                    if (byFind.charAt(i) == byFind.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count > biggestCount && count > 1) {
                result = Character.toString(byFind.charAt(i));
                biggestCount = count;
            }
            count = 1;
        }
        return result;
    }

    private String removeDuplicateLetters(String byRemove) {
        String result = byRemove;
        for (int i = 0; i < byRemove.length(); i++) {
            if (Character.isLetter(byRemove.charAt(i))) {
                for (int j = i + 1; j < byRemove.length(); j++) {
                    if (byRemove.charAt(i) == byRemove.charAt(j)) {
                        result = result.replaceAll(Character.toString(byRemove.charAt(i)), "");
                    }
                }
            }
        }
        return result;
    }
}