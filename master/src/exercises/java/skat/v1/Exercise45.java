package exercises.java.skat.v1;

import java.util.ArrayList;

/**
 * Uebungsaufgabe JAVA-45
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise45 {

	public static void main(String[] args) {

		SkatCardDeck skatCardDeck = new SkatCardDeck();
		skatCardDeck.shuffleSkatCards();
		ArrayList<SkatCard> skatCards = skatCardDeck.getSkatCards();
		for (SkatCard skatCard : skatCards) {
			System.out.println(skatCard.getCardDescription());
		}

	}

}