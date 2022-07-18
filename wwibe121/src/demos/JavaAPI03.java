package demos;

import java.awt.Color;

import demos.tablelamp.v4.LightBulb;
import demos.tablelamp.v4.PlugType;
import demos.tablelamp.v4.TableLamp;

/**
 * Aufzaehlungen und Datenklassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class JavaAPI03 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Color.RED);

		// PlugType plugTypeF = new PlugType("Typ-F (Schukostecker)", "CEE 7/4",
		// "Europa");
		// PlugType plugTypeF2 = new PlugType("Type-F", "CEE 7/4", "Europe");

		TableLamp tableLamp = new TableLamp(PlugType.TYPE_F, redLightBulb);

		tableLamp.print();

	}

}
