package exercises.java;

import java.util.Optional;
import exercises.java.telephonebook.Person;
import exercises.java.telephonebook.TelephoneBook;
import exercises.java.telephonebook.TelephoneNumber;

public class Optionals02 {

  public static void main(String[] args) {

    TelephoneBook telephoneBook = new TelephoneBook();

    telephoneBook.addEntry(new Person("Max Maier"), new TelephoneNumber("12345"));
    telephoneBook.addEntry(new Person("Peter Mueller"), new TelephoneNumber("67890"));
    telephoneBook.addEntry(new Person("Max Maier"), new TelephoneNumber("54321"));

    Optional<TelephoneNumber> telephoneNumberOfMax =
        telephoneBook.getTelephoneNumberByName("Max Maier");
    Optional<TelephoneNumber> telephoneNumberOfLisa =
        telephoneBook.getTelephoneNumberByName("Lisa Schmid");

    telephoneNumberOfMax.ifPresentOrElse(System.out::println,
        () -> System.out.println("Keine Telefonnummer gefunden"));

    if (telephoneNumberOfLisa.isPresent()) {
      System.out.println(telephoneNumberOfLisa.get());
    } else {
      System.out.println("Keine Telefonnummer gefunden");
    }

  }

}
