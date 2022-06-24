package exercises.java.skat.v1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Kartendeck (Skat)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class SkatCardDeck {

	/*
	 * Attribute
	 */
	private ArrayList<SkatCard> skatCards;

	/*
	 * Konstruktoren
	 */
	public SkatCardDeck() {
		skatCards = new ArrayList<>();
		for (SkatCardColor color : SkatCardColor.values()) {
			for (SkatCardValue value : SkatCardValue.values()) {
				skatCards.add(new SkatCard(color, value));
			}
		}
	}

	/*
	 * Setter und Getter
	 */
	public ArrayList<SkatCard> getSkatCards() {
		return skatCards;
	}

	/*
	 * Methoden
	 */
	public void shuffleSkatCards() {
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			Integer index = random.nextInt(skatCards.size());
			SkatCard skatCard = skatCards.get(index);
			skatCards.remove(skatCard);
			skatCards.add(skatCard);
		}
	}

}
