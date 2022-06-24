package exercises.tutego;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.6.6
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ166 {

	public static void main(String[] args) {

		int flamethrowerPrice = 500;
		int flameExtinguisherPrice = 200;

		System.out.println("<html>");
		System.out.println("<table>");
		System.out.println("<tr><th>Quantity</th><th>Flamethower</th><th>Flame extinguisher</th></tr>");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("<tr><td>%d</td><td>%d</td><td>%d</td></tr>%n", i, (i * flamethrowerPrice),
					(i * flameExtinguisherPrice));
		}
		System.out.println("</table>");
		System.out.println("</html>");

	}

}
