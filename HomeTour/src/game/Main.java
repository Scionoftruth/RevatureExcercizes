package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
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
		System.out.println("");
		System.out.println(cur.getName());
		System.out.println("");
		System.out.println(cur.getLongDescription());
		System.out.println("");
		System.out.println("Exits:");
		cur.printExits(cur);
	}
	
	private static String[] collectInput() {
		System.out.println("Where would you like to go?"+"\n"+"Type go (direction) or quit to end");
		String[] input = scanner.nextLine().toLowerCase().split(" ");
		return input;
	}
	
	private static void parse(String[] command, Player player) {
		if(command[0].equals("go")) {
			
			if (player.getCurrentRoom().getExit(player.getCurrentRoom(),command[1]) != null) {
				player.setCurrentRoom(player.getCurrentRoom().getExit(player.getCurrentRoom(),command[1]));
			}else {
				System.out.println("You cannot go that way!");
			}
		}else if (command[0].equals("quit")) {
			System.out.println("Thanks for Playing!");
			System.exit(0);
		}else {
			System.out.println("Please enter a correct command"+"\n");
		}
	}

}
