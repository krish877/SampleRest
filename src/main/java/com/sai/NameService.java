package com.sai;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class NameService {
	private Map<Integer, String> names = new HashMap<Integer, String>();

	public String getName(int id) {
		return names.get(id);
	}

	public void addName(String name) {
		names.put(names.size() + 1, name);
		System.out.println(name + " added to list");
	}

	public String listAllNames() {
		String list = "";
		try {
			list = new ObjectMapper().writeValueAsString(names);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
