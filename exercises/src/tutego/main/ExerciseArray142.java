package tutego.main;

/**
 * https://tutego.de/javabuch/aufgaben/array.html Aufgabe Array-1.4.2
 * 
 * Hinweis: ohne Fehlerbehandlung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseArray142 {

  private static boolean allTrue(boolean... booleans) {
    for (int i = 0; i < booleans.length; i++) {
      if (!booleans[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    // boolean isTrue = allTrue(true, false, true);
    // boolean isTrue = allTrue(false, true);
    // boolean isTrue = allTrue(true);
    boolean isTrue = allTrue(true, true, true, true);
    System.out.println("isTrue: " + isTrue);

  }

}
