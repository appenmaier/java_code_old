package exercises.java;

import java.util.Optional;
import exercises.java.telephonebook.Person;
import exercises.java.telephonebook.TelephoneBook;
import exercises.java.telephonebook.TelephoneNumber;

public class Optionals02 {

  public static void main(String[] args) {

    TelephoneBook telephoneBook = new TelephoneBook();
    telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("075186253"));
    telephoneBook.addEntry(new Person("Peter Mueller"), new TelephoneNumber("0754462718"));
    telephoneBook.addEntry(new Person("Lisa Schmidt"), new TelephoneNumber("075190182"));

    Optional<TelephoneNumber> telephoneNumber =
        telephoneBook.getTelephoneNumberByName("Peter Mueller2");
    if (telephoneNumber.isPresent()) {
      System.out.println(telephoneNumber.get());
    } else {
      System.out.println("Es wurde keine Telefonnummer zum eingehenden Namen gefunden");
    }

    telephoneNumber = telephoneBook.getTelephoneNumberByName2("Peter Mueller2");
    telephoneNumber.ifPresentOrElse((t) -> System.out.println(t),
        () -> System.out.println("Es wurde keine Telefonnummer zum eingehenden Namen gefunden"));

  }

}
