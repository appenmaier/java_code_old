package jappuccini.exams2.legobrick;

/**
 * Lego
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Lego {

  private final int id;

  public Lego(int id) {
    this.id = id;
  }

  public int id() {
    return id;
  }

}

