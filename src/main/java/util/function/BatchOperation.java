package util.function;

import java.util.function.Consumer;

public class BatchOperation {

  @SafeVarargs
  public static <T> void doForEach(Consumer<T> action, T... doWithUs) {
    for (T element : doWithUs) {
      action.accept(element);
    }
  }

}
