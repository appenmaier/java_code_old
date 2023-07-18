package model;

import java.time.LocalTime;

/**
 * TickerThread
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TickerThread implements Runnable {

  private Thread thread;

  @Override
  public void run() {
    while (true) {
      try {
        System.out.println(LocalTime.now());
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

  public void start() {
    thread = new Thread(this);
    thread.setDaemon(true);
    thread.start();
  }

}
