package model;

import java.util.ArrayList;
import main.D660_WaitingLists;

/**
 * ConsumerThread
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class ConsumerThread implements Runnable {

  private boolean isRunning;
  private ArrayList<Integer> numbers = D660_WaitingLists.numbers;
  private Thread thread;

  @Override
  public void run() {
    while (isRunning) {
      synchronized (numbers) {
        while (numbers.size() < 1) {
          try {
            numbers.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("Consumer" + ": " + numbers.get(0));
        numbers.remove(0);
      }

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  /*
   * version 1.0: public void run() { while (isRunning) { if (numbers.size() > 0) {
   * System.out.println("Consumer" + ": " + numbers.get(0)); numbers.remove(0); }
   *
   * try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); } } }
   */

  public void start() {
    isRunning = true;
    thread = new Thread(this, "Consumer");
    thread.start();
  }

  public void stop() {
    isRunning = false;
  }

}
