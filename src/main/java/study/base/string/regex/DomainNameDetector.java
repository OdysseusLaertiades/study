package study.base.string.regex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.function.Value.with;

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

  private static final Pattern PATTERN = Pattern.compile("https?://(www.|ww2.)?([a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+)");

  public String detect(String source) {
    return String.join(";", with(new ArrayList<String>(), lst -> lst.addAll(findDomainNames(source))));
  }

  private Set<String> findDomainNames(String source) {
    Matcher matcher = PATTERN.matcher(source);
    return with(new HashSet<>(), domainNames -> {
      while (matcher.find()) {
        domainNames.add(matcher.group(2));
      }
    });
  }
}
