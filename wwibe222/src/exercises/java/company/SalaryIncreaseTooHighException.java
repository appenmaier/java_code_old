package exercises.java.company;

public class SalaryIncreaseTooHighException extends Exception {

  private static final long serialVersionUID = 1L;

  public SalaryIncreaseTooHighException() {
    super("Die Gehaltserhoehung ueberschreitet 10%");
  }

}
