package exercises.tutego;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * https://tutego.de/javabuch/aufgaben/io_streams.html Aufgabe IOStreams-1.1.4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseIOStreams114 {

	public static void main(String[] args) {

		String inputPath = "src/resources/err.txt";
		String outputPath = "C:\\Temp\\ExerciseIOStreams114.txt";

		convertFileToLowerCase(inputPath, outputPath);

	}

	private static void convertFileToLowerCase(String inputPath, String outputPath) {
		File inputFile = new File(inputPath);
		File outputFile = new File(outputPath);

		try (FileReader fileReader = new FileReader(inputFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				FileWriter fileWriter = new FileWriter(outputFile);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line.toLowerCase());
				bufferedWriter.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
