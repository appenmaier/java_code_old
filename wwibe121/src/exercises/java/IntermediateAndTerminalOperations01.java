package exercises.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.Maker;
import helpers.VideoGameConsoles.VideoGameConsole;

/**
 * Uebungsaufgabe IntermediateAndTerminalOperations01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class IntermediateAndTerminalOperations01 {

	private static ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

	public static void main(String[] args) {

		a();
		b();
		System.out.println(c());
		System.out.println();
		System.out.println(d());
		System.out.println();
		e();
		f();
		System.out.println(g());
		System.out.println();
		h();
		i();

	}

	private static void a() {
		System.out.println(
				"die Namen aller Konsolen, die aktuell noch verkauft werden (PlayStation 4, Nintendo Switch, XBox One)");

		videoGameConsoles.stream().filter(c -> c.lifespan() == -1).map(c -> c.title()).forEach(System.out::println);

		System.out.println();
	}

	private static void b() {
		System.out.println(
				"alle Konsolen absteigend sortiert nach der Lebensspanne (VideoGameConsole[title=Nintendo Wii, maker=NINTENDO, lifespan=13, soldUnits=101.63]…)");

		videoGameConsoles.stream()
				.sorted((c1, c2) -> Integer.valueOf(c2.lifespan()).compareTo(c1.lifespan()))
				.forEach(System.out::println);

		System.out.println();
	}

	private static boolean c() {
		System.out.println(
				"die Antwort auf die Frage, ob es eine Konsole mit mehr als 150 Millionen verkauften Einheiten gibt (true)");

		return videoGameConsoles.stream().anyMatch(c -> c.soldUnitsInMillions() > 150);
	}

	private static boolean d() {
		System.out.println(
				"die Antwort auf die Frage, ob von allen Konsolen mehr als 50 Millionen Einheiten verkauft wurden (false)");

		return videoGameConsoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50);
	}

	private static void e() {
		System.out.println("die Anzahl der Konsolen von Nintendo (8)");

		System.out.println(videoGameConsoles.stream().filter(c -> c.maker().equals(Maker.NINTENDO)).count());

		System.out.println();
	}

	private static void f() {
		System.out.println(
				"die Namen aller Konsolen, die nicht mehr verkauft werden sowie die Anzahl verkaufter Einheiten pro Jahr in Millionen (PlayStation 2 (13.225)…)");

		videoGameConsoles.stream()
				.filter(c -> c.lifespan() != -1)
				.map(c -> c.title() + " (" + c.soldUnitsInMillions() / c.lifespan() + ")")
				.forEach(System.out::println);

		System.out.println();
	}

	private static OptionalDouble g() {
		System.out.println(
				"der Durchschnitt verkaufter Einheiten pro Jahr in Millionen aller Konsolen, die nicht mehr verkauft werden (OptionalDouble[9.900365412365412])");

		return videoGameConsoles.stream()
				.filter(c -> c.lifespan() != -1)
				.mapToDouble(c -> c.soldUnitsInMillions() / c.lifespan())
				.average();
	}

	private static void h() {
		System.out.println(
				"alle Konsolen gruppiert nach den Herstellern ({NINTENDO=[VideoGameConsole[title=Nintendo DS, maker=NINTENDO, lifespan=10, soldUnits=154.02],…})");

		Map<Maker, List<VideoGameConsole>> videoGameConsolesByMaker = videoGameConsoles.stream()
				.collect(Collectors.groupingBy(c -> c.maker()));
		System.out.println(videoGameConsolesByMaker);
	}

	private static void i() {
		System.out.println("die Anzahl verkaufter Einheiten pro Hersteller in Millionen (NINTENDO: 752.05)");

		videoGameConsoles.stream()
				.collect(Collectors.groupingBy(c -> c.maker()))
				.forEach((m, cs) -> System.out
						.println(m + ": " + cs.stream().mapToDouble(c -> c.soldUnitsInMillions()).sum()));
	}

}
