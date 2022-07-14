package demos.tablelamp.v10;

import java.awt.Color;

/**
 * Ausnahmen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo40 {

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
