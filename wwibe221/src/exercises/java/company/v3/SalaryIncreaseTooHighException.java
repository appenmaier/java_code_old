package exercises.java.company.v3;

public class SalaryIncreaseTooHighException extends Exception {

	private static final long serialVersionUID = 1L;

	public SalaryIncreaseTooHighException() {
		super("Die Gehaltserhoehung ueberschreitet 10%");
	}

}
