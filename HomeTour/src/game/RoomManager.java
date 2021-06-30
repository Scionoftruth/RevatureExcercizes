package game;

import java.util.HashMap;

import fixtures.Room;

public class RoomManager {
	
	//HashMap<Room, Room[]> roomExits = new HashMap<Room, Room[]>();
	
	Room startingRoom;
	
	Room[] rooms;
	
	public void init() {
		this.rooms = new Room[6];
		
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"The small entryway of a neo-colonial house with a long hallway that stretches to the east. To the north lies a kitchen and all you can see is an island and cabinets."+"\n"
				+"To the west you see a large room with couches and a piano"+"To the east down the hall you can see a door to the family room");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		//Room[] foyerExits = {rooms[2], rooms[3], rooms[1], null};
		//roomExits.put(rooms[0], foyerExits);
		HashMap<String,Room> foyerExits = new HashMap<String, Room>();
		foyerExits.put("east", rooms[2]);
		foyerExits.put("west", rooms[3]);
		foyerExits.put("north", rooms[1]);
		foyerExits.put("south", null);
		
		Room kitchen = new Room(
				"The Kitchen",
				"a large kitchen",
				"A large kitchen of the house with an island, table, stove and fridge. There is a dining room to the west, where a large table can be seen."+"\n"
				+"To the east is another large room that contains couches and a TV. To the south you see the front door and hallway");
		this.rooms[1] = kitchen;
		//Room[] kitchenExits = {rooms[2], rooms[4], null, rooms[0]};
		//roomExits.put(rooms[1], kitchenExits);
		
		Room familyroom = new Room(
				"The Family Room",
				"a comfortable space",
				"Another large room with 2 couches facing a large TV. There is a bar in the corner and many cabinets."+"\n"
				+"To the west is the kitchen which contains various kitchen appliances and a table. To the south is an entrance back to the foyer.");
		this.rooms[2] = familyroom;
		//Room[] frExits = {rooms[1], null, null, rooms[0]};
		//roomExits.put(rooms[2], frExits);
		
		Room livingroom = new Room(
				"The Living Room",
				"a space to gather",
				"A large room with 2 couches, 3 chairs and a piano. Paintings also adorn the walls with a few bookshelves."+"\n"
				+"To the north you can see a large table surrounded by chairs. To the east you can see the entryway and the hallway that also expands from it");
		this.rooms[3] = livingroom;
		//Room[] lrExits = {null, rooms[0], rooms[4], null};
		//roomExits.put(rooms[3], lrExits);
		
		Room diningroom = new Room(
				"The Dining Room",
				"a table to eat",
				"A large table in the center takes up most of the room, surrounded by 6 chairs. On the celling is a chandelier and cabinets line the walls with plates and cutlery"+"/n"
				+"To the south, you can see the couches of the living room. To the east, you can see the island and table of the kitchen.");
		this.rooms[4] = diningroom;
		//Room[] drExits = {null, rooms[1], null, rooms[4]};
		//roomExits.put(rooms[4], drExits);
		//diningroom.setExits(null, rooms[1], null, rooms[4]);
		
		foyer.setExits(rooms[2], rooms[3], rooms[1], null);
		kitchen.setExits(rooms[2], rooms[4], null, rooms[0]);
		familyroom.setExits(rooms[1], null, null, rooms[0]);
		livingroom.setExits(null, rooms[0], rooms[4], null);
		diningroom.setExits(null, rooms[1], null, rooms[4]);
		
	}
	
	//public HashMap<Room, Room[]> getExitsMap() {
	//	return roomExits;
	//}

}
