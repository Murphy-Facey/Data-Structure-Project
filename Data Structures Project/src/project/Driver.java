package project;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) {
		String[] parishName = {"Kingston & St. Andrew", "St. Thomas", "Portland", "St. Mary", "St. Catherine", "Claredon", "Manchester", "St. Ann", "St. Elizabeth", "St. James", "Hanover", "Westmoreland", "Trelawny"};
		
		
		Administrator admin = new Administrator();
		admin.getPlaceList().addPlace(new Place(1, "Name1", "Desc1", "Address1", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name2", "Desc2", "Address2", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name3", "Desc3", "Address3", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		admin.getPlaceList().addPlace(new Place(1, "Name4", "Desc4", "Address4", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name5", "Desc5", "Address5", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name6", "Desc6", "Address6", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		admin.getPlaceList().addPlace(new Place(1, "Name7", "Desc7", "Address7", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name8", "Desc8", "Address8", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name9", "Desc9", "Address9", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		admin.getPlaceList().addPlace(new Place(1, "Name10", "Desc10", "Address10", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name11", "Desc11", "Address11", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name12", "Desc12", "Address12", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		admin.getPlaceList().addPlace(new Place(1, "Name13", "Desc13", "Address13", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name14", "Desc14", "Address14", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name15", "Desc15", "Address15", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		admin.getPlaceList().addPlace(new Place(1, "Name16", "Desc16", "Address16", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name17", "Desc17", "Address17", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name18", "Desc18", "Address18", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		admin.getPlaceList().addPlace(new Place(1, "Name19", "Desc19", "Address19", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));

		try {
			admin.getPlaceList().writeToFile2();
			System.out.println("dsasda");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new FileInputStream("Places.txt"));
			
			PlaceList places = (PlaceList) input.readObject();
			if(places != null) {
				places.showAll();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		Visitor visitor = new Visitor("Murphy", "Feacy", "faceymaxal17@gmail.com");
		visitor.getCommands("Which part have di cheapest St. Catherine");
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(getParishCode(parishName, visitor.getCommands("Which part have di cheapest St. Thomas")));
		System.out.println("-------------------------------------------------------------------------------------");
		admin.getPlaceList().showAllPlacesInna(getParishCode(parishName, visitor.getCommands("Which part have di cheapest St. Thomas")) + 11);
		
		Request[] requests = {
			new Request(
				visitor.getFirstName(),
				visitor.getLastName(), 
				visitor.getEmail(),
				"AttractionName",
				"I love this place"
			),
			new Request(
				"Donald",
				"MacFarths", 
				"d.farths@someonehelpme.com",
				"Attraction",
				"I love this place"
			),
			new Request(
				"You know",
				"What it is", 
				"gottahaveit@youknowwhatitis.global",
				"AttractionName1",
				"I love this place :-P"
			)	
		};
		
		RequestList rList = new RequestList();
		
		for(Request r: requests) {
			rList.push(r);
		}
		
		
		System.out.println("**************************************");
		rList.display();
		
		ProcessedQueue queue = new ProcessedQueue();
		queue.enQueue(rList.pop());
		queue.enQueue(rList.pop());
		queue.enQueue(rList.pop());
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		queue.dequeue().display();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		BSTPlace bst = new BSTPlace();
		Place p1 = new Place(1, "Name1", "Desc1", "Address1", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1");
		Place p2 = new Place(2, "Name2", "Desc2", "Address2", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2");
		
		bst.put(p1.getCostOfEntry(), p1);
		bst.put(p2.getCostOfEntry(), p2);
		
		
		
		bst.get(1.0f).display();
		
		
		
	}
	
	public static int getParishCode(String[] parishes, String parish) {
		for(int i = 0; i < parishes.length; i++) {
			if(parishes[i].equals(parish))
				return i;
		}
		return -1;
	}	
}
