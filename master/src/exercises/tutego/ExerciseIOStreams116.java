package exercises.tutego;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * https://tutego.de/javabuch/aufgaben/io_streams.html Aufgabe IOStreams-1.1.6
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseIOStreams116 {

	public static void main(String[] args) {

		int numberOfBytes = 144; // 1474560;
		String inputPath = "src/resources/input"; // args[0];
		String fileExtension = ".txt"; // args[1];
		String outputPath = "C:\\Temp\\ExerciseIOStreams116.txt";
		File inputFile = new File(inputPath + fileExtension);

		try (FileInputStream fileInputStream = new FileInputStream(inputFile);
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
			byte[] bytes;
			for (int counter = 0; (bytes = fileInputStream.readNBytes(numberOfBytes)).length > 0; counter++) {
				File outputFile = new File(outputPath + counter + fileExtension);
				try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
						BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
					bufferedOutputStream.write(bytes);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
