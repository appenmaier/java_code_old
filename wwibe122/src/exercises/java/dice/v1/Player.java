package exercises.java.dice.v1;

/**
 * Spieler
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Player {

  /* Attribute */
  private String name;
  private int score;
  private boolean isActive;

  /* Methoden */
  public Player(String name) {
    this.name = name;
    isActive = true;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public boolean isActiv() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

}
