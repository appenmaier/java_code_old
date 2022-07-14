package demos.tablelamp.v10;

public class AlreadyPluggedInException extends Exception {

	private static final long serialVersionUID = 1L;

	public AlreadyPluggedInException() {
		super("Die Tischleuchte ist bereits eingesteckt");
	}

	public AlreadyPluggedInException(String message) {
		super(message);
	}

}
