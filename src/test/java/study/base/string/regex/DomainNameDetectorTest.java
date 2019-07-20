package study.base.string.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import study.base.string.TestData;

class DomainNameDetectorTest extends TestData {

  private static final String FILE_NAME = "content.html";
  private final DomainNameDetector domainNameDetector = new DomainNameDetector();

  @Test
  void detect() {
    String source = textFileReader.getStringWithText(FILE_NAME);
    String expectedResult = "askoxford.com;bnsf.com;hydrogencarsnow.com;mrvc.indianrail.gov.in;web.archive.org";
    assertEquals(expectedResult, domainNameDetector.detect(source));
  }

}