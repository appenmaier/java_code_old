package exercises.tutego;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.4.6
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ146 {

	public static void main(String[] args) {

		@SuppressWarnings({ "resource", "unused" })
		int month = new java.util.Scanner(System.in).nextInt();
		@SuppressWarnings("resource")
		int year = new java.util.Scanner(System.in).nextInt();
		@SuppressWarnings("unused")
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		// int days = switch (month) {
		// case 2 -> isLeapYear ? 29 : 28;
		// case 4, 6, 9, 11 -> 30;
		// default -> 31;
		// };

	}

}
