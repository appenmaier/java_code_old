package model;

public record Friend(String name) {

  public synchronized void bow(Friend friend) {
    System.out.println(friend.name() + " hat " + name + " gestupst");
    friend.bowBack(this);
  }

  public synchronized void bowBack(Friend friend) {
    System.out.println(friend.name() + " hat " + name + " zurueckgestupst");
  }

}
