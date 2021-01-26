package com.objarr.model.vo;

public class Car {
	
	private String modelName;
	private String brand;
	private int price;
	private String color;
	private int door;
	
	public Car() {}
	
	public Car(String modelName, String brand, int price, String color, int door) {
		//객체의 멤버변수를 초기화하는 것으로 객체를 생성할 때 사용하는 것
		//메소드와 다른 점: 반환형이 없음
		//생성자의 이름은 클래스명과 같음
		//기본생성자와 매개변수가 있는 생성자가 있고 이건 매개변수가 있는 생성자임
		//매개변수 있는 생성자는 매개변수로 들어오는 값을 멤버변수에 대입하기 위해 사용하는 것임
		//객체 생성 시 사용
		this.modelName=modelName;//this는 생성된 자기자신에 대한 주소를 가지고 있는 변수|값
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.door=door;
	}
	
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	public String getModelName() {
		return modelName;
	}
	
	
	public void setBrand (String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return door;
	}
	
	
}
