package demos.tablelamp.v5;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Vererbung, Upcast und Polymorphie
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo33 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Color.RED);
		LightBulb whiteLightBulb = new LightBulb(Color.WHITE);

		TableLamp tableLamp1 = new TableLamp(PlugType.TYPE_F, redLightBulb);
		TableLamp tableLamp2 = new TableLamp(PlugType.TYPE_I, redLightBulb);
		TableLamp tableLamp3 = new TableLamp(PlugType.TYPE_F, whiteLightBulb);

		FlashLight flashLight1 = new FlashLight();
		FlashLight flashLight2 = new FlashLight();

		/*
		 * ohne Vererbung
		 */
		ArrayList<TableLamp> tableLamps = new ArrayList<>();
		ArrayList<FlashLight> flashLights = new ArrayList<>();

		tableLamps.add(tableLamp1);
		tableLamps.add(tableLamp2);
		tableLamps.add(tableLamp3);

		flashLights.add(flashLight1);
		flashLights.add(flashLight2);

		for (TableLamp t : tableLamps) {
			t.switchOn();
			t.print();
			t.switchOff();
		}

		for (FlashLight f : flashLights) {
			f.switchOn();
			f.print();
			f.switchOff();
		}

		/*
		 * mit Vererbung
		 */
		ArrayList<Light> lights = new ArrayList<>();
		Light light;

		light = tableLamp1; // Upcast
		lights.add(light);

		light = tableLamp2; // Upcast
		lights.add(light);

		light = tableLamp3; // Upcast
		lights.add(light);

		light = flashLight1; // Upcast
		lights.add(light);

		light = flashLight2; // Upcast
		lights.add(light);

		/*
		 * Polymorphie
		 */
		for (Light l : lights) {
			l.switchOn();
			l.print();
			l.switchOff();
		}

	}

}
