package exercises.java;

import exercises.java.crate.v1.BeerBottle;
import exercises.java.crate.v1.Crate;
import exercises.java.crate.v1.WineBottle;

/**
 * Uebungsaufgabe JavaGenerics01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaGenerics01 {

	public static void main(String[] args) {

		Crate crate = new Crate();

		crate.insertBottle(new BeerBottle(), 1);
		crate.insertBottle(new WineBottle(), 2);
		crate.insertBottle(new WineBottle(), 3);
		crate.insertBottle(new BeerBottle(), 4);
		crate.insertBottle(new BeerBottle(), 5);
		crate.insertBottle(new BeerBottle(), 6);

		if (crate.takeBottle(4) instanceof BeerBottle) {
			BeerBottle beerBottle = (BeerBottle) crate.takeBottle(4);
			beerBottle.chugALug();
		}

	}

}
