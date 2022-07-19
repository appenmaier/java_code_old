package exercises.java.company.v2;

public class SalaryIncreaseTooHighException extends Exception {

	private static final long serialVersionUID = 1L;

	public SalaryIncreaseTooHighException() {
		super("Das neue Gehalt darf maximal 10% ueber dem bisherigen Gehalt liegen");
	}

}
