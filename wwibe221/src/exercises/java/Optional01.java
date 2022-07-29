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

		Optional<VideoGameConsole> nintendoConsoleWithMin100 = videoGameConsoles.stream()
				.filter(c -> c.soldUnitsInMillions() > 100)
				.filter(c -> c.maker().equals(Maker.NINTENDO))
				.findFirst();

//		if (nintendoConsoleWithMin100.isPresent()) {
//			System.out.println(nintendoConsoleWithMin100.get());
//		} else {
//			System.out.println("Keine entsprechende Konsole gefunden");
//		}

		nintendoConsoleWithMin100.ifPresentOrElse(System.out::println,
				() -> System.out.println("Keine entsprechende Konsole gefunden"));
	}

}
