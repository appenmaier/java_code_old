package demos;

import java.awt.Color;
import demos.tableLamp.LightBulb04;
import demos.tableLamp.PlugType02;
import demos.tableLamp.TableLamp04;

/**
 * Aufzaehlungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO08 {

  public static void main(String[] args) {

    LightBulb04 redLightBulb = new LightBulb04(Color.RED);
    TableLamp04 tableLamp = new TableLamp04(PlugType02.TYPE_F);
    tableLamp.changeLightBulb(redLightBulb);
    System.out.println(tableLamp.toString());
    System.out.println(tableLamp.plugType().region());

    System.out.println(PlugType02.TYPE_I.norm());

    PlugType02[] plugTypeEnums = PlugType02.values();
    for (int i = 0; i < plugTypeEnums.length; i++) {
      PlugType02 plugTypeEnum = plugTypeEnums[i];
      System.out.println(plugTypeEnum.description());
    }

    String plugType = "TYPE_F";
    PlugType02 plugTypeEnum = PlugType02.valueOf(plugType);
    System.out.println(plugTypeEnum.norm());

  }

}
