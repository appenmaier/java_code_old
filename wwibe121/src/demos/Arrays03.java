package demos;

/**
 * Variable Argumentlisten
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Arrays03 {

	public static void main(String[] args) {

		printText("Hans");
		printText("Peter");
		printText("Lisa");

		String[] texts = { "Hans", "Peter", "Lisa" };
		printTexts(texts);

		printAllTexts("Hans");
		printAllTexts("Hans", "Peter");
		printAllTexts("Hans", "Peter", "Lisa", "Heidi");

	}

	public static void printText(String text) {
		System.out.println(text);
	}

	public static void printTexts(String[] texts) {
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}

	public static void printAllTexts(String... texts) {
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}

}
