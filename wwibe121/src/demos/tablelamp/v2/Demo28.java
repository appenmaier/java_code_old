package demos.tablelamp.v2;

/**
 * Ueberladene Methoden und Konstruktoren
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo28 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb("rot");
		LightBulb whiteLightBulb = new LightBulb();

		TableLamp tableLamp = new TableLamp(redLightBulb);
		tableLamp.print();
		tableLamp.plugIn();
		tableLamp.switchOn();
		tableLamp.print();
		tableLamp.pullThePlug();
		tableLamp.print();
		tableLamp.changeLightBulb(whiteLightBulb);
		tableLamp.print();

	}

}
