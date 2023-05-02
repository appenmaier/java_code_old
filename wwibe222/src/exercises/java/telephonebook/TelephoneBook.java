package exercises.java.telephonebook;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Telefonbuch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TelephoneBook {

  private HashMap<Person, TelephoneNumber> entries = new HashMap<>();

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

  public TelephoneNumber getTelephoneNumberByName2(String name) {
    return entries.get(new Person(name));
  }

}
