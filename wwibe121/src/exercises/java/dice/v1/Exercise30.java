package exercises.java.dice.v1;

/**
 * Uebungsaufgabe JAVA-30
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise30 {

	public static void main(String[] args) {

		Dice dice = new Dice(1);

		System.out.println("ID - Wuerfelwert");
		for (int i = 1; i <= 5; i++) {
			dice.rollTheDice();
			System.out.println(dice.getId() + " - " + dice.getValue());
		}

	}

}
