package demos;

import demos.person.Person;

/**
 * Die Mutter aller Klassen / die Object-Methoden
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaAPI06 {

  public static void main(String[] args) {

    Person person1 = new Person("Hans", 42, 'm');
    Person person2 = new Person("Peter", 18, 'd');
    Person person3 = new Person("Peter", 18, 'd');

    System.out.println(person1);

    System.out.println(person2 == person3);
    System.out.println(person2.equals(person3));

    System.out.println(person2.hashCode());
    System.out.println(person3.hashCode());

    System.out.println(System.identityHashCode(person2));
    System.out.println(System.identityHashCode(person3));

  }

}
