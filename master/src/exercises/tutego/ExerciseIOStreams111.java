package exercises.tutego;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://tutego.de/javabuch/aufgaben/io_streams.html Aufgabe IOStreams-1.1.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseIOStreams111 {

	public static void main(String[] args) {

		String pathA = "src/resources/err.txt";
		String pathB = "src/resources/arr.txt";
		
		System.out.println(distance(pathA, pathB));
	
	}

	private static long distance(String path1, String path2) {
		File fileA = new File(path1);
		File fileB = new File(path2);

		long distance = 0;

		try (FileReader fileReaderA = new FileReader(fileA);
				BufferedReader bufferedReaderA = new BufferedReader(fileReaderA);
				FileReader fileReaderB = new FileReader(fileB);
				BufferedReader bufferedReaderB = new BufferedReader(fileReaderB)) {
			for (int i = 0; i < fileA.length(); i++) {
				if (bufferedReaderA.read() != bufferedReaderB.read()) {
					distance++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return distance;
	}

}
