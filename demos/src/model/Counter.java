package model;

/**
 * Zaehler
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Counter {

  private int counter;

  public void decreaseCounter() {
    counter--;
  }

  public int getCounter() {
    return counter;
  }

  public void increaseCounter() {
    counter++;
  }

}
