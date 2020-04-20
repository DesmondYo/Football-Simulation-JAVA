import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MenuAppWithList {

	static Scanner scanner = new Scanner(System.in);
	static List<String> players = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		 while (choice != -1) {
			 
			 showMenu();
			 
			 choice = getUserChoice();
			 if (choice == 1) {
				 printFootballPlayerNames();
			} else if (choice == 2) {
				addNewPlayer();
			} else if (choice == 3) {
				deletePlayer();
			} else if (choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.println("Please select a valid option");
			}
		 }

	}

	public static void showMenu() {
		System.out.println("1) Print Football Player Names");
		System.out.println("2) Add New Player");
		System.out.println("3) Delete Player at Position");
		System.out.println("4) Exit");
		System.out.println("------------------------------------");
		

	}
	
	public static int getUserChoice() {
		return scanner.nextInt();

	}
	
	public static void printFootballPlayerNames() {
		for (String player : players) {
			System.out.println(player);
		}
	}	
	
	public static void addNewPlayer() {
		System.out.println("Enter the name you would like to add: ");
		String name = scanner.next();
		players.add(name);
		System.out.println("Player added: " + name);
	}
	
	public static void deletePlayer() {
		System.out.println("Enter the index of the player you wish to delete: ");
		int index = getUserChoice();
		if (index < players.size()) {
			players.remove(index);
		}
	}
}