package kotlininaction.chap06.collection;

import java.util.List;

public interface DataParser<T> {

  void parseDate(String input, List<T> output, List<String> errors);
}
