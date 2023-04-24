package demos.tableLamp;

public class AlreadyPluggedInException extends Exception {

  private static final long serialVersionUID = 1L;

  public AlreadyPluggedInException() {
    super("Der Geraet ist bereits eingesteckt");
  }

}
