package demos;

/**
 * Zeichenketten
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class DataObjects05 {

	public static void main(String[] args) {

		// Grundlegende Methoden
		String text = "Hallo Welt";

		char char1 = text.charAt(0);
		char char7 = text.charAt(6);

		int length = text.length();

		System.out.println("char1: " + char1);
		System.out.println("char7: " + char7);
		System.out.println("length: " + length);

		// Escape-Sequenzen
		String text1 = "Unicodezeichen: \u0041";
		String text2 = "Umgedrehter Schraegstrich: \\";
		String text3 = "Anfuehrungszeichen: \"Text\"";
		String text4 = "Zeilenumbruch: \nText";
		String text5 = "Tabulator: \tText";

		System.out.println("text1: " + text1);
		System.out.println("text2: " + text2);
		System.out.println("text3: " + text3);
		System.out.println("text4: " + text4);
		System.out.println("text5: " + text5);

		// bis Java 15
		String text7 = "<html>\n\t<body>\n\t\t<p>\n\t\t\t" + "Hallo Welt" + "\n\t\t</p>\n\t</body>\n</html>";

		System.out.println(text7);

		// ab Java 15
		String text8 = """
				<html>
					<body>
						<p>
							Hallo Welt
						</p>
					</body>
				</html>""";

		System.out.println(text8);

	}

}