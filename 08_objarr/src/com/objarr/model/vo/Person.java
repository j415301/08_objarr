package com.objarr.model.vo;

public class Person {
	//Person클래스 생성
			//이름, 나이, 성별, 전화번호
			//Person을 5명 저장할 수 있는 저장공간 확보
			//1. 유병승 19 남 01036446259
			//2. 김상현 29 남 35554654625
			//3. 김태희 26 남 43268645445
			//4. 김예진 26 여 16546387654
			//5. 생성하고 비워둠 나중에 채움
			//전체를 출력하세요
	
	private String name;
	private int age;
	private char gender;
	private String number;
	
	public Person() {}
	
	public Person(String name, int age, char gender, String number) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	
	//손쉽게 객체배열 출력하는 법
	public String toString() {
		return ""+name+" "+age+" "+gender+" "+number;
	}

}
