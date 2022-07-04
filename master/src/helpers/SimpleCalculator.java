package helpers;

/**
 * Einfacher Taschenrechner
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SimpleCalculator {

	/*
	 * Konstruktoren
	 */
	public SimpleCalculator() {
	}

	/*
	 * Methoden
	 */
	public int abs(int a) {
		return a >= 0 ? a : a * -1;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
