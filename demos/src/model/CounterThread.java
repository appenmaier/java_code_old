package model;

/**
 * CounterThread
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class CounterThread implements Runnable {

  private Counter counter;
  private boolean isRunning;
  private String name;
  private int priority;
  private Thread thread;

  public CounterThread(String name, int priority, Counter counter) {
    this.name = name;
    this.priority = priority;
    this.counter = counter;
  }

  @Override
  public void run() {
    while (isRunning) {
      synchronized (counter) {
        counter.increaseCounter();
        System.out.println(name + ": " + counter.getCounter());
      }
    }
  }
  /*
   * version 1.0: public void run() { while (isRunning) { counter.increaseCounter();
   * System.out.println(name + ": " + counter.getCounter()); } }
   */

  public void start() {
    isRunning = true;
    thread = new Thread(this, name);
    thread.setPriority(priority);
    thread.start();
  }

  public void stop() {
    isRunning = false;
  }

}
