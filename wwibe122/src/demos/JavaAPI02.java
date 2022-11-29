package demos;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Wichtige Klassen der Java API
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaAPI02 {

  public static void main(String[] args) {

    /* Zeichenkettenverarbeitung */
    String text = "Hans;Peter;Lisa";
    String[] names = text.split(";");
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    /* Wrapper-Klassen */
    String numberText = "4";
    int number = Integer.valueOf(numberText);
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(number);

    /* Datums- und Zeitangaben */
    long timeInMillis = System.currentTimeMillis();
    System.out.println("timeInMillis: " + timeInMillis);

    LocalDateTime now = LocalDateTime.now();
    System.out.println("now: " + now);
    System.out.println("dayOfYear: " + now.getDayOfYear());
  }

}
