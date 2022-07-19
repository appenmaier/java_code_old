package exercises.java.company.v3;

import java.util.ArrayList;

/**
 * Unternehmen
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Company {

	/*
	 * Attribute
	 */
	private String name;
	private ArrayList<Employee> employees;
	private int numberOfEmployees;

	/*
	 * Konstruktoren
	 */
	public Company(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	/*
	 * Methoden
	 */
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

	/*
	 * Innere Klassen
	 */
	/**
	 * Mitarbeiter
	 * 
	 * @author Daniel Appenmaier
	 * @version 2.0
	 */
	public class Employee {

		/*
		 * Attribute
		 */
		private int employeeId;
		private Person person;
		private int salary;

		/*
		 * Konstruktoren
		 */
		public Employee(int employeeId, Person person, int salary) {
			this.employeeId = employeeId;
			this.person = person;
			this.salary = salary;
		}

		/*
		 * Setter und Getter
		 */
		public int getEmployeeId() {
			return employeeId;
		}

		public String getName() {
			return person.getName();
		}

		public void setSalary(int salary) throws SalaryDecreaseException, SalaryIncreaseTooHighException {
			if (salary < this.salary) {
				throw new SalaryDecreaseException();
			}

			double increase = (double) (salary - this.salary) / this.salary;
			if (increase > 0.1) {
				throw new SalaryIncreaseTooHighException();
			}

			this.salary = salary;
		}

		/*
		 * Methoden
		 */
		public void print() {
			System.out.println(employeeId + " - " + getName() + " - " + salary + " Euro");
		}

	}

}
