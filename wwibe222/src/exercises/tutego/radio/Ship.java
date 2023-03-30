package exercises.tutego.radio;

import java.util.ArrayList;

/**
 * Schiff
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Ship {

  private ArrayList<Radio09> radios;

  public Ship() {
    radios = new ArrayList<>();
  }

  public void addRadio(Radio09 radio) {
    radios.add(radio);
  }

  public void addAllRadios(Radio09... radios) {
    for (Radio09 r : radios) {
      addRadio(r);
    }
  }

  public int numberOfRadiosSwitchedOn() {
    int count = 0;

    for (Radio09 r : radios) {
      if (r.isOn()) {
        count++;
      }
    }

    return count;
  }

  public String toString() {
    String text = "";
    for (Radio09 r : radios) {
      text += r.toString() + "\n";
    }
    text += "Anzahl eingeschalteter Radios: " + numberOfRadiosSwitchedOn() + "\n";
    return text;
  }

}
