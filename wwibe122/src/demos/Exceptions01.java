package demos;

/**
 * Ausnahmen (Exceptions)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Exceptions01 {

  public static void main(String[] args) {

    String[] names = {"Hans", "Peter", null};
    // System.out.println(names[3]);

    String name = names[2];
    System.out.println(name.toUpperCase());

  }

}
