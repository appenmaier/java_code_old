package demos.tableLamp.v4;

/**
 * Aufzaehlungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO08 {

  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb("rot");
    TableLamp tableLamp = new TableLamp(PlugTypeEnum.TYPE_F);
    tableLamp.changeLightBulb(redLightBulb);
    System.out.println(tableLamp.toString());
    System.out.println(tableLamp.plugType().region());

    System.out.println(PlugTypeEnum.TYPE_I.norm());

  }

}
