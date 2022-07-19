package exercises.java;

import exercises.java.crate.v2.BeerBottle;
import exercises.java.crate.v2.Crate;
import exercises.java.crate.v2.CrateIndexOutOfBoundsException;

/**
 * Uebungsaufgabe Variance01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Variance01 {

	public static void main(String[] args) {

		Crate<BeerBottle> crate = new Crate<>();

		try {
			crate.insertBottle(new BeerBottle(), 1);
			crate.insertBottle(new BeerBottle(), 2);
			crate.insertBottle(new BeerBottle(), 3);
			crate.insertBottle(new BeerBottle(), 4);
			crate.insertBottle(new BeerBottle(), 5);
			crate.insertBottle(new BeerBottle(), 6);

			BeerBottle beerbottle = crate.takeBottle(4);
			beerbottle.chugALug();
		} catch (CrateIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

	}

}
