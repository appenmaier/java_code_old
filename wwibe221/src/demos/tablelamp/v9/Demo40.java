package demos.tablelamp.v9;

import java.awt.Color;
import java.util.Scanner;

/**
 * Ausnahmenbehandlung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo40 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Color.RED);

		TableLamp tableLamp = new TableLamp(PlugType.TYPE_F, redLightBulb);

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Optionen");
		System.out.println("1: Tischleuchte einstecken");
		System.out.println("2: Tischleuchte ausstecken");
		System.out.println("3: Beenden");

		boolean loop = true;
		while (loop) {
			System.out.print("Gib bitte ein, was Du tun moechtest: ");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				try {
					tableLamp.plugIn();
					System.out.println("Das Geraet wurde eingesteckt");
				} catch (AlreadyPluggedInException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				tableLamp.pullThePlug();
				System.out.println("Das Geraet wurde ausgesteckt");
				break;
			case 3:
				loop = false;
				break;
			}
		}

	}

}
