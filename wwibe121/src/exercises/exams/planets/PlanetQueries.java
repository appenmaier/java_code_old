package exercises.exams.planets;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PlanetQueries {

  public static void main(String[] args) {

    Planet.getPlanets().stream().filter(p -> p.moons() > 5)
        .map(p -> p.name() + " (" + p.diameter() + ", " + p.mass() + "): " + p.moons())
        .forEach(System.out::println);
    System.out.println();

    OptionalDouble averageDiameter = Planet.getPlanets().stream()
        .filter(p -> p.type().equals(Type.GAS_PLANET)).mapToDouble(p -> p.diameter()).average();
    System.out.println(averageDiameter);
    System.out.println();

    List<Planet> planets = Planet.getPlanets().stream()
        .sorted((p1, p2) -> Double.valueOf(p2.mass()).compareTo(p1.mass()))
        .collect(Collectors.toList());
    planets.forEach(System.out::println);
    System.out.println();

    boolean allMatch = Planet.getPlanets().stream().allMatch(p -> p.moons() > 0);
    System.out.println(allMatch);
    System.out.println();

    Map<Type, List<Planet>> planetsByType =
        Planet.getPlanets().stream().collect(Collectors.groupingBy(p -> p.type()));
    for (Entry<Type, List<Planet>> entry : planetsByType.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

  }

}

