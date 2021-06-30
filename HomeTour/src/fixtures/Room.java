package fixtures;

//import java.util.HashMap;
//import java.util.Map;
//import game.RoomManager;

public class Room extends Fixture{
	
	//Map<Room, Room[]> roomExits = new HashMap<Room, Room[]>();
	
	//RoomManager rm = new RoomManager();
	
	Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
	public void setExits(Room east, Room west, Room north, Room south) {
		//Map<Room, Room[]> roomExits = new HashMap<Room, Room[]>();
		exits[0]=east;
		exits[1]=west;
		exits[2]=north;
		exits[3]=south;
		
	}
	
	
	public Room[] getExits() {
		//return rm.getExitsMap().get(input);
		return exits;
	}
	
	public Room getExit(String direction) {
		switch(direction) {
		case "east":
			return exits[0];
		case "west":
			return exits[1];
		case "north":
			return exits[2];
		case "south":
			return exits[3];
		default:
			System.out.println("Sorry, I do not recoginze that direction");
			return null;
		}
		
	}
	
	public void printExits(Room[] exits) {
		for (int i=0;i<exits.length;i++) {
			System.out.println(exits[i].getShortDescription());
			
		}
	}
}
