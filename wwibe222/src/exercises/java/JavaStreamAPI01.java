package exercises.java;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import helpers.VideoGameConsoleQueries;
import helpers.VideoGameConsoles.Maker;
import helpers.VideoGameConsoles.VideoGameConsole;

public class JavaStreamAPI01 {

  public static void main(String[] args) {

    VideoGameConsoleQueries.getAllCurrentConsoleNames().forEach(System.out::println);
    System.out.println();

    VideoGameConsoleQueries.getAllConsolesSortedByLifespan().forEach(System.out::println);
    System.out.println();

    System.out.println(VideoGameConsoleQueries.isAnyConsoleWithMoreThan150MillionSoldUnits());
    System.out.println();

    System.out.println(VideoGameConsoleQueries.isAllConsolesWithMoreThan50MillionSoldUnits());
    System.out.println();

    System.out.println(VideoGameConsoleQueries.getNumberOfConsolesFromNintendo());
    System.out.println();

    VideoGameConsoleQueries.getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles()
        .forEach(System.out::println);
    System.out.println();

    OptionalDouble averageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles =
        VideoGameConsoleQueries.getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles();
    averageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles.ifPresentOrElse(System.out::println,
        () -> System.out.println("Der Wert konnte nicht berechnet werden"));
    System.out.println();

    Map<Maker, List<VideoGameConsole>> allConsolesByMaker =
        VideoGameConsoleQueries.getAllConsolesByMaker();
    for (Entry<Maker, List<VideoGameConsole>> entry : allConsolesByMaker.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    System.out.println();

    Map<Maker, Double> totalSoldUnitsInMillionsPerMaker =
        VideoGameConsoleQueries.getTotalSoldUnitsInMillionsPerMaker();
    for (Entry<Maker, Double> entry : totalSoldUnitsInMillionsPerMaker.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

  }

}
