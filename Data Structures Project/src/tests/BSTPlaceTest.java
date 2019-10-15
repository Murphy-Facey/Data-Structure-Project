package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import project.*;

import org.junit.jupiter.api.Test;

class BSTPlaceTest {
	private BSTPlace places=null;
	private Place[] testData=null;
	
	@BeforeEach //runs before each test
	void setUp() throws Exception {
		testData = new Place[5];
		for(int i=0;i<5;i++) {
			testData[i]=new Place();
			testData[i].setId(i+1);
		}
		places = new BSTPlace();
	}

	@AfterEach //runs after each test
	void tearDown() throws Exception {
	}

	@Test
	void shouldAddAndRetrieve_1_Place() {
			
		places.put(1, testData[0]);
		Place result = places.get(1);
		assertEquals(result,testData[0]);
	}
	
	@Test
	void shouldAddAndRetrieve_2_Place() {
			
		places.put(1, testData[0]);
		places.put(2, testData[1]);
		Place result = places.get(2);
		assertEquals(result,testData[1]);
	}
	
	@Test
	void shouldAddAndRetrieve_3_Place() {
		
		places.put(2, testData[1]);
		places.put(1, testData[0]);
		places.put(3, testData[2]);
		Place result = places.get(1);
		assertEquals(result,testData[0]);
	}

}
