package model;

import java.util.ArrayList;
import main.D660_WaitingLists;

/**
 * PrinterThread
 *
 * @auhtor Daniel Appenmaier
 * @version 2.0
 *
 */
public class PrinterThread implements Runnable {

  private ArrayList<Integer> numbers = D660_WaitingLists.numbers;
  private Thread thread;

  @Override
  public void run() {
    while (true) {
      synchronized (numbers) {
        while (numbers.size() < 1) {
          try {
            numbers.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("Printer" + ": " + numbers);
      }
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  /*
   * version 1.0: public void run() { while (true) { System.out.println("Printer" + ": " + numbers);
   * try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); } } }
   */

  public void start() {
    thread = new Thread(this, "Printer");
    thread.setDaemon(true);
    thread.start();
  }

}
