import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		Administrator admin = new Administrator();
		admin.getPlaceList().addPlace(new Place(1, "Name1", "Desc1", "Address1", 11, 1.0f, "8:00AM", "Contact1", "URL1", "Attraction1"));
		admin.getPlaceList().addPlace(new Place(2, "Name2", "Desc2", "Address2", 12, 2.0f, "9:00AM", "Contact2", "URL2", "Attraction2"));
		admin.getPlaceList().addPlace(new Place(3, "Name3", "Desc3", "Address3", 13, 3.0f, "10:00AM", "Contact3", "URL3", "Attraction3"));
		
		admin.getPlaceList().showAll();
		try {
			admin.getPlaceList().writeToFile();
			System.out.println("dsasda");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		Visitor visitor = new Visitor("Murphy", "Feacy", "faceymaxal17@gmail.com");
		visitor.getCommands("Which part have di cheapest St.Catherine");
	}
}
