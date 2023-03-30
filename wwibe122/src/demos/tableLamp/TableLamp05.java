package demos.tableLamp;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 5.0
 *
 */
public class TableLamp05 extends Light {

  /*
   * Attribute
   */
  private boolean isConnected;
  private LightBulb04 lightBulb;
  private final PlugType02 plugType;

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  /*
   * Methoden
   */
  public TableLamp05(PlugType02 plugType) {
    this.plugType = plugType;
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

  public LightBulb04 changeLightBulb(LightBulb04 newLightBulb) {
    LightBulb04 oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    if (isConnected && isOn) {
      isShining = true;
    }
    return oldLightBulb;
  }

  public String toString() {
    return TYPE + " [isConnected=" + isConnected + " isOn=" + isOn + " isShining=" + isShining
        + " lightBulb=" + lightBulb.toString() + " plugType=" + plugType.toString() + "]";
  }

  public static int getNumberOfTableLamps() {
    return numberOfTableLamps;
  }

  public PlugType02 plugType() {
    return plugType;
  }

}
