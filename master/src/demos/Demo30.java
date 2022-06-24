package demos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Wichtige Klassen der Java API
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo30 {

	public static void main(String[] args) {

		/*
		 * Zeichenkettenverarbeitung (String)
		 */
		String text = "Hans;Peter;Lisa";
		String[] tokens = text.split(";");
		for (String token : tokens) {
			System.out.println(token);
		}

		/*
		 * Konsoleneingaben (Scanner)
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("input: " + input);

		/*
		 * Mathematischen Berechnungen (Math)
		 */
		int a = 5, b = 3;
		double c;
		c = Math.max(a, b) + Math.pow(a, b) + Math.PI;
		System.out.println("c: " + c);

		/*
		 * Pseudozufallszahlen (Random)
		 */
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("randomNumber: " + randomNumber);

		/*
		 * Wrapper-Klassen (Byte, Short, Integer, Long, Float, Double, Character,
		 * Boolean)
		 */
		int int1 = Integer.valueOf("5");
		boolean boolean1 = Boolean.valueOf("true");
		byte byte1 = -123;
		int int2 = Byte.toUnsignedInt(byte1);
		System.out.println("int1: " + int1);
		System.out.println("boolean1: " + boolean1);
		System.out.println("byte1: " + byte1);
		System.out.println("int2: " + int2);

		/*
		 * Laufzeitmessungen (System)
		 */
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println(Math.random());
		}
		long end = System.currentTimeMillis();
		long difference = end - start;
		System.out.println("difference: " + difference);

		/*
		 * Zeit- und Datumsfunktionen (LocalDateTime)
		 */
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);
		System.out.println("dayofWeek: " + now.getDayOfWeek());
		System.out.println("dayofMonth: " + now.getDayOfMonth());
		System.out.println("dayofYear: " + now.getDayOfYear());

		/*
		 * Erzeugen und Arbeiten mit Listen (ArrayList<E>, List<E>, Arrays, Collections)
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("Hans");
		list1.add("Peter");
		list1.add("Lisa");

		String[] array = { "Hans", "Peter", "Lisa" };
		List<String> list2 = Arrays.asList(array);

		List<String> list3 = List.of("Hans", "Peter", "Lisa");

		System.out.println(list1.toString());
		System.out.println(list2.toString());
		System.out.println(list3.toString());

		list1.set(2, "Max");
		list1.add("Heidi");
		list1.remove(0);

		list2.set(2, "Max");
		// list2.add("Heidi");
		// list2.remove(0);

		// list3.set(2, "Max");
		// list3.add("Heidi");
		// list3.remove(0);

		String max = Collections.max(list2);
		System.out.println("max: " + max);

		Collections.sort(list1);
		System.out.println(list1.toString());

	}

}
