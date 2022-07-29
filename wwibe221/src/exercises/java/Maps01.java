package exercises.java;

import exercises.java.telephonebook.v1.TelephoneBook;
import exercises.java.telephonebook.v1.TelephoneBook.Person;
import exercises.java.telephonebook.v1.TelephoneBook.TelephoneNumber;

/**
 * Uebungsaufgabe Maps01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Maps01 {

	public static void main(String[] args) {

		TelephoneBook telephoneBook = new TelephoneBook();

		telephoneBook.addEntry(new Person("Max Maier"),
				new TelephoneNumber(new int[] { 49 }, new int[] { 751 }, new int[] { 7832 }, new int[] { 45 }));
		telephoneBook.addEntry(new Person("Peter Mueller"),
				new TelephoneNumber(new int[] { 49 }, new int[] { 543 }, new int[] { 9972 }, new int[] { 0 }));
		telephoneBook.addEntry(new Person("Heidi Schmidt"),
				new TelephoneNumber(new int[] { 49 }, new int[] { 2091 }, new int[] { 1456 }, new int[] { 99 }));

		System.out.println(telephoneBook.getTelephoneNumberByName("Max Maier"));

	}

}
