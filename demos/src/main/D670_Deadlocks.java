package main;

import model.BowThread;
import model.Friend;

/**
 * Verklemmungen (Deadlocks)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D670_Deadlocks {

  public static void main(String[] args) throws InterruptedException {

    Friend friend1 = new Friend("Hans");
    Friend friend2 = new Friend("Peter");

    BowThread bow1 = new BowThread(friend1, friend2);
    BowThread bow2 = new BowThread(friend2, friend1);

    bow1.start();
    bow2.start();

  }

}
