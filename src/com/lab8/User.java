package com.lab8;

public class User {
	
	int _id;
	String fname;
	String surname;
	int age;
	String email;
	String sex;
	String title;
	Car car;
	
	
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	//printing out new data to screen in correct format
	public String toString() {
		return "User [_id=" + _id + ", fname=" + fname + ", surname=" + surname + ", age=" + age + ", email=" + email
				+ ", sex=" + sex + ", title=" + title + ", car=" + car + "]";
	}

	
}
