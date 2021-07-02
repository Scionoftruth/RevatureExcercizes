package fixtures;

import java.util.Iterator;
import java.util.Map;

import game.RoomManager;

public class Room extends Fixture{
	
	RoomManager rm = new RoomManager();
	
	Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
	/*public void setExits(Room east, Room west, Room north, Room south) {
		//Map<Room, Room[]> roomExits = new HashMap<Room, Room[]>();
		exits[0]=east;
		exits[1]=west;
		exits[2]=north;
		exits[3]=south;
		
	}*/
	
	
	/*public Room[] getExits() {
		//return rm.getExitsMap().get(input);
		return exits;
	}*/
	
	public Room getExit(Room currentRoom,String direction) {
		/*switch(direction) {
		case "east":
			return exits[0];
		case "west":
			return exits[1];
		case "north":
			return exits[2];
		case "south":
			return exits[3];
		default:
			System.out.println("Sorry, I do not recognize that direction");
			return null;
		}*/
		Map<String,Room> temp = rm.getRoomCollection().get(currentRoom);
		Iterator<Map.Entry<String, Room>> it = temp.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Room> entry = it.next();
			if (entry.getKey().equals(direction)){
				return entry.getValue();
			}
	
		}
		return null;
	}
	
	public void printExits(Room currentRoom) {
		Map<String,Room> temp = rm.getRoomCollection().get(currentRoom);
		for (Map.Entry<String, Room> entry : temp.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue().getShortDescription());
		}
		
	}
}
