package util.function;

import java.util.function.Consumer;

public class BatchOperation {

  @SafeVarargs
  public static <T> void doForEach(Consumer<T> action, T... doWithUs) {
    for (T element : doWithUs) {
      action.accept(element);
    }
  }

  public static <T> void withEach(Iterable<T> iterable, Consumer<T> c) {
    iterable.forEach(c);
  }

}
