package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.java.telephonebook.v1.TelephoneBook;
import exercises.java.telephonebook.v1.TelephoneBook.Person;
import exercises.java.telephonebook.v1.TelephoneBook.TelephoneNumber;

/**
 * Testklasse fuer TelephoneBook
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TelephoneBookTest {

	private static TelephoneBook telephoneBook;

	@BeforeEach
	void setUp() {
		telephoneBook = new TelephoneBook();
		telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("+49 7510 954123"));
	}

	@Test
	void testAddEntry() {
		telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("+49 55241 09852"));
		assertEquals("+49 55241 09852", telephoneBook.getTelephoneNumberByName("Hans Maier").value());
	}

	@Test
	void testGetTelephoneNumberByName1() {
		assertEquals("+49 7510 954123", telephoneBook.getTelephoneNumberByName("Hans Maier").value());
	}

	@Test
	void testGetTelephoneNumberByName2() {
		assertEquals(null, telephoneBook.getTelephoneNumberByName("Peter Mueller"));
	}

}
