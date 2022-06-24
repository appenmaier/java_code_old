package demos;

/**
 * Sichtbarkeit von Datenobjekten
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo06 {

	static char attributeX = 'X';

	public static void main(String[] args) {
		Demo06.methodA(42, 'A', 'Y');
		Demo06.methodB();
	}

	public static void methodA(int parameterA, char parameterB, char parameterX) {
		int variableA = parameterA;
		char variableB = parameterB;
		attributeX = parameterX;

		System.out.println("variableA: " + variableA);
		System.out.println("variableB: " + variableB);
		System.out.println("attributeX: " + attributeX);
	}

	public static void methodB() {
		char variableB = 'B';

		// System.out.println("variableA: " + variableA);
		System.out.println("variableB: " + variableB);
		System.out.println("attributeX: " + attributeX);
	}

}