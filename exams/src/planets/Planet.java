package planets;

import java.util.ArrayList;

/**
 * Planet
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Planet(String name, double diameter, double mass, int moons, Type type) {

  public static ArrayList<Planet> getPlanets() {
    ArrayList<Planet> planets = new ArrayList<>();

    planets.add(new Planet("Merkur", 1220, 0.33, 0, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Venus", 3025, 4.86, 0, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Erde", 3189, 5.97, 1, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Mars", 1689, 0.64, 2, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Jupiter", 35746, 1898.7, 79, Type.GAS_PLANET));
    planets.add(new Planet("Saturn", 30134, 568.51, 82, Type.GAS_PLANET));
    planets.add(new Planet("Uranus", 13000, 86.849, 27, Type.GAS_PLANET));
    planets.add(new Planet("Neptun", 12382, 102.44, 14, Type.GAS_PLANET));

    return planets;
  }

}
