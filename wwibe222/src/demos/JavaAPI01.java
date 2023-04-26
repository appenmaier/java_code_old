package demos;

import java.util.ArrayList;

/**
 * Die Klasse ArrayList<E>
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaAPI01 {

  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();

    /* Elemente anfuegen */
    names.add("Hans");
    names.add("Peter");

    /* Elemente einfuegen */
    names.add(1, "Lisa");
    names.add(1, "Heidi");

    /* Elemente auslesen */
    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      System.out.println(name);
    }

    /* Elemente ausgeben */
    System.out.println(names.toString());

  }

}
