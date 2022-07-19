package exercises.java.house.v1;

import java.util.ArrayList;

/**
 * Haus
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class House {

	/*
	 * Attribute
	 */
	private ArrayList<Room> rooms;

	/*
	 * Konstruktoren
	 */
	public House() {
		rooms = new ArrayList<>();
	}

	/*
	 * Methoden
	 */
	public void addRoom(Room room) {
		rooms.add(room);
	}

	public void displayRooms() {
		for (Room r : rooms) {
			r.displayRoom();
		}
	}

	/*
	 * Innere Klassen
	 */
	/**
	 * Raum
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 */
	public class Room {

		/*
		 * Attribute
		 */
		private String name;

		/*
		 * Konstruktoren
		 */

		public Room(String name) {
			this.name = name;
		}

		/*
		 * Methoden
		 */
		public void displayRoom() {
			System.out.println(name);
		}

	}

}
