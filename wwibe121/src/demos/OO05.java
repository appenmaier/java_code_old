package demos;

import demos.tablelamp.v3.LightBulb;
import demos.tablelamp.v3.TableLamp;

/**
 * Statische und nicht-statische Elemente einer Klasse
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class OO05 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb("rot");
		LightBulb whiteLightBulb = new LightBulb();

		int numberOfTableLamps = TableLamp.getNumberOfTableLamps();
		System.out.println("numberOfTableLamps: " + numberOfTableLamps);

		TableLamp tableLamp1 = new TableLamp(redLightBulb);
		tableLamp1.plugIn();
		tableLamp1.switchOn();

		numberOfTableLamps = TableLamp.getNumberOfTableLamps();
		System.out.println("numberOfTableLamps: " + numberOfTableLamps);

		TableLamp tableLamp2 = new TableLamp(redLightBulb);
		tableLamp2.switchOn();

		numberOfTableLamps = TableLamp.getNumberOfTableLamps();
		System.out.println("numberOfTableLamps: " + numberOfTableLamps);

		TableLamp tableLamp3 = new TableLamp(whiteLightBulb);
		tableLamp3.plugIn();
		tableLamp3.switchOn();

		numberOfTableLamps = TableLamp.getNumberOfTableLamps();
		System.out.println("numberOfTableLamps: " + numberOfTableLamps);

	}

}
