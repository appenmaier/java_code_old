package exercises.tutego.radio.v10;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP162 {

	public static void main(String[] args) {

		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		IceMachine iceMachine = new IceMachine();

		radio1.on();
		iceMachine.on();

		int x = ElectronicDevice.numberOfElectronicDevicesSwitchedOn(radio1, iceMachine, radio2);
		System.out.println("x: " + x);

	}

}
