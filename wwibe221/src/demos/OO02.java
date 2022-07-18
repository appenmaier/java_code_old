package demos;

import demos.tablelamp.v1.LightBulb;
import demos.tablelamp.v1.TableLamp;

/**
 * Referenzvariablen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class OO02 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColor("rot");

		int i = 5;
		TableLamp tableLamp1 = new TableLamp();
		tableLamp1.changeLightBulb(redLightBulb);

		System.out.println("i: " + i);
		System.out.println("tableLamp1: " + tableLamp1);
		System.out.println();

		int x = i;
		TableLamp tableLamp2 = tableLamp1;

		System.out.println("i: " + i);
		System.out.println("x: " + x);
		System.out.println("tableLamp1: " + tableLamp1);
		System.out.println("tableLamp2: " + tableLamp2);
		System.out.println();

		i = 7;
		tableLamp2.plugIn();
		tableLamp2.switchOn();

		System.out.println("i: " + i);
		System.out.println("x: " + x);
		System.out.println("tableLamp1: " + tableLamp1);
		System.out.println("tableLamp2: " + tableLamp2);
		System.out.println();

	}

}
