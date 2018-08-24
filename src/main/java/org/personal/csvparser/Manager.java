package org.personal.csvparser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;

public class Manager {

	public List<JSONObject> createJson(List<String> csvList) {
		List<String> l = csvList;
		List<String> p = csvJsonProperties(csvList.get(0));
		l.remove(0);

		List<JSONObject> jl = new ArrayList<>();

		for (String csv : l) {
			List<String> cl = Arrays.asList(csv.split(","));
			JSONObject jo = new JSONObject();

			for (int i = 0; i < cl.size(); i++) {
				jo.put(p.get(i), cl.get(i));
			}
			jl.add(jo);
		}

		return jl;
	}

	public List<String> createList(String csvString) {
		return Arrays.asList(csvString.split("\\r?\\n"));
	}

	public List<String> csvJsonProperties(String jsonProperties) {
		return Arrays.asList(jsonProperties.split(","));
	}
}
