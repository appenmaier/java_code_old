package exercises.tutego.radio;

/**
 * Feuermelder
 * 
 * @author Daniel Appenmaier
 * 
 */
public class Firebox extends ElectronicDevice {

  public Firebox() {
    on();
  }

  @Override
  public void off() {

  }

  @Override
  public String toString() {
    return "Feuermelder [ist an]";
  }

}
