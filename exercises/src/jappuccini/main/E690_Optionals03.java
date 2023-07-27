package jappuccini.main;

import jappuccini.model.BeerBottle;
import jappuccini.model.Crate;

/**
 * Optionals03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E690_Optionals03 {

  public static void main(String[] args) {

    Crate<BeerBottle> crate = new Crate<>();
    crate.insertBottle(new BeerBottle(), 2);
    crate.insertBottle(new BeerBottle(), 3);
    crate.insertBottle(new BeerBottle(), 4);

    crate.takeBottle(3).ifPresentOrElse(b -> b.chugALug(),
        () -> System.out.println("Die gesuchte Flasche ist nicht vorhanden"));

  }

}
