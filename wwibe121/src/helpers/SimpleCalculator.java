package helpers;

/**
 * Einfacher Taschenrechner
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SimpleCalculator {

	public int absolute(int a) {
		return a < 0 ? a * -1 : a;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

}
