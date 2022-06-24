package exercises.koblenz;

import java.util.Scanner;

import helpers.Calculator;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe B5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseB5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Gibt bitte den Nettobetrag in Euro ein: ");
		double netAmountInEUR = sc.nextDouble();

		System.out.print("Soll der ermaessigte MwSt verwendet werden?: ");
		boolean isReducedVAT = sc.nextBoolean();

		double netAmountInDM = Calculator.exchangeEuroToDM(netAmountInEUR);

		double totalAmountInEUR = Calculator.addVAT(netAmountInEUR, isReducedVAT);
		double totalAmountInDM = Calculator.addVAT(netAmountInDM, isReducedVAT);

		System.out.println("Bruttobetrag in EUR: " + totalAmountInEUR);
		System.out.println("Bruttobetrag in DM: " + totalAmountInDM);

	}

}
