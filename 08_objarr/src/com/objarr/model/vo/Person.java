package com.objarr.model.vo;

public class Person {
	//PersonŬ���� ����
			//�̸�, ����, ����, ��ȭ��ȣ
			//Person�� 5�� ������ �� �ִ� ������� Ȯ��
			//1. ������ 19 �� 01036446259
			//2. ����� 29 �� 35554654625
			//3. ������ 26 �� 43268645445
			//4. �迹�� 26 �� 16546387654
			//5. �����ϰ� ����� ���߿� ä��
			//��ü�� ����ϼ���
	
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
	
	//�ս��� ��ü�迭 ����ϴ� ��
	public String toString() {
		return ""+name+" "+age+" "+gender+" "+number;
	}

}
