package demos;

/**
 * Fixe Datenobjekte
 *
 * @author Daniel Appenmaier
 * 
 */
public class DataObjects03 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    /* Variablen */
    String name;
    name = "Hans";
    System.out.println("name: " + name);

    String oldName = name;
    name = "Lisa";
    System.out.println("name: " + name);

    /* Konstanten */
    final double PI = 3.14159265359;

    System.out.println("PI: " + PI);

  }

}
