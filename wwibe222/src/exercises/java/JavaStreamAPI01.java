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
    return consoles.stream().anyMatch(c -> c.soldUnits() > 150);
  }

  private static boolean d() {
    return consoles.stream().allMatch(c -> c.soldUnits() > 50);
  }

  private static long e() {
    return consoles.stream().filter(c -> c.maker().equals(Maker.NINTENDO)).count();
  }

  private static List<String> f() {
    return consoles.stream().filter(c -> c.lifespan() != -1)
        .map(c -> c.title() + " (" + c.soldUnits() / c.lifespan() + ")")
        .collect(Collectors.toList());
  }

  private static OptionalDouble g() {
    return consoles.stream().filter(c -> c.lifespan() != -1)
        .mapToDouble(c -> c.soldUnits() / c.lifespan()).average();
  }

  private static Map<Maker, List<VideoGameConsole>> h() {
    return consoles.stream().collect(Collectors.groupingBy(c -> c.maker()));
  }

  private static void i() {
    consoles.stream().collect(Collectors.groupingBy(c -> c.maker())).forEach((m, cs) -> System.out
        .println(m + ": " + cs.stream().mapToDouble(c -> c.soldUnits()).sum()));
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
    g().ifPresentOrElse(System.out::println,
        () -> System.out.println("Der Durchschnitt konnte nicht berechnet werden"));
    System.out.println();
    Map<Maker, List<VideoGameConsole>> consolesByMaker = h();
    for (Entry<Maker, List<VideoGameConsole>> entry : consolesByMaker.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    System.out.println();
    h().forEach((m, cs) -> System.out.println(m + ": " + cs));
    System.out.println();
    i();

  }

}
