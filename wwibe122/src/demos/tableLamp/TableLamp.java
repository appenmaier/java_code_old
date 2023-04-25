package demos.tableLamp;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 8.0
 *
 */
public final class TableLamp extends Light implements WiredDevice {

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

  @Override
  public void plugIn() throws AlreadyPluggedInException {
    if (isConnected) {
      throw new AlreadyPluggedInException();
    }

    isConnected = true;
    if (isOn && lightBulb != null) {
      isShining = true;
    }
  }

  public PlugType plugType() {
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
