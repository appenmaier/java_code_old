package demos;

/**
 * Zeichenketten
 *
 * @author Daniel Appenmaier
 * 
 */
public class DataObjects04 {

  public static void main(String[] args) {

    String text = "Hello World";

    char char1 = text.charAt(0);
    char char5 = text.charAt(4);
    int length = text.length();

    System.out.println("char1: " + char1);
    System.out.println("char5: " + char5);
    System.out.println("length: " + length);

    /* Escape-Sequenzen */
    String text2 = "\"Hello World\" heißt auf Deutsch \"Hallo Welt\"";
    System.out.println("text2: " + text2);
    System.out.println("Tabulator: \t" + text);
    System.out.println("Zeilenumbruch: \n" + text);
    System.out.println("Anführungszeichen: \"" + text + "\"");
    System.out.println("Umgedrehter Schrägstrich: \\");

  }

}
