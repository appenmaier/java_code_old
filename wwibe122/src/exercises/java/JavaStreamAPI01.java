package exercises.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import helpers.VideoGameConsoles;
import helpers.VideoGameConsoles.Maker;
import helpers.VideoGameConsoles.VideoGameConsole;

public class JavaStreamAPI01 {

  private static ArrayList<VideoGameConsole> consoles = VideoGameConsoles.getVideoGameConsoles();

  private static void a() {
    consoles.stream().filter(c -> c.lifespan() == -1).map(c -> c.title())
        .forEach(System.out::println);
    System.out.println();
  }

  private static void b() {
    consoles.stream().sorted((c1, c2) -> Integer.valueOf(c2.lifespan()).compareTo(c1.lifespan()))
        .forEach(System.out::println);
    System.out.println();
  }

  private static boolean c() {
    boolean tmp = consoles.stream().anyMatch(c -> c.soldUnits() > 150);
    return tmp;
  }

  private static boolean d() {
    boolean tmp = consoles.stream().allMatch(c -> c.soldUnits() > 50);
    return tmp;
  }

  private static long e() {
    long tmp = consoles.stream().filter(c -> c.maker().equals(Maker.NINTENDO)).count();
    return tmp;
  }

  private static List<String> f() {
    List<String> tmp = consoles.stream().filter(c -> c.lifespan() != -1)
        .map(c -> c.title() + " (" + c.soldUnits() / c.lifespan() + ")")
        .collect(Collectors.toList());
    return tmp;
  }

  private static OptionalDouble g() {
    OptionalDouble tmp = consoles.stream().filter(c -> c.lifespan() != -1)
        .mapToDouble(c -> c.soldUnits() / c.lifespan()).average();
    return tmp;
  }

  private static Map<Maker, List<VideoGameConsole>> h() {
    Map<Maker, List<VideoGameConsole>> tmp =
        consoles.stream().collect(Collectors.groupingBy(c -> c.maker()));
    return tmp;
  }

  public static void main(String[] args) {

    a();
    b();
    System.out.println(c());
    System.out.println();
    System.out.println(d());
    System.out.println();
    System.out.println(e());
    System.out.println();
    System.out.println(f());
    System.out.println();
    g().ifPresentOrElse(s -> System.out.println(s),
        () -> System.out.println("Wert konnte nicht berechnet werden"));
    System.out.println();
    for (Entry<Maker, List<VideoGameConsole>> entry : h().entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

  }

}
