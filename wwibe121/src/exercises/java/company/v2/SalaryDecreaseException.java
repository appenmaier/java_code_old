package exercises.java.company.v2;

public class SalaryDecreaseException extends Exception {

	private static final long serialVersionUID = 1L;

	public SalaryDecreaseException() {
		super("Das neue Gehalt muss hoeher sein als das bisherige");
	}

}
