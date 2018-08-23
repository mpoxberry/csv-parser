package org.personal.csvparser;

import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;

public class Manager {

	public JSONArray createJson(List<String> csvList) {
		//TODO: make json object
		//csvList.get(0)
		return new JSONArray();
	}
	
	public List<String> createList(String csvString) {	
		return Arrays.asList(csvString.split("\\r?\\n"));
	}
}
