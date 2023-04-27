package demos;

import java.util.Optional;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Optionals01 {

  private static String getText() {
    return null;
  }

  private static Optional<String> getTextAsOptional() {
    return Optional.empty();
  }

  public static void main(String[] args) {

    String text = getText();
    if (text != null) {
      System.out.println(text.toUpperCase());
    }

    Optional<String> optionalText = getTextAsOptional();
    if (optionalText.isPresent()) {
      System.out.println(optionalText.get().toUpperCase());
    }

    optionalText.ifPresentOrElse(t -> System.out.println(t.toUpperCase()),
        () -> System.out.println("Mittagspause"));

  }

}
