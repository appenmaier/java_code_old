package exercises.java.barrel;

@SuppressWarnings("serial")
public class BarrelOverflowException extends Exception {

  public BarrelOverflowException() {
    super("Das war der Tropfen, der das Fass zum Überlaufen gebracht hat");
  }

}
