package project;
import java.time.LocalDateTime;
import java.util.UUID;

public class Request {
	private String firstName;
	private String lastName;
	private String email;
	private String attractionName;
	private String message;
	private String requestId;
	private LocalDateTime dateTime;
	
	public Request(String firstName, String lastName, String email, String attractionName, String message) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.attractionName = attractionName;
		this.message = message;
		this.requestId = UUID.randomUUID().toString();
		this.dateTime = LocalDateTime.now();
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

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		return "Request [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", attractionName="
				+ attractionName + ", message=" + message + ", requestId=" + requestId + ", dateTime=" + dateTime + "]";
	}

	public void display() {
		System.out.println(this.toString());
	}
	
}
