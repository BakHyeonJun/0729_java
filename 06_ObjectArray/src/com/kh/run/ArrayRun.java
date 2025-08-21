package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;


public class ArrayRun {

	public static void main(String[] args) {
		
		// 배열의 특징
		// 가장 기본적인 특징 : 논리적인 구조와 물리적인 구조가 동일하다.
		// 기타 : 같은 자료형들끼리만 담을 수 있다 -> 동종 모음
		// 하나의 배열에 여러 값을 담을 수 있다.
		// 참조자료형에 해당된다.
		// 인덱스개념이 존재함
		
		// int[] nums = new int[3]; // 일반적인 배열 사용 방법
		// String[] strs = new String[5]; // 객체 배열에 해당함.
		
		// 객체배열의 선언 및 할당
		// 포현법 - 참조자료형[] 배열식별자 = new 참조자료형[배열크기];
		
		Restaurant[] restaurants = new Restaurant[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < restaurants.length; i++) {
			System.out.print("상호명을 입력하세요 > ");
			String storeName = sc.nextLine();
			System.out.print("주소지를 입력하세요 > ");
			String address = sc.nextLine();
			System.out.print("주력메뉴를 입력하세요 > ");
			String mainMenu = sc.nextLine();
			restaurants[i] = new Restaurant(storeName, address, mainMenu);
			System.out.println(restaurants[0].getMainMenu());
			restaurants[0].information();
			
		}
	for(int i = 0; i < restaurants.length; i++) {
		restaurants[i].information();
	}
	
	System.out.print("상호명을 입력해주세요. > ");
	String searched = sc.nextLine();
	for(int i = 0; i < restaurants.length; i++) {
		if(searched.equals(restaurants[i].getStoreName())) {
			System.out.println("대표 메뉴 : " + restaurants[i].getMainMenu());
		}
	}
	
	}

}
