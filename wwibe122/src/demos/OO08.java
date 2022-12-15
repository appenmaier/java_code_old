package demos;

import java.awt.Color;
import demos.tableLamp.LightBulb_v4;
import demos.tableLamp.PlugType_v2;
import demos.tableLamp.TableLamp_v4;

/**
 * Aufzaehlungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO08 {

  public static void main(String[] args) {

    LightBulb_v4 redLightBulb = new LightBulb_v4(Color.RED);
    TableLamp_v4 tableLamp = new TableLamp_v4(PlugType_v2.TYPE_F);
    tableLamp.changeLightBulb(redLightBulb);
    System.out.println(tableLamp.toString());
    System.out.println(tableLamp.plugType().region());

    System.out.println(PlugType_v2.TYPE_I.norm());

    PlugType_v2[] plugTypeEnums = PlugType_v2.values();
    for (int i = 0; i < plugTypeEnums.length; i++) {
      PlugType_v2 plugTypeEnum = plugTypeEnums[i];
      System.out.println(plugTypeEnum.description());
    }

    String plugType = "TYPE_F";
    PlugType_v2 plugTypeEnum = PlugType_v2.valueOf(plugType);
    System.out.println(plugTypeEnum.norm());

  }

}
