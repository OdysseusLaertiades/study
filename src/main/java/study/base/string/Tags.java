package study.base.string;


/**
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
 *
 * mark("i", "Yay") → "<i>Yay</i>"
 * mark("i", "Hello") → "<i>Hello</i>"
 * mark("cite", "Yay") → "<cite>Yay</cite>"
 *
 * Should throw NullPointerException if one of arguments is null or IllegalArgumentException if empty
 */

public class Tags {

  public String mark(String tag, String source) {

    StringBuilder sb = new StringBuilder();

    try {

      tag.toUpperCase();
      source.toUpperCase();

      if (tag.charAt(0) == ' ' || source.charAt(0) == ' '){
        throw new IllegalArgumentException();
      }

      sb.append("<")
              .append(tag)
              .append(">")
              .append(source)
              .append("</")
              .append(tag)
              .append(">");

    } catch (NullPointerException e){
      System.out.println("Error! You word is null!");
      return null;
    } catch (IllegalArgumentException ex){
      System.out.println("Error! You word is not legal!");
      return " ";
    }
    return sb.toString();
  }

}
