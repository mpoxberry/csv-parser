package org.personal.csvparser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.junit.Test;

public class ManagerTest {
	Manager manager = new Manager();
	
	@Test
	public void createListTest() {
		String goodInput = "Asset being sold,Asset being purchased,Dollar Value,Account Owner\r\n" + 
				"Cash,GOOG,215,vk49No9e\r\n" + 
				"TWTR,BTC,455,79kRyE6h\r\n" + 
				"Cash,FB,6,vk49No9e";
		
		List<String> testOutput = manager.createList(goodInput);
		
		System.out.println(testOutput);
		System.out.println("createTest() size: " + testOutput.size());
	}
	
	@Test
	public void createJsonTest() {
		List<String> goodInput = new ArrayList<>();
		goodInput.add("date,gasStation,costPerGallon,totalPurchased,mileage,manualMPG,tripA,totalGas");
		goodInput.add("8/13/1998,Merit,$0.889,$10.50,240,,--,11.900");
		goodInput.add("8/29/1998,Texaco,$0.999,$11.00,540,27.3,--,11.010");
		goodInput.add("9/9/1998,Texaco,$0.999,$10.50,825,27.1,--,10.500");
		
		List<JSONObject> testOutput = manager.createJson(goodInput);
		
		System.out.println(testOutput);
	}

}
