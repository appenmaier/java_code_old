package exercises.java.company;

public class SalaryDecreaseException extends Exception {

  private static final long serialVersionUID = 1L;

  public SalaryDecreaseException() {
    super("Gehaltsverminderung");
  }

}
