package exercises.tutego.radio;

/**
 * Eismaschine
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class IceMachine extends ElectronicDevice {

  public String toString() {
    return "Eismaschine [" + (isOn() ? "ist an]" : "ist aus]");
  }

}
