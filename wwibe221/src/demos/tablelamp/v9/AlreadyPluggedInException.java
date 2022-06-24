package demos.tablelamp.v9;

/**
 * AlreadyPluggedInException
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
@SuppressWarnings("serial")
public class AlreadyPluggedInException extends Exception {

	/*
	 * Konstruktoren
	 */
	public AlreadyPluggedInException() {
		super("Das Geraet wurde bereits eingesteckt");
	}

	public AlreadyPluggedInException(String s) {
		super(s);
	}

}
