package main;

import model.Counter;
import model.CounterThread;

/**
 * Nebenlaeufige Programmierung (Threading)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D630_Threads01 {

  public static void main(String[] args) throws InterruptedException {

    CounterThread counter1 = new CounterThread("Counter 1", Thread.MIN_PRIORITY, new Counter());
    CounterThread counter2 = new CounterThread("Counter 2", Thread.MAX_PRIORITY, new Counter());

    counter1.start();
    counter2.start();

    Thread.sleep(1);

    counter1.stop();
    counter2.stop();

  }

}
