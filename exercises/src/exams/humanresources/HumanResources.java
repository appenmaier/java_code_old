package exams.humanresources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Personalverwaltung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record HumanResources(HashMap<TelephoneNumber, Person> telephoneNumbers,
    ArrayList<Person> staff) {

  public void addTelephoneNumber(TelephoneNumber telephoneNumber, Person person) {
    telephoneNumbers.put(telephoneNumber, person);
  }

  public void addPerson(Person person) throws DuplicateException {
    for (Person p : staff) {
      if (p.equals(person)) {
        throw new DuplicateException();
      }
    }
    staff.add(person);
  }

  public ArrayList<TelephoneNumber> getTelephoneNumbersByPersonId(int id) {
    ArrayList<TelephoneNumber> numbers = new ArrayList<>();
    for (Entry<TelephoneNumber, Person> entry : telephoneNumbers.entrySet()) {
      if (entry.getValue().id() == id) {
        numbers.add(entry.getKey());
      }
    }
    return numbers;
  }

}
