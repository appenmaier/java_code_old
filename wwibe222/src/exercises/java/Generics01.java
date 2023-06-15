package exercises.java;

import exercises.java.crate.BeerBottle;
import exercises.java.crate.Crate;
import exercises.java.crate.WineBottle;

public class Generics01 {

  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void main(String[] args) {

    Crate crate = new Crate();
    crate.insertBottle(new BeerBottle(), 3);
    crate.insertBottle(new BeerBottle(), 4);
    crate.insertBottle(new WineBottle(), 5);
    crate.insertBottle(new WineBottle(), 2);

    /* outdated */
    // if (crate.takeBottle(3) instanceof BeerBottle) {
    // BeerBottle beerBottle = (BeerBottle) crate.takeBottle(3);
    // beerBottle.chugALug();
    // }

  }

}
