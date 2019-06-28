package study.base.string.regex;

/**
 * You will be provided with a chunk of HTML markup. Your task is to identify the unique domain names from
 * the links or Urls which are present in the markup fragment. For example, if the link
 * http://www.hackerrank.com/contest is present in the markup, you should detect the domain:
 * hackerrank.com. In case there are second level or higher level domains present in the markup,
 * all of them need to be treated as unique. For instance if the links http://www.xyz.com/news,
 * https://abc.xyz.com/jobs, http://abcd.xyz.com/jobs2 are present in the markup then [xyz.com, abc.xyz.com,
 * abcd.xyz.com] should all be identified as unique domains present in the markup. Prefixes like "www."
 * and "ww2.", if present, should be scrubbed out from the domain name.
 */

public class DomainNameDetector {

  public String detect(String source) {
    String domain = "";
    int i = 0;
    for (String identify : source.split("\\//")){
      if (i > 0){
        domain += identify.substring(identify.indexOf(".") + 1, identify.indexOf("/"));
      }
        i++;
    }
    return i > 1 ? domain : source;
  }
}