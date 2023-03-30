package demos;

/**
 * Variable Argumentlisten (VarArgs)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Arrays03 {

  public static void main(String[] args) {

    Arrays03.print("Hans");
    Arrays03.print("Peter");
    Arrays03.print("Lisa");

    Arrays03.printAll("Hans");
    Arrays03.printAll("Hans", "Peter", "Lisa");

  }

  public static void print(String text) {
    System.out.println(text);
  }

  public static void printAll(String... texts) {
    for (int i = 0; i < texts.length; i++) {
      Arrays03.print(texts[i]);
    }
  }

}
