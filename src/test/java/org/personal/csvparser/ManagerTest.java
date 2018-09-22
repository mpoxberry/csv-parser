package org.personal.csvparser;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
	Manager manager = new Manager();
	
	final String goodCSVInput = "date,gasStation,costPerGallon,totalPurchased,mileage,manualMpg,tripA,totalGas\r\n" +
			"8/13/1998,Merit,$0.889,$10.50,240,,11.900\r\n" +
			"8/29/1998,Texaco,$0.999,$11.00,540,27.3,--,11.010\r\n" +
			"9/9/1998,Texaco,$0.999,$10.50,825,27.1,--,10.500";
	
	List<String> goodListInput = new ArrayList<>();
	
	@Before
	public void setup() {
		goodListInput.add("date,gasStation,costPerGallon,totalPurchased,mileage,manualMpg,tripA,totalGas");
		goodListInput.add("8/13/1998,Merit,$0.889,$10.50,240,,11.900");
		goodListInput.add("8/29/1998,Texaco,$0.999,$11.00,540,27.3,--,11.010");
		goodListInput.add("9/9/1998,Texaco,$0.999,$10.50,825,27.1,--,10.500");
	}
	
	@Test
	public void createListTest() {
		String goodInput = this.goodCSVInput;
		
		List<String> goodOutput = new ArrayList<>();
		goodOutput.add("date,gasStation,costPerGallon,totalPurchased,mileage,manualMpg,tripA,totalGas");
		goodOutput.add("8/13/1998,Merit,$0.889,$10.50,,11.900");
		goodOutput.add("8/29/1998,Texaco,$0.999,$11.00,540,27.3,--,11.010");
		goodOutput.add("9/9/1998,Texaco,$0.999,$10.50,825,27.1,--,10.500");
		
		List<String> testOutput = manager.createList(goodInput);
		System.out.println(testOutput);
		System.out.println("createTest() size: " + testOutput.size());
	}
	
	@Test
	public void createJsonTest() {
		List<String> goodInput = this.goodListInput;
		
		List<JSONObject> actual = manager.createJson(goodInput);
		
		
		assertThat(actual, is(notNullValue()));
		
	}
	
	@Test
	public void createJsonPropertiesTest() {
		String goodInput = "date,gasStation,costPerGallon,totalPurchased,mileage,manualMpg,tripA,totalGas";
		
		List<String> actual = manager.csvJsonProperties(goodInput);
		
		List<String> expected = new ArrayList<>();
		expected.add("date");
		expected.add("gasStation");
		expected.add("costPerGallon");
		expected.add("totalPurchased");
		expected.add("mileage");
		expected.add("manualMpg");
		expected.add("tripA");
		expected.add("totalGas"); 
		
		assertThat(actual, is(expected));
	}

}
