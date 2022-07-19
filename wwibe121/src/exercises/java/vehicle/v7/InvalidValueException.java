package exercises.java.vehicle.v7;

public class InvalidValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidValueException() {
		super("Ungueltiger Wert: der eingehende Wert muss groesser als Null sein");
	}

}
