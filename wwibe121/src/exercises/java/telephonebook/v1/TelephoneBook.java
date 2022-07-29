package exercises.java.telephonebook.v1;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Telefonbuch
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class TelephoneBook {

	/*
	 * Attribute
	 */
	private HashMap<Person, TelephoneNumber> entries = new HashMap<>();

	/*
	 * Methoden
	 */
	public void addEntry(Person person, TelephoneNumber telephoneNumber) {
		entries.put(person, telephoneNumber);
	}

	public TelephoneNumber getTelephoneNumberByName(String name) {
		for (Entry<Person, TelephoneNumber> entry : entries.entrySet()) {
			if (entry.getKey().name().equals(name)) {
				return entry.getValue();
			}
		}
		return null;
	}

	/*
	 * Innere Klassen
	 */
	public record Person(String name) {
	}

	public record TelephoneNumber(int[] digits) {
	}

}
