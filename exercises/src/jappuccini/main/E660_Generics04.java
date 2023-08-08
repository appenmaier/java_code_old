package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.Club;
import jappuccini.model.Tournament;

/**
 * Generics04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E660_Generics04 {

  public static void main(String[] args) {

    Tournament tournament = new Tournament("Football Cup", new ArrayList<>(), new ArrayList<>());

    tournament.addTeam(new Club("SC Freiburg", 165));
    tournament.addTeam(new Club("VfL Wolfsburg", 225));
    tournament.addTeam(new Club("Bayern Muenchen", 926));
    tournament.addTeam(new Club("Borussia Dortmund", 462));
    tournament.addTeam(new Club("Union Berlin", 185));

    tournament.pairs().forEach(System.out::println);

  }

}
