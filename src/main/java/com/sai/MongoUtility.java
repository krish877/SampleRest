package com.sai;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoUtility {

	private static MongoClient mongo = null;
	
	public static MongoClient createConnection() throws UnknownHostException{
		if(mongo == null){
			mongo = new MongoClient("localhost",27017);
		}
		return mongo;
	}

	public static String findContact(String name) {
		DB db=mongo.getDB("contactListApp");
		DBCollection coll = db.getCollection("contacts");
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", name);
		DBCursor cursor = coll.find(searchQuery);
		if(cursor.hasNext()){
			return cursor.next().toString();
		}
		return null;
		
		
	}

	public static String findAll() {
		StringBuffer strBuffer=new StringBuffer();
		DB db=mongo.getDB("contactListApp");
		DBCollection coll = db.getCollection("contacts");
		DBCursor cursor = coll.find();
		strBuffer.append("[");
		while(cursor.hasNext()){
			strBuffer.append(cursor.next().toString()+",");
		}
		return strBuffer.substring(0, strBuffer.length()-1)+"]";
		
	}
	
}
