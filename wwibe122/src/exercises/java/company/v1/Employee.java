package exercises.java.company.v1;

/**
 * Mitarbeiter
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Employee {

  /* Attribute */
  private int employeeId;
  private Person person;
  private int salary;

  /* Methoden */
  public Employee(int employeeId, Person person, int salary) {
    this.employeeId = employeeId;
    this.person = person;
    this.salary = salary;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return person.getName();
  }

  public int getSalary() {
    return salary;
  }

  public void print() {
    System.out.println(employeeId + " - " + getName() + " - " + salary + "�");
  }

}
