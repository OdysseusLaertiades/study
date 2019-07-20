package util.function;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import static util.function.Value.with;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class CollectOperation {

  public static <T> Collector<T, ?, List<T>> toShuffledList() {
    return collectingAndThen(toList(), list -> with(list, Collections::shuffle));
  }

}
