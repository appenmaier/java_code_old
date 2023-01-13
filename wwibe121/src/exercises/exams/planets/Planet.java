package exercises.exams.planets;

import java.util.ArrayList;

public record Planet(String name, double diameter, double mass, int moons, Type type) {

  public static ArrayList<Planet> getPlanets() {
    ArrayList<Planet> planets = new ArrayList<>();

    planets.add(new Planet("Erde", 40, 20, 1, Type.DWARF_PLANET));
    planets.add(new Planet("Mars", 30, 2, 3, Type.DWARF_PLANET));
    planets.add(new Planet("Neptun", 445, 200, 5, Type.GAS_PLANET));
    planets.add(new Planet("Saturn", 400, 250, 18, Type.GAS_PLANET));
    planets.add(new Planet("Merkur", 27, 5, 1, Type.DWARF_PLANET));
    planets.add(new Planet("Pluto", 4, 300, 1, Type.GAS_PLANET));

    return planets;
  }

}
