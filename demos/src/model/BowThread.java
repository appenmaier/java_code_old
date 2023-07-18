package model;

public class BowThread implements Runnable {

  private Friend friend1;
  private Friend friend2;
  private Thread thread;

  public BowThread(Friend friend1, Friend friend2) {
    this.friend1 = friend1;
    this.friend2 = friend2;
  }

  @Override
  public void run() {
    friend1.bow(friend2);
  }

  public void start() {
    thread = new Thread(this);
    thread.start();
  }

}
