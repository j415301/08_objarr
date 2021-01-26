package com.objarr.run;

import com.objarr.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		//객체 배열 활용하기
		
		Car c;
		Car c2;
		Car c3;
		
		//객체배열의 선언
		Car[] cars;
		//배열 할당
		cars = new Car[4];
		
		//배열에 값 넣기 -> 객체이기 때문에 객체를 생성해서 넣음
		cars[0] = new Car();
		cars[1] = new Car("소나타","현대",100,"핑크",4);
		cars[2] = new Car("모델x","테슬라",1,"검정",4);
		cars[3] = new Car("기블리","마세라티",1,"파랑",4);
		
		//객체 배열에 있는 값 출력하기
		System.out.println(cars[0]);//주소값 출력
		System.out.println(cars[1]);//주소값 출력
		
		System.out.println(cars[0].getModelName());//null
		System.out.println(cars[1].getModelName());//소나타
		System.out.println(cars[2].getModelName());
		System.out.println(cars[3].getModelName());
		//error(NullPointerException): 접근연산 시 가리키는 주소가 없다(=null을 가리키고 있다)
		
		//배열변수에 할당된 객체에 값을 넣으려면
		cars[0].setModelName("티코");
		
		//cars배열에 저장된 모든 차의 모델명을 조회해라
		for(int i=0 ; i<cars.length ; i++) {
			System.out.println(cars[i].getModelName());
		}
		
		
		
	}

}
