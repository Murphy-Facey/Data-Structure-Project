package project;
import java.util.Scanner;

public class Administrator {
	private PlaceList placeList;
	private Scanner input;
	
	public Administrator() {
		input = new Scanner(System.in);
		placeList = new PlaceList();
	}

	/**
	 * @return
	 */
	public Place getPlaceInfo() {
		Place place = new Place();
		System.out.println("Enter the name: ");
		place.setName(input.nextLine());
		System.out.println("Enter the desciption: ");
		place.setDescription(input.nextLine());
		System.out.println("Enter the address: ");
		place.setAddress(input.nextLine());
		System.out.println("Enter the parish code: ");
		place.setParishCode(input.nextInt());
		System.out.println("Enter the cost of entry: ");
		place.setCostOfEntry(input.nextFloat());
		System.out.println("Enter the opening hours: [FORMAT: HH:MM(PM/AM)]");
		place.setOpeningHours(input.next());
		System.out.println("Enter the contact number ");
		input.nextLine();
		place.setContactNumber(input.nextLine());
		System.out.println("Enter the url: ");
		place.setPhotoURL(input.nextLine());
		System.out.println("Enter the main attraction: ");
		place.setMainAttraction(input.nextLine());
		return place;
	}
	
	
	public PlaceList getPlaceList() {
		return placeList;
	}

	public void setPlaceList(PlaceList placeList) {
		this.placeList = placeList;
	}
	
	
	
}
