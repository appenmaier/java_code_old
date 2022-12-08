package exercises.java.skat.v1;

import java.util.ArrayList;

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
