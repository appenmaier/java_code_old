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
public class Demo41 {

	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {

		/*
		 * Generische Programmierung ohne Java Generics
		 */
		Box box1 = new Box();
		Box box2 = new Box();

		box1.setContent("Hallo Welt");
		box2.setContent(6);

		if (box1.getContent() instanceof Integer) {
			int number = (int) box1.getContent();
		}

		ArrayList objects = new ArrayList<>();
		objects.add("Hallo Welt");
		objects.add(7);
		objects.add(6.6);
		objects.add(new Box());

		/*
		 * Generische Programmierung mit Java Generics
		 */
		GenericBox<String> stringBox = new GenericBox<>();
		GenericBox<Integer> integerBox = new GenericBox<>();

		stringBox.setContent("Hallo Welt");
		integerBox.setContent(6);

		int number = integerBox.getContent();

		/*
		 * Inferenz
		 */
		String[] texts = new String[4];
		ArrayList<String> texts2 = new ArrayList<>(); // Inferenz

		/*
		 * Namenskonventionen
		 */
		// ArrayList<E>: Data Element (E)
		// GenericBox<T>: Type (T)
		// GenericSixPack<T, U, V, W, X, Y>: Type (T, U,...)
		// HashMap<K, V>: Key (K), V (Value)

	}

}
