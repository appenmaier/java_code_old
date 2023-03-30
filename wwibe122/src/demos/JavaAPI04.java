package demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import demos.person.Person;

/**
 * Arbeiten mit Dateien
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaAPI04 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Person> persons = new ArrayList<>();

    File file = new File("C:\\Temp\\persons.txt");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");
      String name = tokens[0];
      int age = Integer.valueOf(tokens[1]);
      char gender = tokens[2].charAt(0);
      Person p = new Person(name, age, gender);
      persons.add(p);
    }

    for (int i = 0; i < persons.size(); i++) {
      System.out.println(persons.get(i).toString());
    }

    scanner.close();

  }

}
