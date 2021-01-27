package com.objarr.run;

import java.util.Scanner;

import com.objarr.model.vo.Person2;

public class RunP2 {
	
	public static void main(String[] args) {
		
		Person2[] parr = new Person2[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println("==== "+(i+1)+"번째 ====");
			parr[i] = new Person2();
			System.out.print("이름: ");
			parr[i].setName(sc.next());
			System.out.print("나이: ");
			parr[i].setAge(sc.nextInt());
			System.out.print("성별: ");
			parr[i].setGender(sc.next().charAt(0));
			System.out.print("전화번호: ");
			parr[i].setNumber(sc.next());
		}
		
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i]);
		}
		
	}

}
