//Grace Keane
//Data Centric Web Applications
//Connecting mongo to a java eclipse programme
package com.lab8;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import static com.mongodb.client.model.Projections.*;

import java.util.ArrayList;

public class Lab8 {

	public static void main(String[] args) {
		
		MongoClient mongoClient = new MongoClient();

		MongoDatabase database = mongoClient.getDatabase("usersdb");

		MongoCollection<Document> lab8col = database.getCollection("lab8");

		lab8col.find();
		
		//Displaying all information
		//FindIterable<Document> users = lab8col.find();
		
		//Displaying the first name, surname and age but not including the id
		//FindIterable<Document> users = lab8col.find().projection(fields(include("fname", "surname", "age"), excludeId()));
		
		//Displaying everything except for the fname, surname and id attributes
		//FindIterable<Document> users = lab8col.find().projection(fields(exclude("fname", "surname"), excludeId()));
		
		//displaying the car attribute only (no id included)
		//FindIterable<Document> users = lab8col.find().projection(fields(include("car"), excludeId()));
		
		//displaying car attribute including the id
		//FindIterable<Document> users = lab8col.find().projection(fields(include("car")));
		
		//finding all documents with the age of 20
		//BasicDBObject query = new BasicDBObject();
		//query.put("age", 20);
		//FindIterable<Document> users = lab8col.find(query);
		
		//finding all documents with the age greater than 20
		//BasicDBObject query = new BasicDBObject();
		//query.put("age",  new BasicDBObject("$gt", 20));
		//FindIterable<Document> users = lab8col.find(query);
		
		//finding all documents with the age greater than 20
		//BasicDBObject query = new BasicDBObject();
		//query.put("age",  new BasicDBObject("$gt", 20));
		//FindIterable<Document> users = lab8col.find(query);
		
		/*
		FindIterable<Document> users = lab8col.find().projection(fields(include("car"), excludeId()));
		
		//Deleting a person with an id of 102
		BasicDBObject query = new BasicDBObject();
		query.put("_id", 102);
		lab8col.deleteOne(query);
		
		BasicDBObject queryA = new BasicDBObject();
		queryA.put("$gt", 20);
		BasicDBObject queryA1 = new BasicDBObject();
		queryA.put("age", queryA);
		lab8col.find(queryA1);
		*/
		
		/*
		//Adding data to the database
		Document myDoc = new Document();
		myDoc.append("_id", 400)
		.append("fname", "Billy")
		.append("surname", "Collins")
		.append("age", 23)
		.append("email", "billy63@hotmail.com")
		.append("sex", "M")
		.append("title", "Mr");
		
		Document myDoc2 = new Document();
		myDoc.append("_id", 401)
		.append("fname", "Mary")
		.append("surname", "Behan")
		.append("age", 27)
		.append("email", "mary@gmail.com")
		.append("sex", "F")
		.append("title", "Mrs");
		
		ArrayList<Document> docs = new ArrayList<Document>();
		docs.add(myDoc);
		docs.add(myDoc2);
		
		lab8col.insertMany(docs);
		
		*/
		
		/*
		for (Document d : users) 
		{
			System.out.println(d.toJson());
		}
		*/
		
		/*
		//printing out the ages
		for (Document d : users) 
		{
			System.out.println(d.getInteger("age"));
		}
		*/
		
		/*
		//printing out if a document has age 24
		//Only one displays true so only one person has an age of 24
		for (Document d : users) 
		{
			System.out.println(d.getInteger("age")==24);
		}
		*/
		
		/*
		//If String length is greater than 5, then it prints out the surname and age
		for (Document d : users) 
		{
			System.out.println(d.getString("surname").length() > 6);
			System.out.println(d.getString("surname") + " " + d.getInteger("age"));
		}
		*/
		
		/*
		//creating new data manually
		Car c1 = new Car();
		c1.setFuel("petrol");
		c1.setReg("192-G-1");

		Car c2 = new Car();
		c2.setFuel("diesel");
		c1.setReg("10-WH-123");
		
		User u1 = new User();
		u1.set_id(999);
		u1.setAge(23);
		u1.setEmail("tom@gmail.com");
		u1.setFname("Tom");
		u1.setSex("M");
		u1.setSurname("Murphy");
		u1.setTitle("Mr");
		u1.setCar(c1);
		
		User u2 = new User();
		u2.set_id(888);
		u2.setAge(56);
		u2.setEmail("Mary@gmail.com");
		u2.setFname("Mary");
		u2.setSex("F");
		u2.setSurname("Smith");
		u2.setTitle("Ms");
		u2.setCar(c2);

		//adding data to an array
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);

		for(User x : userList)
		{
			System.out.println(x);
		}
		
		*/
		
		ArrayList<User> userList = new ArrayList<User>();
		Gson gson = new Gson();
		
		FindIterable<Document> users = lab8col.find();

		for (Document d : users)
		{
			   User user = gson.fromJson(d.toJson(), User.class);
			   userList.add(user);
		}
		
		for(User x: userList)
		{
			System.out.println(x);
		}

		//close
		mongoClient.close();

	}
}
