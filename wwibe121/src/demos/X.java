package demos;

/**
 * Infinity, NaN und ArithmeticException
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class X {

	public static void main(String[] args) {

		System.out.println(1.0 / 0.0); // Infinity
		System.out.println(1.0 / -0.0); // -Infinity
		
		System.out.println(0.0 / 0.0); // NaN
		System.out.println(0.0 / -0.0); // NaN
		
		System.out.println(1 / 0); // ArithmeticException

	}

}
