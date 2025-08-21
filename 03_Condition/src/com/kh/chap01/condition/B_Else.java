package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * 
	 * If ~ else
	 * 표현법 - if(조건식) {
	 * }
	 * 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수 하나를 입력하세요 > ");
		
		int num = sc.nextInt();
		System.out.println("입력하신 정수는 " + num + "입니다");
		if(num > 0) {
			System.out.println("입력값이 0보다 큽니다.");
			}
		else { System.out.println("입력값이 0보다 크지 않습니다.");
			}
		
		/*
		 * if(!(num>0) {
		 *  System.out.println("0보다 크지 않습니다.");
		 *  }
		 *  
		 *  if 문의 조건식의 결과가 true일 경우 -> else 블럭을 건너 뜀. 그 결과 불필요한 연산이 줄어들어 처리속도가 향상.
		 *  
		 */
	}
	
	public void method2() {
		// 정수를 입력받아서 0보다 큰지 0인지 0보다 작은지 출력할 것.
		
			
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 > ");
		int num = sc.nextInt();
		System.out.println("입력하신 정수는 " + num + "입니다");
		if(num > 0) {
			System.out.println("입력값이 0보다 큽니다.");
			}
		else if(num == 0) {
			System.out.println("입력값이 0입니다.");
			}
		else { System.out.println("입력값이 0보다 작습니다.");
			}
		}
	
	public void ageCheck() {
		// 사용자로부터 나이(정수)를 입력받고, 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요.
		// 1 ~ 12 : 어린이입니다.
		// 13 ~ 17 : 청소년입니다.
		// 18 ~ : 성인입니다.
		// else : 유효하지 않은 값입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 몇 살입니까? > ");
		int age = sc.nextInt();
		System.out.println("당신은 " + age + "세이시군요");
		if(0< age && age <= 12)  {
			System.out.println("당신은 어린이입니다.");
			}
		else if(13 <= age && age <= 17) {
			System.out.println("당신은 청소년입니다.");
			}
		else if(18 <= age && age <= 148) {
			System.out.println("당신은 성인입니다.");
			}
		else {
			System.out.println("유효하지 않은 값입니다.");
		}
		
		// 불필요한 연산을 줄이기 위해서는 범위가 넓은 조건부터 입력하는 것이 좋다.
		/*
		 * ex) if(age <= 0 || age >= 148) {
		 * System.out.println("유효하지 않은 값입니다.");
			}
		else if {
			(18 <= age && age <= 148) {
						System.out.println("당신은 성인입니다.");
			}
		else if (age <= 12)  {
			System.out.println("당신은 어린이입니다.");
			}
		else { 
		System.out.println("당신은 청소년입니다.");
		} 
		 * 
		 * 
		 * 
		 */
	}
	
}
