package exercises.java;

import java.util.ArrayList;
import java.util.Optional;

import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.Maker;
import helpers.VideoGameConsoles.VideoGameConsole;

/**
 * Uebungsaufgabe Optional01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Optional01 {

	public static void main(String[] args) {

		ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

		Optional<VideoGameConsole> console = videoGameConsoles.stream()
				.filter(c -> c.maker().equals(Maker.NINTENDO))
				.filter(c -> c.soldUnitsInMillions() > 100)
				.findAny();

//		if (console.isPresent()) {
//			System.out.println(console.get());
//		} else {
//			System.out.println("Keine entsprechende Konsole gefunden");
//		}

		console.ifPresentOrElse(System.out::println, () -> System.out.println("Keine entsprechende Konsole gefunden"));

	}
}
