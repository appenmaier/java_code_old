package helpers;

/**
 * Kasten
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Box {

	/*
	 * Attribute
	 */
	/**
	 * Elemente
	 */
	private Element[] elements;

	/*
	 * Konstruktoren
	 */
	public Box(int numberOfElements) {
		elements = new Element[numberOfElements];
	}

	/*
	 * Methoden
	 */
	public void addElement(Element element) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				elements[i] = element;
			}
		}
	}

	public Element getElement(int index) {
		return elements[index];
	}

	/*
	 * Innere Klassen
	 */
	/**
	 * Element
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 *
	 */
	public class Element {

		/*
		 * Attribute
		 */
		private Object value;

		/*
		 * Konstruktoren
		 */
		public Element(Object value) {
			this.value = value;
		}

		/*
		 * Setter und Getter
		 */
		public Object getValue() {
			return value;
		}
		
	}

}
