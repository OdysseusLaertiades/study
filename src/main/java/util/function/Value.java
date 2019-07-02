package util.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class Value {

  public static <T> T with(T value, Consumer<T> consumer) {
    consumer.accept(value);
    return value;
  }

  public static <T, R> R map(T value, Function<T, R> map) {
    return map.apply(value);
  }

}
