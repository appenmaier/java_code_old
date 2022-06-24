package demos;

import java.math.BigDecimal;

/**
 * Elementare Datentypen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo04 {

	public static void main(String[] args) {

		/*
		 * Ganze Zahlen: byte, short, int, long
		 */
		byte byte1 = 42; // Dezimalzahl
		byte byte2 = 0b00101010; // Binaerzahl (Prefix 0b)
		byte byte3 = 052; // Oktalzahl (Prefix 0)
		byte byte4 = 0x2A; // Hexadezimalzahl (Prefix 0x)

		System.out.println("byte1: " + byte1);
		System.out.println("byte2: " + byte2);
		System.out.println("byte3: " + byte3);
		System.out.println("byte4: " + byte4);

		@SuppressWarnings("unused")
		short short1 = 22982;
		@SuppressWarnings("unused")
		int int1 = 847773847;
		@SuppressWarnings("unused")
		long long1 = 432423454643L;

		/*
		 * Gleitkommazahlen: float, double
		 */
		float float1 = 0.1F;
		double double1 = 0.1;

		System.out.println("float1: " + float1);
		System.out.println("double1: " + double1);

		System.out.println(float1 + float1 + float1 + float1 + float1 + float1 + float1 + float1 + float1 + float1);

		System.out.println(10 * float1);

		System.out.println(
				double1 + double1 + double1 + double1 + double1 + double1 + double1 + double1 + double1 + double1);

		BigDecimal bigDecimal1 = new BigDecimal(0.1F);
		BigDecimal bigDecimal2 = new BigDecimal(0.1);

		System.out.println("bigDecimal1: " + bigDecimal1);
		System.out.println("bigDecimal2: " + bigDecimal2);

		/*
		 * Zeichen: char
		 */
		char char1 = 'A';
		char char2 = 65;
		char char3 = 0b1000001;
		char char4 = '\u0041';

		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		System.out.println("char3: " + char3);
		System.out.println("char4: " + char4);

		/*
		 * Boolscher Wahrheitswert: boolean
		 */
		boolean boolean1 = false;

		System.out.println("boolean1: " + boolean1);

	}

}