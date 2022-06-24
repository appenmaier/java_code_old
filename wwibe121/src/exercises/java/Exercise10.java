package exercises.java;

import java.util.Scanner;

/**
 * Uebungsaufgabe JAVA-10
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Exercise10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gib bitte den ersten Operanden ein: ");
		double operand1 = sc.nextDouble();

		System.out.print("Gib bitte den Operator ein: ");
		char operator = sc.next().charAt(0);

		System.out.print("Gib bitte den zweiten Operanden ein: ");
		double operand2 = sc.nextDouble();

		double result = 0;

		// if (operator == '+') {
		// result = operand1 + operand2;
		// } else if (operator == '-') {
		// result = operand1 - operand2;
		// } else if (operator == '*') {
		// result = operand1 * operand2;
		// } else if (operator == '/') {
		// result = operand1 / operand2;
		// }

		// result = (operator == '+') ? operand1 + operand2 : 0;
		// result = (operator == '-') ? operand1 - operand2 : 0;
		// result = (operator == '*') ? operand1 * operand2 : 0;
		// result = (operator == '/') ? operand1 / operand2 : 0;

		switch (operator) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '*':
			result = operand1 * operand2;
			break;
		case '/':
			result = operand1 / operand2;
			break;
		default:
			break;
		}

		System.out.printf("Ergebnis: %.2f %c %.2f = %.2f", operand1, operator, operand2, result);

	}

}
