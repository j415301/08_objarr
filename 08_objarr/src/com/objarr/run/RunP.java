package com.objarr.run;

import com.objarr.model.vo.Person;

public class RunP {

	public static void main(String[] args) {
		//1. ������ 19 �� 01036446259
		//2. ����� 29 �� 35554654625
		//3. ������ 26 �� 43268645445
		//4. �迹�� 26 �� 16546387654
		
		Person[] parr = new Person[5];
		parr[0] = new Person("������",19,'��',"01036446259");
		parr[1] = new Person("�����",29,'��',"01054255456");
		parr[2] = new Person("������",26,'��',"01045465658");
		parr[3] = new Person("�迹��",26,'��',"01054649865");
		parr[4] = new Person();
		//��ü�迭�̱� ������ �迭�� �Է��� �� �׻� ��ü�� �������� ��
		
		
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i].getName()+" "+parr[i].getAge()+" "
					+parr[i].getGender()+" "+parr[i].getNumber());
		}
	}

}
