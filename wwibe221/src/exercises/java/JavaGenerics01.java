package exercises.java;

import exercises.java.crate.v1.BeerBottle;
import exercises.java.crate.v1.Crate;
import exercises.java.crate.v1.CrateIndexOutOfBoundsException;
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

		try {
			crate.insertBottle(new BeerBottle(), 1);
			crate.insertBottle(new BeerBottle(), 2);
			crate.insertBottle(new BeerBottle(), 3);
			crate.insertBottle(new WineBottle(), 4);
			crate.insertBottle(new WineBottle(), 5);
			crate.insertBottle(new WineBottle(), 6);

			if (crate.takeBottle(3) instanceof BeerBottle beerBottle) {
				beerBottle.chugALug();
			}
		} catch (CrateIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

	}

}
