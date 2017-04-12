package com.demo.model;

public class Author {
	private int id;	
	private String name;
	private int age;
	private String zipcode;
	// private --> encapsulation
	public Author(int id, String name, int age, String zipcode) {
		super();
//		this.id = id;
		this.name = name;
		this.age = age;
		this.zipcode = zipcode;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Author(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String toString() {
		return id + "==>" + name + "==>" + zipcode;
	}
	
}
