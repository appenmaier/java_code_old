package demos.tablelamp.v6;

import java.awt.Color;

/**
 * Die Mutter aller Klassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo35 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Color.RED);
		LightBulb redLightBulb2 = new LightBulb(Color.RED);

		TableLamp tableLamp1 = new TableLamp(PlugType.TYPE_F, redLightBulb);
		TableLamp tableLamp2 = new TableLamp(PlugType.TYPE_F, redLightBulb);

		/*
		 * Die hashCode-Methode
		 */
		System.out.println("redLightBulb.hashCode(): " + redLightBulb.hashCode());
		System.out.println("redLightBulb2.hashCode(): " + redLightBulb2.hashCode());
		System.out.println("tableLamp1.hashCode(): " + tableLamp1.hashCode());
		System.out.println("tableLamp2.hashCode(): " + tableLamp2.hashCode());
		System.out.println("System.identityHashCode(tableLamp1): " + System.identityHashCode(tableLamp1));
		System.out.println("System.identityHashCode(tableLamp2): " + System.identityHashCode(tableLamp2));

		/*
		 * Die equals-Methode
		 */
		if (tableLamp1 == tableLamp2) {
			System.out.println("Beide Objekte sind identisch");
		}

		if (tableLamp1.equals(tableLamp2)) {
			System.out.println("Beide Objekte sind gleich");
		}

		/*
		 * Die toString-Methode
		 */
		System.out.println(tableLamp1.toString());
		System.out.println(tableLamp1);
		System.out.println(redLightBulb);

	}

}
