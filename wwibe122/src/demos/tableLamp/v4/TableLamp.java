package demos.tableLamp.v4;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 4.0
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
  private final PlugTypeEnum plugType;

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  /*
   * Methoden
   */
  public TableLamp(PlugTypeEnum plugType) {
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
        + " lightBulb=" + lightBulb.toString() + " plugType=" + plugType.toString() + "]";
  }

  public static int getNumberOfTableLamps() {
    return numberOfTableLamps;
  }

  public PlugTypeEnum plugType() {
    return plugType;
  }

}
