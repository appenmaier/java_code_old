package demos.tableLamp.v1;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLamp {

  /*
   * Attribute
   */
  boolean isConnected;
  boolean isOn;
  boolean isShining;
  LightBulb lightBulb;

  /*
   * Methoden
   */
  void plugIn() {
    isConnected = true;
    if (isOn && lightBulb != null) {
      isShining = true;
    }
  }

  void pullThePlug() {
    isConnected = false;
    isShining = false;
  }

  void switchOn() {
    isOn = true;
    if (isConnected && lightBulb != null) {
      isShining = true;
    }
  }

  void switchOff() {
    isOn = false;
    isShining = false;
  }

  LightBulb changeLightBulb(LightBulb newLightBulb) {
    LightBulb oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    if (isConnected && isOn) {
      isShining = true;
    }
    return oldLightBulb;
  }

  public String toString() {
    return "TableLamp [isConnected=" + isConnected + " isOn=" + isOn + " isShining=" + isShining
        + " lightBulb=" + lightBulb.toString() + "]";
  }

}
