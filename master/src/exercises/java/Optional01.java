package exercises.java;

import java.util.ArrayList;
import java.util.Optional;

import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.VideoGameConsole;

public class Optional01 {

	public static void main(String[] args) {

		ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

		Optional<VideoGameConsole> videoGameConsoleFromNintendo = videoGameConsoles.stream()
				.filter(v -> v.maker().equals(VideoGameConsoles.Maker.NINTENDO))
				.filter(v -> v.soldUnits() > 100)
				.findAny();

		videoGameConsoleFromNintendo.ifPresentOrElse(System.out::println,
				() -> System.out.println("Es konnte keine entsprechende Konsole ermittelt werden"));

	}

}
