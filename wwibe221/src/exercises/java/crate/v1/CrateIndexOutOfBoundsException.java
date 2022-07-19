package exercises.java.crate.v1;

public class CrateIndexOutOfBoundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public CrateIndexOutOfBoundsException() {
		super("Der angegebene Index befindet sich ausserhalb der Grenzen");
	}

}
