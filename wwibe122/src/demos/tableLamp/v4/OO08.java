package demos.tableLamp.v4;

import java.awt.Color;

/**
 * Aufzaehlungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO08 {

  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb(Color.RED);
    TableLamp tableLamp = new TableLamp(PlugTypeEnum.TYPE_F);
    tableLamp.changeLightBulb(redLightBulb);
    System.out.println(tableLamp.toString());
    System.out.println(tableLamp.plugType().region());

    System.out.println(PlugTypeEnum.TYPE_I.norm());

    PlugTypeEnum[] plugTypeEnums = PlugTypeEnum.values();
    for (int i = 0; i < plugTypeEnums.length; i++) {
      PlugTypeEnum plugTypeEnum = plugTypeEnums[i];
      System.out.println(plugTypeEnum.description());
    }

    String plugType = "TYPE_F";
    PlugTypeEnum plugTypeEnum = PlugTypeEnum.valueOf(plugType);
    System.out.println(plugTypeEnum.norm());

  }

}
