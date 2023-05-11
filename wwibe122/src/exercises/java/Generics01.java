package exercises.java;

import exercises.java.crate.BeerBottle;
import exercises.java.crate.Crate;
import exercises.java.crate.WineBottle;

public class Generics01 {

  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void main(String[] args) {

    Crate crate = new Crate();
    crate.insertBottle(new BeerBottle(), 1);
    crate.insertBottle(new WineBottle(), 2);
    crate.insertBottle(new WineBottle(), 3);
    crate.insertBottle(new BeerBottle(), 5);
    crate.insertBottle(new BeerBottle(), 6);

    BeerBottle beerBottle = (BeerBottle) crate.takeBottle(3);
    beerBottle.chugALug();

  }

}
