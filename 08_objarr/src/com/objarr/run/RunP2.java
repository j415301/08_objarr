package com.objarr.run;

import java.util.Scanner;

import com.objarr.model.vo.Person2;

public class RunP2 {
	
	public static void main(String[] args) {
		
		Person2[] parr = new Person2[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println("==== "+(i+1)+"��° ====");
			parr[i] = new Person2();
			System.out.print("�̸�: ");
			parr[i].setName(sc.next());
			System.out.print("����: ");
			parr[i].setAge(sc.nextInt());
			System.out.print("����: ");
			parr[i].setGender(sc.next().charAt(0));
			System.out.print("��ȭ��ȣ: ");
			parr[i].setNumber(sc.next());
		}
		
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i]);
		}
		
	}

}
