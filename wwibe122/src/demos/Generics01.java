package demos;

import demos.box.Box;

/**
 * Generische Programmierung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Generics01 {

  public static void main(String[] args) {

    Box<String> stringBox = new Box<>();
    stringBox.setContent("Hallo Welt");
    String text = stringBox.getContent();
    System.out.println(text);

    Box<Integer> integerBox = new Box<>();
    integerBox.setContent(42);
    int number = integerBox.getContent();
    System.out.println(number);

  }

}
