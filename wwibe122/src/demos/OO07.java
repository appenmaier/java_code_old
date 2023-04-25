package demos;

import demos.tableLamp.TableLamp;

/**
 * Statische und nicht-statische Elemente
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO07 {

  public static void main(String[] args) {

    System.out.println(TableLamp.getNumberOfTableLamps());

    /* Outdated */
    // TableLamp tableLamp1 = new TableLamp();
    // TableLamp tableLamp2 = new TableLamp();
    // TableLamp tableLamp3 = new TableLamp();

    System.out.println(TableLamp.getNumberOfTableLamps());

  }

}
