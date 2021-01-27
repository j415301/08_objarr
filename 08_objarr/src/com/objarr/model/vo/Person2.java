package com.objarr.model.vo;

public class Person2 {
	
	private String name;
	private int age;
	private char gender;
	private String number;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public Person2(String name, int age, char gender, String number) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return name+"\t"+age+"\t"+gender+"\t"+number;
	}

}
