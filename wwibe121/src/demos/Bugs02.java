package demos;

import java.awt.Color;

import demos.tablelamp.v10.AlreadyPluggedInException;
import demos.tablelamp.v10.LightBulb;
import demos.tablelamp.v10.PlugType;
import demos.tablelamp.v10.TableLamp;

/**
 * Ausnahmen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Bugs02 {

	public static void main(String[] args) {

		TableLamp tableLamp = new TableLamp(PlugType.TYPE_F, new LightBulb(Color.RED));

		try {
			tableLamp.plugIn();
			tableLamp.plugIn();
		} catch (AlreadyPluggedInException e) {
			System.err.println(e.getMessage());
		}

	}

}
