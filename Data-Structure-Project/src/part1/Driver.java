package part1;

public class Driver {
	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		visitor.viewPhrases();
		
		Admin admin = new Admin();
		//this is an example of how an admin can
		//you the methods and whatever in places
		admin.getPlace().getName();
		
		
	}
}
