package helpers;

/**
 * Drucker
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Printer {

	/**
	 * Gibt die Zeichenkette "Hallo Welt" auf der Konsole aus
	 */
	public static void printHelloWorld() {
		System.out.println("Hallo Welt");
	}

	/**
	 * Gibt den eingehenden Text auf der Konsole aus
	 *
	 * @param text Text
	 */
	public static void printText(String text) {
		System.out.println(text);
	}

	/**
	 * Gibt einen Weihnachtsbaum auf der Konsole aus
	 *
	 * @param height Hoehe des Weihnachtsbaums
	 */
	public static void printChristmasTree(int height) {
		int width = height * 2 - 1;

		// Krone
		for (int i = 1; i <= width; i += 2) {
			int blanks = width - i;
			for (int j = 1; j <= blanks / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= blanks / 2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		// Stamm
		for (int i = 1; i <= width / 2; i++) {
			System.out.print(" ");
		}
		System.out.print("#");
	}

	/**
	 * Gibt ein Rechteck aus Rauten auf der Konsole aus
	 * 
	 * @param width  Breite
	 * @param height Hoehe
	 */
	public static void printRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	/**
	 * Gibt ein Muster auf der Konsole aus
	 * 
	 * @param numberOfCharacters Anzahl Zeichen
	 */
	public static void printPattern(int numberOfCharacters) {
		for (int i = 0; i < numberOfCharacters / 4; i++) {
			System.out.print(".:|:");
		}
		switch (numberOfCharacters % 4) {
		case 1:
			System.out.print(".");
			break;
		case 2:
			System.out.print(".:");
			break;
		case 3:
			System.out.print(".:|");
			break;
		}
		System.out.println();
	}

	/**
	 * Gibt ein Muster mit Text auf der Konsole aus
	 * 
	 * @param text Zeichenkette
	 */
	public static void printPatternWithText(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(".:" + text.charAt(i) + ":");
		}
		System.out.println(".");
	}

	/**
	 * Gibt eine Fahne auf der Konsole aus
	 *
	 * @param height Hoehe der Fahne
	 */
	public static void printBanner(int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	/**
	 * Gibt ein Schachbrett auf der Konsole aus
	 * 
	 * @param width  Breite des Schachbretts
	 * @param height Hoehe des Schachbretts
	 */
	public static void printCheckerBoard(int width, int height) {
		for (int i = 0; i < height; i++) {
			if (i % 2 == 0) {
				printCheckerBoardLine(width, " _ #");
			} else {
				printCheckerBoardLine(width, " # _");
			}
			System.out.println();
		}
	}

	private static void printCheckerBoardLine(int width, String token) {
		if (width % 2 == 0) {
			for (int i = 0; i < width; i += 2) {
				System.out.print(token);
			}
		} else {
			for (int i = 0; i < width / 2; i++) {
				System.out.print(token);
			}
			System.out.print(" " + token.charAt(1));
		}
	}

	/**
	 * Gibt eine Zeile von 10 Herzen auf der Konsole aus
	 */
	public static void printLineOfHearts() {
		System.out.println("\u2764\u2764\u2764\u2764\u2764\u2764\u2764\u2764\u2764\u2764");
	}

	/**
	 * Gibt einen Weihnachtsbaum mit Schmuck auf der Konsole aus
	 *
	 * @param width     Breite des Weihnachtsbaums
	 * @param frequenzy Hauefigkeit des Schmucks
	 */
	public static void printChristmasTreeWithOrnaments(int width, double frequenzy) {
		for (int i = 1; i <= width; i += 2) {
			int blanks = width - i;
			for (int j = 1; j <= blanks / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j > 1 && j < i && Math.random() < frequenzy) {
					System.out.print("o");
				} else {
					System.out.print("*");
				}
			}
			for (int j = 1; j <= blanks / 2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	/**
	 * Gibt ein Fischmuster auf der Konsole aus
	 * 
	 * @param repetitions Wiederholungen
	 */
	public static void printFishPattern(int repetitions) {
		for (int i = 0; i < repetitions; i++) {
			for (int j = 0; j < repetitions; j++) {
				System.out.print("><>  ");
			}
			for (int j = 0; j < repetitions; j++) {
				System.out.print("<><  ");
			}
			System.out.println();
		}
	}

	/**
	 * Gibt eine gestrichelte Linie auf der Konsole aus
	 * 
	 * @param length Laenge der gestrichelte Linie
	 */
	public static void printLine(int length) {
		printLine(length, '-');
	}

	/**
	 * Gibt eine Linie bestehend aus einem eingehenen Zeichen auf der Konsole aus
	 * 
	 * @param length Laenge der Linie
	 * @param c      Zeichen
	 */
	public static void printLine(int length, char c) {
		printLine("", length, c, "");
	}

	/**
	 * Gibt eine Linie bestehend aus einem eingehenen Zeichen auf der Konsole aus.
	 * Die Linie ist von einem eingehenden Prefix und einem eingehenden Suffix
	 * umschlossen
	 * 
	 * @param prefix Prefix
	 * @param length Laenge der Linie
	 * @param c      Zeichen
	 * @param suffix Suffix
	 */
	public static void printLine(String prefix, int length, char c, String suffix) {
		System.out.print(prefix);
		for (int i = 0; i < length; i++) {
			System.out.print(c);
		}
		System.out.println(suffix);
	}

	/**
	 * Gibt eine Weihnachtsbaumkrone auf der Konsole aus
	 *
	 * @param height Hoehe der Weihnachtsbaumkrone
	 */
	public static void printChristmasTreeCrown(int height) {
		int width = height * 2 - 1;

		for (int i = 1; i <= width; i += 2) {
			int blanks = width - i;
			for (int j = 1; j <= blanks / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			for (int j = 1; j <= blanks / 2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	/**
	 * Gibt einen Weihnachtsbaumstamm auf der Konsole aus
	 *
	 * @param height Hoehe des Weihnachtsbaumstammes
	 * @param width  Breites des Weihnachtsbaumstammes
	 * @param gap    Abstand
	 */
	public static void printChristmasTreeStem(int height, int width, int gap) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= gap; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	/**
	 * Gibt eine Bergkette auf der Konsole aus
	 * 
	 * @param altitudes Hoehenmeter
	 */
	public static void printMountain(int[] altitudes) {
		int maxAltitude = altitudes[0];

		for (int altitude : altitudes) {
			if (altitude > maxAltitude) {
				maxAltitude = altitude;
			}
		}

		for (int i = maxAltitude; i >= 0; i--) {
			for (int altitude : altitudes) {
				System.out.print(altitude == i ? "*" : " ");
			}
			System.out.println();
		}
	}

}