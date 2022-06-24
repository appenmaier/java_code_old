package exercises.tutego.radio.v11;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html
 * Aufgabe Interface-1.1.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface112 {

	public static void main(String[] args) {

		Ship ship = new Ship();
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		IceMachine iceMachine = new IceMachine();

		radio1.setWatt(15);
		radio2.setWatt(10);
		iceMachine.setWatt(150);

		ship.addAllElectronicDevices(radio1, radio2, iceMachine);

		System.out.println(ship.toString());

		ElectronicDevice mostPowerConsumingElectronicDevice = ship.findMostPowerConsumingElectronicDevice();
		System.out.println(mostPowerConsumingElectronicDevice.toString());

	}

}
