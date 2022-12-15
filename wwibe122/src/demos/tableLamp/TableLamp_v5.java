package demos.tableLamp;

import demos.Light;

/**
 * Tischleuchte
 * 
 * @author Daniel Appenmaier
 * @version 5.0
 *
 */
public class TableLamp_v5 extends Light {

  /*
   * Attribute
   */
  private boolean isConnected;
  private LightBulb_v4 lightBulb;
  private final PlugType_v2 plugType;

  private final static String TYPE = "Tischleuchte";
  private static int numberOfTableLamps;

  /*
   * Methoden
   */
  public TableLamp_v5(PlugType_v2 plugType) {
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

  public LightBulb_v4 changeLightBulb(LightBulb_v4 newLightBulb) {
    LightBulb_v4 oldLightBulb = lightBulb;
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

  public PlugType_v2 plugType() {
    return plugType;
  }

}