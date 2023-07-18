package main;

import model.Counter;
import model.CounterThread;

/**
 * Synchronisieren von Threads
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D650_Synchonization {

  public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();

    CounterThread counter1 = new CounterThread("Counter 1", Thread.MIN_PRIORITY, counter);
    CounterThread counter2 = new CounterThread("Counter 2", Thread.MAX_PRIORITY, counter);

    counter1.start();
    counter2.start();

    Thread.sleep(1);

    counter1.stop();
    counter2.stop();

  }

}
