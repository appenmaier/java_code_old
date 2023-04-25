package exercises.java.house;

import java.util.ArrayList;

/**
 * Haus
 * 
 * @author Daniel Appenmaier
 * 
 */
public class House {

  /**
   * Raum
   * 
   * @author Daniel Appenmaier
   * 
   */
  public class Room {

    private String name;

    public Room(String name) {
      this.name = name;
    }

    public void displayRoom() {
      System.out.println(name);
    }

  }

  private ArrayList<Room> rooms;

  public House() {
    rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  public void displayRooms() {
    for (Room r : rooms) {
      r.displayRoom();
    }
  }

}
