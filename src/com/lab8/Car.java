/*
 * 
Writing a Java application that connects to the Mongo database and a collection that is just 
created. It also gets full details of all documents.
Each document will be stored in an associated User object.
In each User object where the fuel type of Car is “petrol”, it should be changed to “electric”.
 * 
 */
package com.lab8;

public class Car {
	
	String reg;
	
	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	String fuel;
	
	@Override
	public String toString() {
		return "Car [reg=" + reg + ", fuel=" + fuel + "]";
	}
	
	

}
