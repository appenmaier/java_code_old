package exercises.java.company;

import java.util.ArrayList;

/**
 * Unternehmen
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Company {

  public class Employee {

    private int employeeId;
    private Person person;
    private int salary;

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
      System.out.println(employeeId + " - " + getName() + " - " + salary + " Euro");
    }

    public void setSalary(int salary)
        throws SalaryDecreaseException, SalaryIncreaseTooHighException {
      if (salary < this.salary) {
        throw new SalaryDecreaseException();
      }

      if (this.salary * 1.1 < salary) {
        throw new SalaryIncreaseTooHighException();
      }

      this.salary = salary;
    }

  }

  private String name;
  private ArrayList<Employee> employees;

  private int numberOfEmployees;

  public Company(String name) {
    this.name = name;
    employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
    numberOfEmployees++;
  }

  public void print() {
    System.out.println(name + " (" + numberOfEmployees + " Mitarbeiter)");
    for (Employee e : employees) {
      e.print();
    }
  }

}
