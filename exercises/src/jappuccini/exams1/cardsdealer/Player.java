package jappuccini.exams1.cardsdealer;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Spieler
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

  private final ArrayList<Card> cards;

  public Player() {
    cards = new ArrayList<>();
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public ArrayList<Card> cards() {
    return cards;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Player other = (Player) obj;
    return Objects.equals(cards, other.cards);
  }

  public ArrayList<Card> getCardsByColour(String colour) {
    ArrayList<Card> cardsByColour = new ArrayList<>();

    for (Card c : cards) {
      if (c.colour()
          .equals(colour)) {
        cardsByColour.add(c);
      }
    }

    return cardsByColour;
  }

  public Card getCardWithHighestValue() {
    Card cardWithHighestValue = null;
    int highestValue = 0;

    for (Card c : cards) {
      if (c.value() > highestValue) {
        highestValue = c.value();
        cardWithHighestValue = c;
      }
    }

    return cardWithHighestValue;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards);
  }

  @Override
  public String toString() {
    return "Player [cards=" + cards + "]";
  }

}

