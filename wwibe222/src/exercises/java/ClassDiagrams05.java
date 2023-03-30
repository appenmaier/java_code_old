package exercises.java;

import java.util.ArrayList;
import exercises.java.skat.SkatCard;
import exercises.java.skat.SkatCardDeck;

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
