package exercises.java;

import java.util.ArrayList;

import exercises.java.skat.v1.SkatCard;
import exercises.java.skat.v1.SkatCardDeck;

/**
 * Uebungsaufgabe JAVA-45
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ClassDiagrams05 {

	public static void main(String[] args) {

		SkatCardDeck skatCardDeck = new SkatCardDeck();
		skatCardDeck.shuffleSkatCards();
		ArrayList<SkatCard> skatCards = skatCardDeck.getSkatCards();
		for (SkatCard skatCard : skatCards) {
			System.out.println(skatCard.getCardDescription());
		}

	}

}