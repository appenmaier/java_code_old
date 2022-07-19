package exercises.java.barrel.v1;

public class BarrelOverflowException extends Exception {

	private static final long serialVersionUID = 1L;

	public BarrelOverflowException() {
		super("Das war der Tropfen, der das Fass zum Ueberlaufen gebracht hat");
	}

}
