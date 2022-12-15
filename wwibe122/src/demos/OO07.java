package demos;

import demos.tableLamp.TableLamp_v3;

/**
 * Statische und nicht-statische Elemente
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO07 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    System.out.println(TableLamp_v3.getNumberOfTableLamps());

    TableLamp_v3 tableLamp1 = new TableLamp_v3();
    TableLamp_v3 tableLamp2 = new TableLamp_v3();
    TableLamp_v3 tableLamp3 = new TableLamp_v3();

    System.out.println(TableLamp_v3.getNumberOfTableLamps());

  }

}
