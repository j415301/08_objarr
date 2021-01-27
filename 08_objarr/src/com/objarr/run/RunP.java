package com.objarr.run;

import java.util.Scanner;

import com.objarr.model.vo.Person;

public class RunP {

	public static void main(String[] args) {
		//1. 유병승 19 남 01036446259
		//2. 김상현 29 남 35554654625
		//3. 김태희 26 남 43268645445
		//4. 김예진 26 여 16546387654
		
//		Person[] parr = {
//				new Person("유병승",19,'남',"01036446259"),
//				new Person()
//		};
		Person[] parr = new Person[5];
		//객체배열 자체는 동적으로 크기를 늘릴 수 없고 선언&할당 시 크기를 딱 정해야 함
		
		/*
		parr[0] = new Person("유병승",19,'남',"01036446259");
		parr[1] = new Person("김상현",29,'남',"01054255456");
		parr[2] = new Person("김태희",26,'남',"01045465658");
		parr[3] = new Person("김예진",26,'여',"01054649865");
		parr[4] = new Person();
		*/
		//객체배열이기 때문에 배열에 입력할 때 항상 객체를 만들어줘야 함
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println("==== "+(i+1)+"번째 ====");
			System.out.print("이름: ");
			parr[i] = new Person();//2. 따라서 하나하나 객체 생성해줌
			parr[i].setName(sc.next());//1. 코드 작성 시에는 오류가 안남 but 실행하면 error
			//왜? Parr[0~4]에는 전부 null임. 따라서 각 객체에 해당되는 주소가 없고, 주소가 없으면
			//접근연산자를 통해서 접근할 수 없기 때문에 에러가 남
			//new를 통해 하나하나 객체를 생성해줘서 주소를 만들면 접근할 수 있음
			System.out.print("나이: ");
			parr[i].setAge(sc.nextInt());
			System.out.print("성별: ");
			parr[i].setGender(sc.next().charAt(0));
			System.out.print("전화번호: ");
			parr[i].setNumber(sc.next());
		}
		
		/*
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i].getName()+" "+parr[i].getAge()+" "
					+parr[i].getGender()+" "+parr[i].getNumber());
		}
		*/
		
		//손쉽게 객체배열 출력하는 법
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i]);
		}
	}

}
