package exercises.java;

import exercises.java.crate.BeerBottle;
import exercises.java.crate.Crate;

public class Generics02 {

  public static void main(String[] args) {

    Crate<BeerBottle> crate = new Crate<>();
    crate.insertBottle(new BeerBottle(), 1);
    crate.insertBottle(new BeerBottle(), 2);
    crate.insertBottle(new BeerBottle(), 3);
    crate.insertBottle(new BeerBottle(), 5);
    crate.insertBottle(new BeerBottle(), 6);

    /* Outdated */
    // BeerBottle beerBottle = crate.takeBottle(3);
    // beerBottle.chugALug();

  }

}
