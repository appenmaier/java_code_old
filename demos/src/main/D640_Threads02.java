package main;

import model.TickerThread;

/**
 * Daemon-Threads
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D640_Threads02 {

  @SuppressWarnings("unused")
  public static void main(String[] args) throws InterruptedException {

    TickerThread ticker = new TickerThread();

    Thread.sleep(5000);

  }

}
