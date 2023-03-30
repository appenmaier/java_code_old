package demos.tableLamp;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class TableLamp03 {

  /*
   * Attribute
   */
  private boolean isConnected;
  private boolean isOn;
  private boolean isShining;
  private LightBulb03 lightBulb;

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  /*
   * Methoden
   */
  public TableLamp03() {
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

  public LightBulb03 changeLightBulb(LightBulb03 newLightBulb) {
    LightBulb03 oldLightBulb = lightBulb;
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
