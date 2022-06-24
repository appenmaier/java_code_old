package exercises.java.dice.v1;

/**
 * Uebungsaufgabe JAVA-41
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise41 {

	public static void main(String[] args) {

		Player player1 = new Player("Hans");
		Player player2 = new Player("Lisa");

		Dice dice1 = new Dice(1);
		Dice dice2 = new Dice(2);

		dice1.rollTheDice();
		System.out.println(player1.getName() + " wuerfelt eine " + dice1.getValue());
		dice2.rollTheDice();
		System.out.println(player2.getName() + " wuerfelt eine " + dice2.getValue());

		if (dice1.getValue() > dice2.getValue()) {
			System.out.println(player1.getName() + " gewinnt");
		} else if (dice1.getValue() < dice2.getValue()) {
			System.out.println(player2.getName() + " gewinnt");
		} else {
			System.out.println("Unentschieden");
		}

	}

}
