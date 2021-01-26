package com.objarr.run;

import com.objarr.model.vo.Person;

public class RunP {

	public static void main(String[] args) {
		//1. 유병승 19 남 01036446259
		//2. 김상현 29 남 35554654625
		//3. 김태희 26 남 43268645445
		//4. 김예진 26 여 16546387654
		
		Person[] parr = new Person[5];
		parr[0] = new Person("유병승",19,'남',"01036446259");
		parr[1] = new Person("김상현",29,'남',"01054255456");
		parr[2] = new Person("김태희",26,'남',"01045465658");
		parr[3] = new Person("김예진",26,'여',"01054649865");
		parr[4] = new Person();
		//객체배열이기 때문에 배열에 입력할 때 항상 객체를 만들어줘야 함
		
		
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i].getName()+" "+parr[i].getAge()+" "
					+parr[i].getGender()+" "+parr[i].getNumber());
		}
	}

}
