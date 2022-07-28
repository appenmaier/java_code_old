package exercises.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.VideoGameConsole;

public class InfiniteStreams01 {

	public static void main(String[] args) {

		ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

		Stream.generate(() -> videoGameConsoles.get(new Random().nextInt(videoGameConsoles.size())))
				.distinct()
				.limit(10)
				.sorted((v1, v2) -> v1.title().compareTo(v2.title()))
				.forEach(System.out::println);

	}

}
