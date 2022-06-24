package exercises.java;

/**
 * Uebungsaufgabe JAVA-25
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise25 {

	public static void main(String[] args) {

		int[] binaryNumber1 = { 1, 0, 1, 1, 0, 1, 1, 0 };
		int[] binaryNumber2 = { 0, 1, 0, 0, 0, 1, 1, 1 };
		int[] binaryNumber3 = new int[8];

		int subTotal = 0;
		int carry = 0;

		for (int i = binaryNumber3.length - 1; i >= 0; i--) {
			subTotal = binaryNumber1[i] + binaryNumber2[i] + carry;
			if (subTotal > 1) {
				if (i == 0) {
					System.out.println("Ueberlauf");
					return;
				} else {
					binaryNumber3[i] = ((subTotal == 2) ? 0 : 1);
					carry = 1;
				}
			} else {
				binaryNumber3[i] = subTotal;
				carry = 0;
			}
		}

		System.out.print("  ");
		for (int i = 0; i < binaryNumber1.length; i++) {
			System.out.print(binaryNumber1[i]);
		}
		System.out.println();
		System.out.print("+ ");
		for (int i = 0; i < binaryNumber2.length; i++) {
			System.out.print(binaryNumber2[i]);
		}
		System.out.println();
		System.out.print("= ");
		for (int i = 0; i < binaryNumber3.length; i++) {
			System.out.print(binaryNumber3[i]);
		}

	}

}
