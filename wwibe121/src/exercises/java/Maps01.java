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

		telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber(new int[] { 82736452 }));
		telephoneBook.addEntry(new Person("Peter Mueller"), new TelephoneNumber(new int[] { 82736452 }));
		telephoneBook.addEntry(new Person("Lisa Schmidt"), new TelephoneNumber(new int[] { 82736452 }));
		
		System.out.println(telephoneBook.getTelephoneNumberByName("Hansi Maier"));

	}

}
