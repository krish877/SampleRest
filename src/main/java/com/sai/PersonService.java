package com.sai;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class PersonService {

	private Map<Integer, Person> persons = new HashMap<Integer, Person>();

	public Person getName(int id) {
		return persons.get(id);
	}

	public void addName(Person name) {
		persons.put(persons.size() + 1, name);
		System.out.println(name + " added to list");
	}

	public String listAllNames() {
		String list = "";
		try {
			list = new ObjectMapper().writeValueAsString(persons);
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
