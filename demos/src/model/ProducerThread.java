package model;

import java.util.ArrayList;
import java.util.Random;
import main.D660_Threads04;

/**
 * ProducerThread
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class ProducerThread implements Runnable {

  private boolean isRunning;
  private ArrayList<Integer> numbers = D660_Threads04.numbers;
  private Thread thread;

  @Override
  public void run() {
    while (isRunning) {
      synchronized (numbers) {
        int number = (new Random()).nextInt(100);
        numbers.add(number);
        System.out.println("Producer" + ": " + number);
        numbers.notifyAll();
      }
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  /*
   * version 1.0: public void run() { while (isRunning) { int number = (new Random()).nextInt(100);
   * numbers.add(number); System.out.println("Producer" + ": " + number); try { Thread.sleep(100); }
   * catch (InterruptedException e) { e.printStackTrace(); } } }
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
