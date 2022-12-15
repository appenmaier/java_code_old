package demos;

import demos.tableLamp.TableLamp03;

/**
 * Statische und nicht-statische Elemente
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO07 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    System.out.println(TableLamp03.getNumberOfTableLamps());

    TableLamp03 tableLamp1 = new TableLamp03();
    TableLamp03 tableLamp2 = new TableLamp03();
    TableLamp03 tableLamp3 = new TableLamp03();

    System.out.println(TableLamp03.getNumberOfTableLamps());

  }

}
