package com.sai;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoUtility {

	private static MongoClient mongo = null;
	
	public static MongoClient createConnection() throws UnknownHostException{
		if(mongo == null){
			mongo = new MongoClient("localhost",27017);
		}
		return mongo;
	}

	public static Contact findContact(String name) {
		DB db=mongo.getDB("contactListApp");
		DBCollection coll = db.getCollection("contacts");
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", name);
		DBCursor cursor = coll.find(searchQuery);
		System.out.println(cursor.next());
		return null;
		
		
	}
	
}
