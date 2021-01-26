package com.objarr.model.vo;

public class Car {
	
	private String modelName;
	private String brand;
	private int price;
	private String color;
	private int door;
	
	public Car() {}
	
	public Car(String modelName, String brand, int price, String color, int door) {
		//��ü�� ��������� �ʱ�ȭ�ϴ� ������ ��ü�� ������ �� ����ϴ� ��
		//�޼ҵ�� �ٸ� ��: ��ȯ���� ����
		//�������� �̸��� Ŭ������� ����
		//�⺻�����ڿ� �Ű������� �ִ� �����ڰ� �ְ� �̰� �Ű������� �ִ� ��������
		//�Ű����� �ִ� �����ڴ� �Ű������� ������ ���� ��������� �����ϱ� ���� ����ϴ� ����
		//��ü ���� �� ���
		this.modelName=modelName;//this�� ������ �ڱ��ڽſ� ���� �ּҸ� ������ �ִ� ����|��
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
