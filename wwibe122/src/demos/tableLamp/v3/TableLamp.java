package demos.tableLamp.v3;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class TableLamp {

  /*
   * Attribute
   */
  private boolean isConnected;
  private boolean isOn;
  private boolean isShining;
  private LightBulb lightBulb;

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  /*
   * Methoden
   */
  public TableLamp() {
    numberOfTableLamps++;
  }

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

  public LightBulb changeLightBulb(LightBulb newLightBulb) {
    LightBulb oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    if (isConnected && isOn) {
      isShining = true;
    }
    return oldLightBulb;
  }

  public String toString() {
    return TYPE + " [isConnected=" + isConnected + " isOn=" + isOn + " isShining=" + isShining
        + " lightBulb=" + lightBulb.toString() + "]";
  }

  public static int getNumberOfTableLamps() {
    return numberOfTableLamps;
  }

}
