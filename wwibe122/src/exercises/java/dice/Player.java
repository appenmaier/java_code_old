package exercises.java.dice;

/**
 * Spieler
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Player {

  private String name;
  private int score;
  private boolean isActive;
  private boolean specialAvailable;

  public Player(String name) {
    this.name = name;
    isActive = true;
    specialAvailable = true;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public boolean getSpecialAvailable() {
    return specialAvailable;
  }

  public boolean isActiv() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void setSpecialAvailable(boolean specialAvailable) {
    this.specialAvailable = specialAvailable;
  }

}
