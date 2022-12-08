package exercises.java.company.v1;

import java.util.ArrayList;

/**
 * Unternehmen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Company {

  /* Attribute */
  private String name;
  private ArrayList<Employee> employees;
  private int numberOfEmployees;

  /* Methoden */
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
