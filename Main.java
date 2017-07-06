package ArrayList;

import java.util.Scanner;

public class Main {
	// get input via console
	private static Scanner scanner = new Scanner(System.in);
	// inherit class: TakenLijst
	private static TakenLijst takenLijst = new TakenLijst();


	// main method
	public static void main(String[] args) {
			boolean quit = false;
			int choice = 0;
			printInstructions();
			while(!quit) {
				System.out.println("Voer je keuze in: ");
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch(choice){
				case 0:
					printInstructions();
					break;
				case 1:
					takenLijst.printTakenLijst();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					quit = true;
					break;	
			}
		}
	}
	
	public static void printInstructions(){
		System.out.println("\nMaak uw keuze: ");
		System.out.println("\t 0 - Takenlijst opties. ");
		System.out.println("\t 1 - Takenlijst printen. ");
		System.out.println("\t 2 - Taak toevoegen");
		System.out.println("\t 3 - Taak wijzigen. ");
		System.out.println("\t 4 - Taak verwijderen. ");
		System.out.println("\t 5 - Taak zoeken. ");
		System.out.println("\t 6 - Takenlijst afsluiten. ");
	}
	
	public static void addItem(){
		System.out.print("Voeg taak aan lijst: ");
		takenLijst.addTakenLijst(scanner.nextLine());
	}
	
	public static void modifyItem(){
		System.out.print("Voer taak nummer dat gewijzigd moet worden in: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Voer nieuwe taak in: ");
		String newItem = scanner.nextLine();
		takenLijst.modifyTaak(itemNo-1, newItem);
	}
	
	public static void removeItem(){
		System.out.print("Voer taak nummer dat verwijderd moet worden: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		takenLijst.removeTaak(itemNo);
	}
	
	public static void searchForItem(){
		System.out.println("Zoek taak: ");
		String searchItem = scanner.nextLine();
		if(takenLijst.findItem(searchItem) !=null) {
			System.out.println("Gevonden taak " + searchItem + "in jouw takenlijst.");
		} else {
			System.out.println(searchItem + " is niet in jouw takenlijst.");
		}
	}
	
}
