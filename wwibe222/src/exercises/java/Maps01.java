package exercises.java;

import exercises.java.telephonebook.Person;
import exercises.java.telephonebook.TelephoneBook;
import exercises.java.telephonebook.TelephoneNumber;

public class Maps01 {

  public static void main(String[] args) {

    TelephoneBook telephoneBook = new TelephoneBook();
    telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("075186253"));
    telephoneBook.addEntry(new Person("Peter Mueller"), new TelephoneNumber("0754462718"));
    telephoneBook.addEntry(new Person("Lisa Schmidt"), new TelephoneNumber("075190182"));

    System.out.println(telephoneBook.getTelephoneNumberByName("Peter Mueller"));
    System.out.println(telephoneBook.getTelephoneNumberByName2("Peter Mueller"));

  }

}
