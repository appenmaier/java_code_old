package exercises.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.Maker;
import helpers.VideoGameConsoles.VideoGameConsole;

public class IntermediateAndTerminalOperations01 {

	public static void main(String[] args) {

		ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

		System.out.println("Aufgabenteil a:");
		videoGameConsoles.stream().filter(v -> v.lifespan() < 0).map(v -> v.title()).forEach(System.out::println);

		System.out.println();
		System.out.println("Aufgabenteil b:");
		videoGameConsoles.stream()
				.sorted((v1, v2) -> Integer.valueOf(v2.lifespan()).compareTo(Integer.valueOf(v1.lifespan())))
				.forEach(System.out::println);

		System.out.println();
		System.out.println("Aufgabenteil c:");
		System.out.println(videoGameConsoles.stream().anyMatch(v -> v.soldUnits() > 150));

		System.out.println();
		System.out.println("Aufgabenteil d:");
		System.out.println(videoGameConsoles.stream().allMatch(v -> v.soldUnits() > 50));
		
		System.out.println();
		System.out.println("Aufgabenteil e:");
		System.out.println(videoGameConsoles.stream().filter(v -> v.maker().equals(Maker.NINTENDO)).count());

		System.out.println();
		System.out.println("Aufgabenteil f:");
		videoGameConsoles.stream().filter(v -> v.lifespan() > 0)
				.map(v -> v.title() + " (" + v.soldUnits() / v.lifespan() + ")").forEach(System.out::println);

		System.out.println();
		System.out.println("Aufgabenteil g:");
		System.out.println(videoGameConsoles.stream().filter(v -> v.lifespan() > 0)
				.mapToDouble(v -> v.soldUnits() / v.lifespan()).average());

		System.out.println();
		System.out.println("Aufgabenteil h:");
		Map<Maker, List<VideoGameConsole>> makers = videoGameConsoles.stream()
				.collect(Collectors.groupingBy(v -> v.maker()));
		System.out.println(makers);

		System.out.println();
		System.out.println("Aufgabenteil i:");
		videoGameConsoles.stream().collect(Collectors.groupingBy(v -> v.maker()))
				.forEach((t, u) -> System.out.println(t + ": " + u.stream().mapToDouble(v -> v.soldUnits()).sum()));

	}

}
