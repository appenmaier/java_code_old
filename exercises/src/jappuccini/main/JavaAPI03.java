package jappuccini.main;

import java.time.LocalDateTime;
import java.util.Scanner;

public class JavaAPI03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte ein Datum ein (dd.mm.yyyy): ");
    String input = sc.next();

    int day = Integer.valueOf(input.substring(0, 2));
    int month = Integer.valueOf(input.substring(3, 5));
    int year = Integer.valueOf(input.substring(6, 10));

    LocalDateTime inputDate = LocalDateTime.of(year, month, day, 0, 0, 0);
    int dayOfInputDate = inputDate.getDayOfYear();
    LocalDateTime christmasDate = LocalDateTime.of(year, 12, 24, 0, 0, 0);
    int dayOfChristmasDate = christmasDate.getDayOfYear();

    System.out.println("Wochentag: " + inputDate.getDayOfWeek());
    if (dayOfInputDate > dayOfChristmasDate) {
      System.out.println("Tage bis Weihnachten: " + (dayOfInputDate - dayOfChristmasDate));
    } else {
      System.out.println("Tage bis Weihnachten: " + (dayOfChristmasDate - dayOfInputDate));
    }

  }

}
