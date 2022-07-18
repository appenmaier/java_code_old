package demos;

/**
 * Variable Datenobjekte
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class DataObjects01 {

	public static void main(String[] args) {

		/*
		 * Deklaration variabler Datenobjekte
		 */
		int i;
		String name, firstNameAndFamilyName; // Kamelschreibweise
		boolean isHappy;

		/*
		 * Initialisierung variabler Datenobjekte
		 */
		i = 5;
		name = "Hans";
		firstNameAndFamilyName = "Lisa Maier";
		isHappy = false;
		@SuppressWarnings("unused")
		char gender = 'M';

		System.out.println("i: " + i);
		int temp = i;
		i = 0;

		System.out.println("i: " + i);
		System.out.println("temp: " + temp);
		System.out.println("name: " + name);
		System.out.println("firstNameAndFamilyName: " + firstNameAndFamilyName);
		System.out.println("isHappy: " + isHappy);

		/*
		 * ab Java 10
		 */
		// int j = 4;
		var j = 4;
		// j = "Lisa";
		System.out.println("j: " + j);

	}

}