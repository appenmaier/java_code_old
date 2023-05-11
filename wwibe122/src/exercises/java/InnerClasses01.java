package exercises.java;

import exercises.java.house.House;
import exercises.java.house.House.Room;

public class InnerClasses01 {

  public static void main(String[] args) {

    House house = new House();

    Room room1 = house.new Room("Schlafzimmer");
    Room room2 = house.new Room("Esszimmer");
    Room room3 = house.new Room("Kueche");

    house.addRoom(room1);
    house.addRoom(room2);
    house.addRoom(room3);

    house.displayRooms();

  }

}
