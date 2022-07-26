package demos;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class X {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Hans", 'm'), new Person("Lisa", 'w'));
		persons.stream().peek(p -> p.name = p.name.toLowerCase()).forEach(System.out::println);

		Stream.generate(() -> persons.get(new Random().nextInt(persons.size()))).limit(3).forEach(System.out::println);

	}

	public static class Person {
		String name;
		char gender;

		public Person(String name, char gender) {
			this.name = name;
			this.gender = gender;
		}

		public String toString() {
			return name + " " + gender;
		}
	}

}
