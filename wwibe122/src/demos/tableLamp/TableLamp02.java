package demos.tableLamp;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class TableLamp02 {

  /*
   * Attribute
   */
  private boolean isConnected;
  private boolean isOn;
  private boolean isShining;
  private LightBulb02 lightBulb;

  /*
   * Methoden
   */
  public void plugIn() {
    isConnected = true;
    if (isOn && lightBulb != null) {
      isShining = true;
    }
  }

  public void pullThePlug() {
    isConnected = false;
    isShining = false;
  }

  public void switchOn() {
    isOn = true;
    if (isConnected && lightBulb != null) {
      isShining = true;
    }
  }

  public void switchOff() {
    isOn = false;
    isShining = false;
  }

  public LightBulb02 changeLightBulb(LightBulb02 newLightBulb) {
    LightBulb02 oldLightBulb = lightBulb;
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
