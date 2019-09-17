package part1;

import java.util.HashMap;
import java.util.Map;

public class CreoleToEnglishPhrases {
	private Map<String, String> creoleDictionary;
	private String creolePhrases;
	private String englishMeaning;
	
	public CreoleToEnglishPhrases() {
		this("", "");
	}
	
	public CreoleToEnglishPhrases(String creolePhrases, String englishMeaning) {
		super();
		this.creoleDictionary = new HashMap<String, String>();
		this.creolePhrases = creolePhrases;
		this.englishMeaning = englishMeaning;
	}

	public Map<String, String> getCreoleDictionary() {
		return creoleDictionary;
	}

	public void setCreoleDictionary(Map<String, String> creoleDictionary) {
		this.creoleDictionary = creoleDictionary;
	}

	public String getCreolePhrases() {
		return creolePhrases;
	}

	public void setCreolePhrases(String creolePhrases) {
		this.creolePhrases = creolePhrases;
	}

	public String getEnglishMeaning() {
		return englishMeaning;
	}

	public void setEnglishMeaning(String englishMeaning) {
		this.englishMeaning = englishMeaning;
	}
	
	public void addToDictionary(String creole, String english) {
		this.creoleDictionary.put(creole, english);
	}
	
}
