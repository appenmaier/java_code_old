package main;

import model.VideoGame;
import model.VideoGameConsole;

/**
 * Aufzaehlungen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D710_BestOfJavaI02 {

  public static void main(String[] args) {

    VideoGame totk = new VideoGame("The Legend of Zelda - Tears of the Kingdom",
        VideoGameConsole.SWITCH, "2023", 9.6);

    System.out.println(totk.title() + " (" + totk.console()
        .description() + ")");
    System.out.println();

    for (VideoGameConsole g : VideoGameConsole.values()) {
      System.out.println(g.ordinal() + " - " + g.name() + " - " + g.description());
    }

  }

}
