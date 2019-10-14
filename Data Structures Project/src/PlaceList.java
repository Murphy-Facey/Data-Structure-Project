import java.io.File;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//import java.io.PrintWriter;

public class PlaceList implements Serializable {
	private static final long serialVersionUID = 1L;
	private LinkedListNode head;
	
	public PlaceList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull() {
		LinkedListNode node = new LinkedListNode();
		if(node == null) {
			return true;
		}
		return false;
	}
	
	public void addPlace(Place data) {
		if(isFull()) {
			System.out.println("The list is full, we are unable to add anything");
		} else {
			LinkedListNode node = new LinkedListNode(data);
			if(isEmpty()) {
				head = node;
			} else {
				LinkedListNode current = head;
				while(current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(node);
			}
		}
	}
	
	public void showAll() {
		if(isEmpty()) {
			System.out.println("Nothing to see here");
		} else {
			LinkedListNode current = head;
			while(current.getNext() != null) {
				current.getData().display();
				current = current.getNext();
			}
			current.getData().display();
		}
	}
	
	public void showAllPlacesInna(int parishCode) {
		if(isEmpty()) {
			System.out.println("Nothing to see here");
		} else {
			LinkedListNode current = head;
			while(current.getNext() != null) {
				if(current.getData().getParishCode() == parishCode)
					current.getData().display();
				current = current.getNext();
			}
			if(current.getData().getParishCode() == parishCode)
				current.getData().display();
		}
	}
	
	public void writeToFile() throws IOException {
		if(isEmpty()) {
			System.out.println("Nothing to see here");
		} else {
			
			File file = new File("Places.txt");
			FileOutputStream fout = new FileOutputStream(file, true);
			ObjectOutputStream fileOutput = new ObjectOutputStream(fout);
			//FileWriter fw = new FileWriter(file);
			//PrintWriter pw = new PrintWriter(fw); // Not a very effecient way
			
			if(file.exists()) {
				LinkedListNode current = head;
				while(current.getNext() != null) {
					fileOutput.writeObject(current.getData());
					current = current.getNext();
				}
				fileOutput.writeObject(current.getData());
			}
			fileOutput.close();
		}
	}
	
	public void writeToFile2() throws IOException {
		if(isEmpty()) {
			System.out.println("Nothing to see here");
		} else {
			ObjectOutputStream output = null;
			try {
				output = new ObjectOutputStream(new FileOutputStream("Places.txt"));
				output.writeObject(this);
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
