
public class Visitor {
	private String firstName;
	private String lastName;
	private String email;
	
	public Visitor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCommands(String command) {
		if(command.contains("Gimmi all a di place dem inna")) {
			String parishName = command.substring(30);
			getAllDiPlaceInnna(parishName);
			return parishName;
		} else if(command.contains("Which part have di cheapest")) {
			String attractionName = command.substring(28);
			getCheapestAttraction(attractionName);
			return attractionName;
		}
		return null;
	}
	
	private void getAllDiPlaceInnna(String parishName) {
		System.out.println(parishName);
		System.out.println("Get all the place activated");
	}
	
	private void getCheapestAttraction(String attractionName) {
		System.out.println(attractionName);
		System.out.println("Cheapest");
	}
	
}
