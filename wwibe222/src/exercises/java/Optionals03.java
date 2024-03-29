package exercises.java;

import exercises.java.crate.BeerBottle;
import exercises.java.crate.Crate;

public class Optionals03 {

  public static void main(String[] args) {

    Crate<BeerBottle> crate = new Crate<>();
    crate.insertBottle(new BeerBottle(), 1);
    crate.insertBottle(new BeerBottle(), 2);
    crate.insertBottle(new BeerBottle(), 3);
    crate.insertBottle(new BeerBottle(), 5);
    crate.insertBottle(new BeerBottle(), 6);

    crate.takeBottle(3).ifPresent(t -> t.chugALug());

  }

}
