package demos;

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

	public static void main(String[] args) {

		String text;

		/*
		 * Generische Programmierung ohne Java Generics
		 */
		Box box = new Box();
		box.setContent("Hallo Welt");

		Box box2 = new Box();
		box2.setContent(5);

		text = (String) box.getContent();
		text = (String) box2.getContent(); // Laufzeitfehler
		
		System.out.println(text);

		/*
		 * Generische Programmierung mit Java Generics
		 */
		GenericBox<String> genericBox = new GenericBox<>();
		genericBox.setContent("Hallo Welt");

		GenericBox<Integer> genericBox2 = new GenericBox<>();
		genericBox2.setContent(5);

		text = genericBox.getContent();
		// text = genericBox2.getContent(); // Kompilierungsfehler
		
		System.out.println(text);

	}

}
