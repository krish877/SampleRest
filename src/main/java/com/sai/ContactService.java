package com.sai;

import java.net.UnknownHostException;

public class ContactService {
	
	public ContactService(){
		try {
			MongoUtility.createConnection();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getContact(String name){
		return MongoUtility.findContact(name);
	}
	
	public String getAllContacts(){
		return MongoUtility.findAll();
	}

}
