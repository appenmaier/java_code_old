package jappuccini.model;

import java.util.List;

/**
 * Turnier
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Tournament(String title, List<Club> teams, List<Pair<Club>> pairs) {

  public void addTeam(Club team) {
    teams.add(team);
  }

  public List<Pair<Club>> pairs() {
    for (int i = 0; i < teams.size(); i++) {
      for (int j = 0; j < teams.size(); j++) {
        if (i != j) {
          pairs.add(new Pair<Club>(teams.get(i), teams.get(j)));
        }
      }
    }

    return pairs;
  }

}
