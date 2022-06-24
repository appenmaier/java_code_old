package exercises.java;

/**
 * Uebungsaufgabe JAVA-02
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise02 {

	public static void main(String[] args) {
		String name = "Daniel";
		int age = 40;
		char gender = 'M';

		Exercise02.printPersonData("Daniel", 40, 'M');
		Exercise02.printPersonData(name, age, gender);
	}

	public static void printPersonData(String name, int age, char gender) {
		System.out.println("Name: " + name);
		System.out.println("Alter: " + age);
		System.out.println("Geschlecht: " + gender);
	}

}