package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {

		// Restaurant r1 - new Restaurant();
		// System.out.println(r1.information);

		/*
		 * 1단계. 사용자로부터 식당의 정보를 입력받아서 저장 3개의 식당정보를 입력받는다고 가정
		 */
		Scanner sc = new Scanner(System.in);
		Restaurant r1 = null;
		Restaurant r2 = null;
		Restaurant r3 = null;

		for (int i = 1; i < 4; i++) {
			System.out.printf("식당 %d의 상호를 입력해주세요. > ", i);
			String storeName = sc.nextLine();
			System.out.printf("식당 %d의 주소를 입력해주세요. > ", i);
			String address = sc.nextLine();
			System.out.printf("식당 %d의 주력메뉴를 입력해주세요. > ", i);
			String mainMenu = sc.nextLine();
			if(i == 1) {
				r1 = new Restaurant(storeName , address, mainMenu);
				r1.information();
			} else if (i == 2) {
				r2 = new Restaurant(storeName, address, mainMenu);
				r2.information();
			}	else {
				r3 = new Restaurant(storeName, address, mainMenu);
				r3.information();
			}
			
			

		}
		System.out.print("상호명을 입력해주세요 > ");
		String searched = sc.nextLine();
		
		if(searched.equals(r1.getStoreName())) {
			System.out.println("대표 메뉴 : " + r1.getMainMenu());
		}
		if(searched.equals(r2.getStoreName())) {
			System.out.println("대표 메뉴 : " + r2.getMainMenu());
		}
		if(searched.equals(r3.getStoreName())) {
			System.out.println("대표 메뉴 : " + r3.getMainMenu());
		}
		
		
	}
}
/*
 * System.out.print("식당2의 상호를 입력해주세요. > "); String storeName2 = sc.nextLine();
 * System.out.print("식당2의 주소를 입력해주세요. > "); String address2 = sc.nextLine();
 * System.out.print("식당2의 주력메뉴를 입력해주세요. > "); String mainMenu2 = sc.nextLine();
 * 
 * System.out.print("식당3의 상호를 입력해주세요. > "); String storeName3 = sc.nextLine();
 * System.out.print("식당3의 주소를 입력해주세요. > "); String address3 = sc.nextLine();
 * System.out.print("식당3의 주력메뉴를 입력해주세요. > "); String mainMenu3 = sc.nextLine();
 * 
 * Restaurant r = new Restaurant(storeName, address, mainMenu); Restaurant r2 =
 * new Restaurant(storeName2, address2, mainMenu2); Restaurant r3 = new
 * Restaurant(storeName3, address3, mainMenu3); r.information();
 * r2.information(); r3.information();
 */
// 처리방법 - 1. 세터 호출 2.매개변수로 인자값을 전달

// (무조건) 짧은 코드가 좋다 -> false. 중복이 많은 코드는 좋지 않다. -> true.
// - 이 기준에 따르면 위의 방식은 좋은 방식이 아님.

/*
 * 2단계. 사용자로부터 상호명을 입력받아서
 * 
 */
