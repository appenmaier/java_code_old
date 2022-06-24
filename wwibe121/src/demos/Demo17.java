package demos;

import java.util.Scanner;

/**
 * Schleifensteuerung mit break und continue
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int i = 1;

		while (true) {
			System.out.println("Schleifendurchgang: " + i);
			System.out.print("1=Schleifendurchgang ausfuehren, 2=Schleifendurchgang abbrechen, 3=Schleife abbrechen: ");
			int answer = sc.nextInt();

			if (answer == 2) {
				continue; // Schleifendurchgang abbrechen/beenden
			} else if (answer == 3) {
				break; // Schleife abbrechen/beenden
			}

			System.out.println("Hallo Welt");
		}

	}

}
