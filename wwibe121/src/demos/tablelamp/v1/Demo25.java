package demos.tablelamp.v1;

/**
 * Klassen, Objekte, Attribute und Methoden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo25 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColor("rot");

		TableLamp tableLamp = new TableLamp();

		tableLamp.changeLightBulb(redLightBulb);
		tableLamp.print();
		tableLamp.plugIn();
		tableLamp.switchOn();
		tableLamp.print();
		tableLamp.pullThePlug();
		tableLamp.print();

	}

}
