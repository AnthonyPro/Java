package ArrayList;

import java.util.ArrayList;

public class TakenLijst {

	private ArrayList<String> takenLijst = new ArrayList<String>();

	// create a task
	public void addTakenLijst(String item) {
		takenLijst.add(item);
	}

	// print all tasks .size
	public void printTakenLijst() {
		System.out.println("Je hebt " + takenLijst.size() + " taken in je To Do Lijst!");
		for (int i = 0; i < takenLijst.size(); i++) {
			System.out.println((i+1) + "." + takenLijst.get(i));
		}
	}

	// modify task .set
	public void modifyTaak(int position, String newItem) {
		takenLijst.set(position, newItem);
		System.out.println("Taak " + (position+1) + " is gewijzigd. ");
	}

	// remove task .get .remove
	public void removeTaak(int position) {
		String theItem = takenLijst.get(position);
		takenLijst.remove(position);
	}
	
	// search item and get index position
	public String findItem(String searchItem) {
		int position = takenLijst.indexOf(searchItem);
			if (position >=0){
				return takenLijst.get(position);
			}
				return null;
			}
	}
