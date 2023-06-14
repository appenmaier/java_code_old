package jappuccini.main;

import jappuccini.model.Person;
import jappuccini.model.TelephoneBook;
import jappuccini.model.TelephoneNumber;

public class Optionals02 {

  public static void main(String[] args) {

    TelephoneBook telephoneBook = new TelephoneBook();
    telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("0751 86253"));
    telephoneBook.addEntry(new Person("Peter Mueller"), new TelephoneNumber("07544 62718"));
    telephoneBook.addEntry(new Person("Lisa Schmidt"), new TelephoneNumber("0751 90182"));

    telephoneBook.getTelephoneNumberByName("Peter Mueller").ifPresentOrElse(System.out::println,
        () -> System.out.println("Die gesuchte Telefonnummer ist nicht vorhanden"));

  }

}
