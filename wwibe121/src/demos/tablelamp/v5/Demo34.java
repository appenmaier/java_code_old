package demos.tablelamp.v5;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Downcast
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo34 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Color.RED);
		LightBulb whiteLightBulb = new LightBulb(Color.WHITE);

		TableLamp tableLamp1 = new TableLamp(PlugType.TYPE_F, redLightBulb);
		TableLamp tableLamp2 = new TableLamp(PlugType.TYPE_I, redLightBulb);
		TableLamp tableLamp3 = new TableLamp(PlugType.TYPE_F, whiteLightBulb);

		FlashLight flashLight1 = new FlashLight();
		FlashLight flashLight2 = new FlashLight();

		ArrayList<Light> lights = new ArrayList<>();
		lights.add(tableLamp1);
		lights.add(tableLamp2);
		lights.add(tableLamp3);
		lights.add(flashLight1);
		lights.add(flashLight2);

		for (Light l : lights) {
			l.switchOn();
			// l.plugIn();
			// bis Java 16
			if (l instanceof TableLamp) {
				TableLamp t = (TableLamp) l; // Downcast
				t.plugIn();
			}
			// ab Java 16
			if (l instanceof TableLamp t) { // Downcast
				t.plugIn();
			}
			l.print();
			l.switchOff();
		}

	}

}
