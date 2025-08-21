package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		// Coffee라는 클래스(설계도)를 가지고 객체를 생성하려 함.
		Coffee coffee = new Coffee(); // <- 객체 생성(instance 화)
		// 1. 참조자료형
		// 클래스를 만드는 행위 == 사용자 정의 자료형을 만들겠다는 의미
		// 2. 여러 개의 자료형에 여러 개의 값을 보관 + 기능
		// 3. 주소값을 저장
		
		System.out.println(coffee.info());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피명이 뭔가요? > ");
		String name = sc.nextLine();
		coffee.setName(name);
		// String coffeeName = coffee.getName();
		System.out.print("어떤 원두로 하실 건가요? > ");
		String bean = sc.nextLine();
		coffee.setBean(bean);
		System.out.print("사이즈는 어떻게 하실 건가요? > ");
		String size = sc.nextLine();
		coffee.setSize(size);
		// coffee.setSize(sc.nextLine()); <- 가능은 하나, 별로 권장하는 방식은 아님
		System.out.print("가격은 얼마죠? > ");
		int price = sc.nextInt();
		sc.nextLine();
		coffee.setPrice(price);
		// coffee.setPrice(sc.nextInt()); <- 마찬가지
		// sc.nextLine();
		System.out.print("디카페인 여부는 어떻죠? > ");
		boolean deca = sc.nextBoolean();
		coffee.setDeca(deca);
		// coffee.setDeca(sc.nextBoolean()); <- 마찬가지
		
		String info = coffee.info();
		System.out.println("===============");
		System.out.println(info);
		
	}

}
