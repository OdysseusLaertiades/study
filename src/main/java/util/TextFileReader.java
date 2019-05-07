package util;

import static java.util.Objects.requireNonNull;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import lombok.SneakyThrows;

public class TextFileReader {

  public String getStringWithText(String fileName) {
    return String.join(" ", getTextFileString(fileName));
  }

  @SneakyThrows
  public List<String> getTextFileString(String fileName) {
    return Files.readAllLines(
        Paths.get(requireNonNull(
            getClass()
                .getClassLoader()
                .getResource(fileName))
            .toURI()
        )
    );
  }
}
