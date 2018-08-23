package org.personal.csvparser;

import java.util.List;

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

}
