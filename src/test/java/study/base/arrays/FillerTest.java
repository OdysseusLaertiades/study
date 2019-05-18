package study.base.arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class FillerTest {

  private final Filler filler = new Filler();

  @Test
  private void fill() {
    String[] strings = new String[10];
    String toFill = "lorem ipsum dolor";
    filler.fill(strings, toFill);
    assertThat(Arrays.asList(strings), everyItem(equalTo(toFill)));
  }

}
