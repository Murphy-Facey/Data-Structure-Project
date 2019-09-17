package part1;

public class Places {
	private String name;
	private String address;
	private String contactNumber;
	private String attractionType;
	private String parishName;
	
	public Places() {
		this("", "", "", "", "");
	}
	
	public Places(String name, String address, String contactNumber, String attractionType, String parishName) {
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.attractionType = attractionType;
		this.parishName = parishName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAttractionType() {
		return attractionType;
	}

	public void setAttractionType(String attractionType) {
		this.attractionType = attractionType;
	}

	public String getParishName() {
		return parishName;
	}

	public void setParishName(String parishName) {
		this.parishName = parishName;
	}
}
