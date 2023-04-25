package demos.tableLamp;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 5.0
 *
 */
public class TableLamp extends Light {

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  public static int getNumberOfTableLamps() {
    return numberOfTableLamps;
  }

  private boolean isConnected;
  private LightBulb lightBulb;

  private final PlugType plugType;

  public TableLamp(PlugType plugType) {
    this.plugType = plugType;
    numberOfTableLamps++;
  }

  public LightBulb changeLightBulb(LightBulb newLightBulb) {
    LightBulb oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    if (isConnected && isOn) {
      isShining = true;
    }
    return oldLightBulb;
  }

  public void plugIn() {
    isConnected = true;
    if (isOn && lightBulb != null) {
      isShining = true;
    }
  }

  public PlugType plugType() {
    return plugType;
  }

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
