package demos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * Switch-Ausdruecke, die Klasse Random und die Klasse LocalDateTime
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava102 {

  public static void main(String[] args) {

    LocalDateTime now = LocalDateTime.now();

    System.out.println("Jahr: " + now.getYear());
    System.out.println("Monat: " + now.getMonthValue());
    System.out.println("Tag: " + now.getDayOfMonth());
    System.out.println("Tag im Jahr: " + now.getDayOfYear());

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      int month = random.nextInt(12) + 1;
      LocalDate date = LocalDate.of(2023, month, 1);

      String season;
      // switch (month) {
      // case 12:
      // case 1:
      // case 2:
      // season = "Winter";
      // break;
      // case 3:
      // case 4:
      // case 5:
      // season = "Fruehling";
      // break;
      // case 6:
      // case 7:
      // case 8:
      // season = "Sommer";
      // case 9:
      // case 10:
      // case 11:
      // season = "Herbst";
      // break;
      // default:
      // season = "";
      // break;
      // }

      season = switch (month) {
        case 12, 1, 2 -> "Winter";
        case 3, 4, 5 -> "Fruehling";
        case 6, 7, 8 -> "Sommer";
        case 9, 10, 11 -> "Herbst";
        default -> "";
      };

      if (month == 12 || month == 1 || month == 2) {
        season = "Winter";
      } else if (month == 3 || month == 4 || month == 5) {
        season = "Fruehling";
      } else if (month == 6 || month == 7 || month == 8) {
        season = "Sommer";
      } else {
        season = "Herbst";
      }

      season = (month == 12 || month == 1 || month == 2) ? "Winter" : "Nicht Winter";

      System.out.println(date.getMonth() + ": " + season);

    }

  }

}
