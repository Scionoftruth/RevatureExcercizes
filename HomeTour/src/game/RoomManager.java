package game;

import java.util.HashMap;
import java.util.Map;

import fixtures.Room;

public class RoomManager {
	
	static Map<Room,Map<String,Room>> roomCollection = new HashMap<Room, Map<String,Room>>();
	
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
		
		Room kitchen = new Room(
				"The Kitchen",
				"a large kitchen",
				"A large kitchen of the house with an island, table, stove and fridge. There is a dining room to the west, where a large table can be seen."+"\n"
				+"To the east is another large room that contains couches and a TV. To the south you see the front door and hallway");
		this.rooms[1] = kitchen;
		
		Room familyroom = new Room(
				"The Family Room",
				"a comfortable space",
				"Another large room with 2 couches facing a large TV. There is a bar in the corner and many cabinets."+"\n"
				+"To the west is the kitchen which contains various kitchen appliances and a table. To the south is an entrance back to the foyer.");
		this.rooms[2] = familyroom;
		
		Room livingroom = new Room(
				"The Living Room",
				"a space to gather",
				"A large room with 2 couches, 3 chairs and a piano. Paintings also adorn the walls with a few bookshelves."+"\n"
				+"To the north you can see a large table surrounded by chairs. To the east you can see the entryway and the hallway that also expands from it");
		this.rooms[3] = livingroom;
		
		Room diningroom = new Room(
				"The Dining Room",
				"a table to eat",
				"A large table in the center takes up most of the room, surrounded by 6 chairs. On the celling is a chandelier and cabinets line the walls with plates and cutlery"+"/n"
				+"To the south, you can see the couches of the living room. To the east, you can see the island and table of the kitchen.");
		this.rooms[4] = diningroom;
		
		//foyer.setExits(rooms[2], rooms[3], rooms[1], null);
		//kitchen.setExits(rooms[2], rooms[4], null, rooms[0]);
		//familyroom.setExits(rooms[1], null, null, rooms[0]);
		//livingroom.setExits(null, rooms[0], rooms[4], null);
		//diningroom.setExits(null, rooms[1], null, rooms[4]);
	
		Map<String,Room> foyerExits = new HashMap<String, Room>();
		foyerExits.put("east", rooms[2]);
		foyerExits.put("west", rooms[3]);
		foyerExits.put("north", rooms[1]);
		//foyerExits.put("south", null);
		
		Map<String,Room> kitchenExits = new HashMap<String, Room>();
		kitchenExits.put("east", rooms[4]);
		kitchenExits.put("west", rooms[2]);
		//kitchenExits.put("north", null);
		kitchenExits.put("south", rooms[0]);
		
		Map<String,Room> frExits = new HashMap<String, Room>();
		//frExits.put("east", null);
		frExits.put("west", rooms[1]);
		//frExits.put("north", null);
		frExits.put("south", rooms[0]);
		
		Map<String,Room> lrExits = new HashMap<String, Room>();
		//lrExits.put("east", null);
		lrExits.put("west", rooms[0]);
		lrExits.put("north", rooms[4]);
		//lrExits.put("south", null);
		
		Map<String,Room> drExits = new HashMap<String, Room>();
		drExits.put("east", rooms[1]);
		//drExits.put("west", null);
		//drExits.put("north", null);
		drExits.put("south", rooms[3]);
		
		roomCollection.put(foyer, foyerExits);
		roomCollection.put(kitchen, kitchenExits);
		roomCollection.put(familyroom, frExits);
		roomCollection.put(livingroom, lrExits);
		roomCollection.put(diningroom, drExits);
		
	}
	
	public Map<Room, Map<String,Room>> getRoomCollection(){
		return roomCollection;
	}
	
	
	//public HashMap<Room, Room[]> getExitsMap() {
	//	return roomExits;
	//}
}
