package demos;

import helpers.Box;
import helpers.Box.Element;

/**
 * Elementklassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo42 {

	public static void main(String[] args) {

		Box box = new Box(5);

		// Element element = new Element("Hans");
		Element element = box.new Element("Hans");
		box.addElement(element);
		System.out.println(box.getElement(0).getValue());

	}

}
