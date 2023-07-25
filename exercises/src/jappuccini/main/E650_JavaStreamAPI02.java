package jappuccini.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import jappuccini.model.FootballClub;
import jappuccini.model.Footballer;
import jappuccini.model.Footballers;
import jappuccini.model.Position;

/**
 * JavaStreamAPI02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E650_JavaStreamAPI02 {

  private static ArrayList<Footballer> footballers = Footballers.getFootballers();

  public static int a() {
    int x = footballers.stream()
        .filter(f -> f.position()
            .equals(Position.MIDFIELDER))
        .mapToInt(f -> f.numberOfGoals())
        .sum();

    return x;
  }

  public static Optional<Footballer> b() {
    Optional<Footballer> x = footballers.stream()
        .filter(f -> f.footballClub()
            .equals(new FootballClub("VfL Wolfsburg", 3, 1145)))
        .max((f1, f2) -> Integer.valueOf(f1.numberOfGames())
            .compareTo(f2.numberOfGames()));

    return x;
  }

  public static List<FootballClub> c() {
    List<FootballClub> x = footballers.stream()
        .map(f -> f.footballClub())
        .distinct()
        .toList();

    return x;
  }

  public static boolean d() {
    boolean x = footballers.stream()
        .anyMatch(f -> f.sizeInCm() < 170 && f.numberOfGoals() > 0);

    return x;
  }

  public static Map<Integer, List<Footballer>> e() {
    Map<Integer, List<Footballer>> x = footballers.stream()
        .collect(Collectors.groupingBy(f -> f.birthdate()
            .getYear()));

    return x;
  }

  public static OptionalDouble f() {
    OptionalDouble x = footballers.stream()
        .map(f -> f.footballClub())
        .distinct()
        .filter(fc -> fc.positionInAllTimeTable() != -1)
        .mapToInt(fc -> fc.pointsinAllTimeTable())
        .average();

    return x;
  }

  public static void main(String[] args) {
    System.out.println("Die Summe aller geschossener Tore von Mittelfeldspielerinnen: " + a());
    System.out.println();

    System.out.print("Der Name der Spielerin vom VfL Wolfsburg mit den meisten Spielen: ");
    b().ifPresentOrElse(f -> System.out.println(f.name()), () -> System.out.println("-"));
    System.out.println();

    System.out.println("Die Namen aller Vereine: ");
    c().forEach(c -> System.out.println(c.name()));
    System.out.println();

    System.out.println(
        "Die Antwort auf die Frage, ob es eine Spielerin gibt, die kleiner als 170cm ist und mindestens ein Tor geschossen hat: "
            + (d() ? "ja" : "nein"));
    System.out.println();

    System.out.println("Alle Spielerinnen gruppiert nach ihrem Geburtsjahr: ");
    e().forEach((y, fs) -> System.out.println(y + ": " + fs));
    System.out.println();

    System.out.print(
        "Die durchschnittliche Punktzahl in der ewigen Tabelle aller Bundesligamannschaften: ");
    f().ifPresentOrElse(System.out::println, () -> System.out.println("-"));
    System.out.println();
  }

}
