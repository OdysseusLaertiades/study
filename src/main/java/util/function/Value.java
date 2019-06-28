package util.function;

import java.util.function.Consumer;

public class Value {

  public static <T> T with(T value, Consumer<T> consumer) {
    consumer.accept(value);
    return value;
  }

}
