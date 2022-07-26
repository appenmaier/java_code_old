package demos;

import java.util.Arrays;
import java.util.List;

/**
 * Spaehen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaStreamAPI04 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Hans", 'm'), new Person("Lisa", 'w'),
				new Person("Peter", 'm'));

//		persons.stream().filter(p -> p.gender == 'm').map(p -> {
//			p.gender = 'w';
//			return p;
//		}).forEach(System.out::println);

		persons.stream().filter(p -> p.gender == 'm').peek(p -> p.gender = 'w').forEach(System.out::println);

	}

	public static class Person {
		public String name;
		public char gender;

		public Person(String name, char gender) {
			this.name = name;
			this.gender = gender;
		}

		public String toString() {
			return name + " - " + gender;
		}
	}

}
