package com.objarr.run;

import com.objarr.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		//��ü �迭 Ȱ���ϱ�
		
		Car c;
		Car c2;
		Car c3;
		
		//��ü�迭�� ����
		Car[] cars;
		//�迭 �Ҵ�
		cars = new Car[4];
		
		//�迭�� �� �ֱ� -> ��ü�̱� ������ ��ü�� �����ؼ� ����
		cars[0] = new Car();
		cars[1] = new Car("�ҳ�Ÿ","����",100,"��ũ",4);
		cars[2] = new Car("��x","�׽���",1,"����",4);
		cars[3] = new Car("���","������Ƽ",1,"�Ķ�",4);
		
		//��ü �迭�� �ִ� �� ����ϱ�
		System.out.println(cars[0]);//�ּҰ� ���
		System.out.println(cars[1]);//�ּҰ� ���
		
		System.out.println(cars[0].getModelName());//null
		System.out.println(cars[1].getModelName());//�ҳ�Ÿ
		System.out.println(cars[2].getModelName());
		System.out.println(cars[3].getModelName());
		//error(NullPointerException): ���ٿ��� �� ����Ű�� �ּҰ� ����(=null�� ����Ű�� �ִ�)
		
		//�迭������ �Ҵ�� ��ü�� ���� ��������
		cars[0].setModelName("Ƽ��");
		
		//cars�迭�� ����� ��� ���� �𵨸��� ��ȸ�ض�
		for(int i=0 ; i<cars.length ; i++) {
			System.out.println(cars[i].getModelName());
		}
		
		
		
	}

}
