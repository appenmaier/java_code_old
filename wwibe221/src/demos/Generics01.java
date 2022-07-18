package demos;

import java.util.ArrayList;

import helpers.Box;
import helpers.GenericBox;

/**
 * Generische Programmierung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Generics01 {

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public static void main(String[] args) {

		/*
		 * Generische Programmierung ohne Java Generics
		 */
		Box box1 = new Box();
		box1.setContent("Hallo Welt"); // Upcast

		if (box1.getContent() instanceof Integer) {
			int number = (Integer) box1.getContent(); // Downcast
		}

		ArrayList objects = new ArrayList<>();
		objects.add("Hallo Welt");
		objects.add(6);
		objects.add(4.4);

		/*
		 * Generische Programmierung mit Java Generics
		 */
		GenericBox<String> genericBox1 = new GenericBox<>();
		GenericBox<Integer> genericBox2 = new GenericBox<>();

		genericBox1.setContent("Hallo Welt");
		genericBox2.setContent(5);

		String text = genericBox1.getContent();
		int number = genericBox2.getContent();

		/*
		 * Inferenz
		 */
		int[] numbers = new int[5];
		ArrayList<String> texts = new ArrayList<String>();
		ArrayList<String> texts2 = new ArrayList<>(); // Inferenz

		/*
		 * Namenskonventionen bei formalen Typparametern
		 */
		// ArrayList<E>: Date Element (E)
		// GenericBox<T>: Type (T)
		// GenericSixPack<T, U, V, W, X, Y>: Type (T, U,...)
		// TreeMap<K, V>: Key (K), V (Value)

	}

}
