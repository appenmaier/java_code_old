package exercises.java;

import exercises.java.telephonebook.Person;
import exercises.java.telephonebook.TelephoneBook;
import exercises.java.telephonebook.TelephoneNumber;

public class Maps01 {

  public static void main(String[] args) {

    TelephoneBook telephoneBook = new TelephoneBook();

    telephoneBook.addEntry(new Person("Max Maier"), new TelephoneNumber("12345"));
    telephoneBook.addEntry(new Person("Peter Mueller"), new TelephoneNumber("67890"));
    telephoneBook.addEntry(new Person("Max Maier"), new TelephoneNumber("54321"));

    System.out.println(telephoneBook.getTelephoneNumberByName("Max Maier"));
    System.out.println(telephoneBook.getTelephoneNumberByName("Lisa Schmid"));

  }

}
