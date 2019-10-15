package project;
import java.io.Serializable;

public class Place implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	private String address;
	private int parishCode;
	private float costOfEntry;
	private String openingHours;
	private String contactNumber;
	private String photoURL;
	private String mainAttraction;
	
	public Place() {
		this(0, "", "", "", 0, 0.0f, "", "", "", "");
	}
	
	public Place(int id, String name, String description, String address, int parishCode, float costOfEntry,
			String openingHours, String contactNumber, String photoURL, String mainAttraction) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.address = address;
		this.parishCode = parishCode;
		this.costOfEntry = costOfEntry;
		this.openingHours = openingHours;
		this.contactNumber = contactNumber;
		this.photoURL = photoURL;
		this.mainAttraction = mainAttraction;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getParishCode() {
		return parishCode;
	}

	public void setParishCode(int parishCode) {
		this.parishCode = parishCode;
	}

	public float getCostOfEntry() {
		return costOfEntry;
	}

	public void setCostOfEntry(float costOfEntry) {
		this.costOfEntry = costOfEntry;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getMainAttraction() {
		return mainAttraction;
	}

	public void setMainAttraction(String mainAttraction) {
		this.mainAttraction = mainAttraction;
	}
	
	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
				+ ", parishCode=" + parishCode + ", costOfEntry=" + costOfEntry + ", openingHours=" + openingHours
				+ ", contactNumber=" + contactNumber + ", photoURL=" + photoURL + ", mainAttraction=" + mainAttraction
				+ "]";
	}

	public void display() {
		System.out.println(this.toString());
	}
}
