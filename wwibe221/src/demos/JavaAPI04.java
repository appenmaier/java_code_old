package demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Arbeiten mit Dateien
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class JavaAPI04 {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * relevante Systemeigenschaften
		 */
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("fileSeparator: " + fileSeparator);
		String userWorkDirectory = System.getProperty("user.dir");
		System.out.println("userWorkDirectory: " + userWorkDirectory);
		String userHomeDirectory = System.getProperty("user.home");
		System.out.println("userHomeDirectory: " + userHomeDirectory);

		/*
		 * Pfadangaben
		 */
//		File file = new File("C:\\Temp\\persons.txt");
//		File file = new File(userWorkDirectory + "\\src\\resources\\persons.txt");

//		 File file = new File("../../../../Temp/persons.txt");
		File file = new File("src/resources/persons.txt");

		if (file.exists()) {
			System.out.println(true);
		}

		/*
		 * Zeichenbasiertes Lesen von Dateien
		 */
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			String[] tokens = line.split(";");
			for (String token : tokens) {
				System.out.println(token);
			}
			String name = tokens[0];
			int age = Integer.valueOf(tokens[1]);
			char gender = tokens[2].charAt(0);
			boolean isCool = Boolean.valueOf(tokens[3]);
			System.out.println(name + " - " + age + " - " + gender + " - " + isCool);
		}

		sc.close();

	}

}
