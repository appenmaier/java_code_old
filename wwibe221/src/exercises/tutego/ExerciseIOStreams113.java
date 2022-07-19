package exercises.tutego;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * https://tutego.de/javabuch/aufgaben/io_streams.html Aufgabe IOStreams-1.1.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseIOStreams113 {

	public static void main(String[] args) {

		File file = new File("C:\\Temp\\ExerciseIOStreams113.txt");
		String input = "72956";

		writeZielcode(input, file);

	}

	private static void writeZielcode(String input, File file) {
		try (FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			String output = "";
			for (int i = 0; i < input.length(); i++) {
				output += getCode(input.charAt(i)) + "  ";
			}
			bufferedWriter.write(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getCode(char value) {
		return switch (value) {
		case '0' -> "||||";
		case '1' -> "||| ";
		case '2' -> "|| |";
		case '3' -> "||  ";
		case '4' -> "| ||";
		case '5' -> "| | ";
		case '6' -> "|  |";
		case '7' -> " | |";
		case '8' -> " |||";
		case '9' -> " || ";
		default -> "???";
		};
	}

}
