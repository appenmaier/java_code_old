package demos.tableLamp;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 7.0
 *
 */
public final class TableLamp07 extends Light02 implements WiredDevice {

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  public static int getNumberOfTableLamps() {
    return numberOfTableLamps;
  }

  /*
   * Attribute
   */
  private boolean isConnected;
  private LightBulb04 lightBulb;

  private final PlugType02 plugType;

  /*
   * Methoden
   */
  public TableLamp07(PlugType02 plugType) {
    this.plugType = plugType;
    numberOfTableLamps++;
  }

  public LightBulb04 changeLightBulb(LightBulb04 newLightBulb) {
    LightBulb04 oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    if (isConnected && isOn) {
      isShining = true;
    }
    return oldLightBulb;
  }

  @Override
  public void plugIn() {
    isConnected = true;
    if (isOn && lightBulb != null) {
      isShining = true;
    }
  }

  public PlugType02 plugType() {
    return plugType;
  }

  @Override
  public void pullThePlug() {
    isConnected = false;
    isShining = false;
  }

  @Override
  public void switchOn() {
    isOn = true;
    if (isConnected && lightBulb != null) {
      isShining = true;
    }
  }

  @Override
  public String toString() {
    return TYPE + " [isConnected=" + isConnected + " isOn=" + isOn + " isShining=" + isShining
        + " lightBulb=" + lightBulb.toString() + " plugType=" + plugType.toString() + "]";
  }

}