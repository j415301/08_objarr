package com.objarr.run;

import java.util.Scanner;

import com.objarr.model.vo.Person;

public class RunP {

	public static void main(String[] args) {
		//1. ������ 19 �� 01036446259
		//2. ����� 29 �� 35554654625
		//3. ������ 26 �� 43268645445
		//4. �迹�� 26 �� 16546387654
		
//		Person[] parr = {
//				new Person("������",19,'��',"01036446259"),
//				new Person()
//		};
		Person[] parr = new Person[5];
		//��ü�迭 ��ü�� �������� ũ�⸦ �ø� �� ���� ����&�Ҵ� �� ũ�⸦ �� ���ؾ� ��
		
		/*
		parr[0] = new Person("������",19,'��',"01036446259");
		parr[1] = new Person("�����",29,'��',"01054255456");
		parr[2] = new Person("������",26,'��',"01045465658");
		parr[3] = new Person("�迹��",26,'��',"01054649865");
		parr[4] = new Person();
		*/
		//��ü�迭�̱� ������ �迭�� �Է��� �� �׻� ��ü�� �������� ��
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println("==== "+(i+1)+"��° ====");
			System.out.print("�̸�: ");
			parr[i] = new Person();//2. ���� �ϳ��ϳ� ��ü ��������
			parr[i].setName(sc.next());//1. �ڵ� �ۼ� �ÿ��� ������ �ȳ� but �����ϸ� error
			//��? Parr[0~4]���� ���� null��. ���� �� ��ü�� �ش�Ǵ� �ּҰ� ����, �ּҰ� ������
			//���ٿ����ڸ� ���ؼ� ������ �� ���� ������ ������ ��
			//new�� ���� �ϳ��ϳ� ��ü�� �������༭ �ּҸ� ����� ������ �� ����
			System.out.print("����: ");
			parr[i].setAge(sc.nextInt());
			System.out.print("����: ");
			parr[i].setGender(sc.next().charAt(0));
			System.out.print("��ȭ��ȣ: ");
			parr[i].setNumber(sc.next());
		}
		
		/*
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i].getName()+" "+parr[i].getAge()+" "
					+parr[i].getGender()+" "+parr[i].getNumber());
		}
		*/
		
		//�ս��� ��ü�迭 ����ϴ� ��
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i]);
		}
	}

}
