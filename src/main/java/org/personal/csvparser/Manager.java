package org.personal.csvparser;

import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;

public class Manager {

	public JSONArray createJson(String csvString) {
		csvString.split(",");
		
		return new JSONArray();
	}
	
	public List<String> createList(String csvString) {
		List<String> l = Arrays.asList(csvString.split("\\r?\\n"));
		
		return l;
	}
}
