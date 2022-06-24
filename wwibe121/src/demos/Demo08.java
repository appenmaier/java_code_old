package demos;

/**
 * Arithmetische Operatoren
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo08 {

	public static void main(String[] args) {

		int a = 5, b = 3;
		int c;
		double d;

		// Addition
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);

		// Subtraktion
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);

		// Multiplikation
		c = a * b;
		System.out.println(a + " * " + b + " = " + c);

		// Ganzzahlige Division und Divisionsrest
		c = a / b;
		System.out.println(a + " / " + b + " = " + c);

		c = a % b;
		System.out.println(a + " % " + b + " = " + c);

		// Division
		d = (double) a / b;
		System.out.println((double) a + " / " + b + " = " + d);

		System.out.println();

		// Inkrementieren
		c = 0;
		c = c + 1;
		System.out.println("c = c + 1: " + c);

		c += 1; // c = c + ( 1 );
		System.out.println("c += 1: " + c);

		c++; // c = c + 1;
		System.out.println("c++: " + c);

		// Dekrementieren
		c--; // c -= 1; c = c - 1;
		System.out.println("c--: " + c);

		System.out.println();

		// Preinkrementieren/Predekrementieren vs Postinkrementieren/Postdekrementieren
		c = 0;
		a = 0;

		a = c++; // Postinkrementieren
		// a = c; c = c + 1;
		System.out.println("a = c++: " + a);
		System.out.println("c: " + c);

		c = 0;
		a = 0;

		a = ++c; // Preinkrementieren
		// c = c + 1; a = c;
		System.out.println("a = ++c: " + a);
		System.out.println("c: " + c);

	}

}