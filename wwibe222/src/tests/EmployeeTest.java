package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exercises.java.company.Company;
import exercises.java.company.Company.Employee;
import exercises.java.company.Person;
import exercises.java.company.SalaryDecreaseException;
import exercises.java.company.SalaryIncreaseTooHighException;


/**
 * EmployeeTest
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class EmployeeTest {

  private static Company company;
  private static Employee employee;

  @BeforeEach
  void setUp() {
    company = new Company("Maier GmbH");
    employee = company.new Employee(1, new Person("Max Schmid"), 50000);
  }

  @Test
  void testSetSalary1() throws SalaryDecreaseException, SalaryIncreaseTooHighException {
    employee.setSalary(55000);
    assertEquals(55000, employee.getSalary());
  }

  @Test
  void testSetSalary2() {
    assertThrows(SalaryDecreaseException.class, () -> employee.setSalary(49999));
  }

  @Test
  void testSetSalary3() {
    assertThrows(SalaryIncreaseTooHighException.class, () -> employee.setSalary(55001));
  }

}
