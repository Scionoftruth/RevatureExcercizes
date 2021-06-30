package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//scanner = new Scanner(System.in);
		RoomManager rm = new RoomManager();
		rm.init();
		Player player = new Player();
		player.setCurrentRoom(rm.startingRoom);
		int i = 0;
		while (i==0) {
			printRoom(player);
			String[] command = collectInput();
			parse(command, player);
		}
		scanner.close();
	}
	
	private static void printRoom(Player player) {
		Room cur = player.getCurrentRoom();
		System.out.println(cur.getName());
		System.out.println("");
		System.out.println(cur.getLongDescription());
		System.out.println("");
		System.out.println("Exits:");
		System.out.println(cur.getExits().toString());
	}
	
	private static String[] collectInput() {
		System.out.println("Where would you like to go?");
		String[] input = scanner.nextLine().toLowerCase().split(" ");
		return input;
	}
	
	private static void parse(String[] command, Player player) {
		/*do {
			for (int i=0; i<command.length; i++) {
				
			}
		}while(command[0] != ("quit"));*/
		if(command[0].equals("go")) {
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
		}else if (command[0]=="quit") {
			System.exit(0);
			System.out.println("Thanks for Playing!");
		}else {
			System.out.println("Please enter a correct command"+"\n");
		}
	}

}
