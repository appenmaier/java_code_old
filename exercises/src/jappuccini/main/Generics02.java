package jappuccini.main;

import jappuccini.model.BeerBottle;
import jappuccini.model.Crate;

public class Generics02 {

  public static void main(String[] args) {

    Crate<BeerBottle> crate = new Crate<>();
    crate.insertBottle(new BeerBottle(), 2);
    crate.insertBottle(new BeerBottle(), 3);
    crate.insertBottle(new BeerBottle(), 4);

    /* version 1.0: BeerBottle beerBottle = crate.takeBottle(3); beerBottle.chugALug(); */

  }

}
