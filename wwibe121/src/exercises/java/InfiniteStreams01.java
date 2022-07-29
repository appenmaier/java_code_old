package exercises.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.VideoGameConsole;

/**
 * Uebungsaufgabe InfiniteStreams01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class InfiniteStreams01 {

	public static void main(String[] args) {

		ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

		Stream.generate(() -> videoGameConsoles.get(new Random().nextInt(videoGameConsoles.size())))
				.distinct()
				.limit(10)
				.sorted((c1, c2) -> c1.title().compareTo(c2.title()))
				.forEach(System.out::println);

	}

}
