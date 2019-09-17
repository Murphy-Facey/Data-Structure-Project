package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Visitor {
	/*
	 * So as a visitor, you show be able to:
	 * 1. View a listing of listing of Creole Phrases and their English translation
	 * 2. Request a listing of places in a parish using a specific command
	 * 3. Request a info on a place using a specific command
	 * 
	 * */
	
	private Scanner input = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	public void viewPhrases() {
		/*
		 * Now there is many ways to implement this but at the end of the day,
		 * you are the one to choose which is the most suitable approach.
		 * 
		 *  Method #1
		 * -----------
		 * Create a class for creole to english translation
		 * Use that class to do what's required
		 * 
		 * */
		CreoleToEnglishPhrases phrases = new CreoleToEnglishPhrases();
		phrases.addToDictionary("Man", "This is examples");
		phrases.addToDictionary("Yaad", "Home");
		phrases.addToDictionary("Y Pree", "What is up?");
		
		
		System.out.println("What is the creole phrase: ");
		System.out.println(phrases.getCreoleDictionary().get(input.nextLine()));
		
		
		/*
		 *  Method #2
		 * -----------
		 * Use a comma, separate file to read the data from the file and so forth
		 * 
		 * */
		String fileName = "src/Phrases.txt";
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
           
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                phrases.getCreoleDictionary().put(attributes[0], attributes[1]);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        System.out.println("What is the creole phrase: ");
		System.out.println(phrases.getCreoleDictionary().get(input.nextLine()));
		
		/*
		 *  Method #3
		 * -----------
		 * This is just more files stuff that I won't even bother doing.
		 * Just think more ADTs and files
		 * 
		 * */
		
	}

	
	/*
	 * If you look at Question 6 carefully, you realise that you actually
	 * info you want to get from a visitor to be stored in the database
	 * that we obviously have not made yet
	 * 
	 * */
	
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
		
	//the other functions have more to do with files and ADTs and other stuff
	//I won't be able to implement it tonight though
	
}
