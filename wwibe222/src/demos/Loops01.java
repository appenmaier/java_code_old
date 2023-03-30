package demos;

/**
 * Schleifen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Loops01 {

  public static void main(String[] args) {

    /* while-Schleife (kopfgesteuerte Schleife) */
    int i = 1;

    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    System.out.println();

    /* do/while-Schleife (fußgesteuerte Schleife) */
    int k = 1;

    do {
      System.out.println(k);
      k++;
    } while (k <= 10);

    System.out.println();

    /* for-Schleife (Zählschleife) */
    for (int m = 1; m <= 10; m++) {
      System.out.println(m);
    }

    String text = "Hello World, how are u doing?";
    for (int m = 0; m < text.length(); m++) {
      System.out.println(m + ": " + text.charAt(m));
    }

    System.out.println("i: " + i);
    System.out.println("k: " + k);
    // System.out.println("m: " + m);

  }

}


