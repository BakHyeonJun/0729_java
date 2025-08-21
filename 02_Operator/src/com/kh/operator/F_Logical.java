package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * 표현법 : 논리값 논리연산자 논리값 -> 결과값도 논리값
	 * 
	 *  종류
	 *  1. AND 연산자 - &&
	 *  좌항과 우항의 값이 모두 ture여야만 최종 결과가 true
	 *  
	 *  2. OR 연산자 - ||
	 *  좌항과 우항 중 하나라도 true이면 최종 결과가 true
	 *  
	 * 
	 * 
	 */
	
	public void method1() {
		
		// 사용자에게 정수값을 하나 입력받은 후 사용자가 입력한 정수 값이 0보다 크면서 짝수인지 판별한다 -> 그리고 나서 그 결과를 출력할 것.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하시오");
		int num1 = sc.nextInt();
		boolean result = (num1 > 0) && (num1 % 2 == 0);
		System.out.println("입력한 정수값 : " + num1); // 모범시민이 해야 할 일, 입력한 변수 찍어서 확인하기 - 빼먹지 말자.
		System.out.println("입력한 정수값이 0보다 큰가 : " + (num1 > 0));
		System.out.println("입력한 정수값이 짝수인가 : " + (num1 % 2 == 0));
		System.out.println("입력한 정수값이 0보다 큰 짝수인가 : " + result);
		System.out.println("입력한 정수값이 70보다 크거나 홀수인가 : " + ((num1 > 70) || (num1 % 2 == 1)));
		System.out.println("입력한 정수의 제곱은 얼마인가 : " + num1 * num1);
		System.out.println("입력한 정수의 세제곱은 얼마인가 : " + num1 * num1 * num1);
		System.out.println("입력한 정수의 네제곱은 얼마인가 : " + num1 * num1 * num1 * num1);
		System.out.println("입력한 정수의 세제곱의 10분의 1은 얼마인가(소수점 버림) : " + num1 * num1 * num1/10);
					
	}
	
	public void method2() {
		// 사용자에게 정수 값을 입력받아서
		// 변수에 대입한 뒤
		// 출력해보세요.
		Scanner sc2 = new Scanner(System.in);
		System.out.println("-70이상 70 이하의 범위에서 두 번째 정수값을 입력하시오");
		int num2 = sc2.nextInt();
		boolean result2 = (-70 <= num2) && (num2 <= 70);
		System.out.println("적절한 값인지 여부 판단 : " + result2);
		// result2 = true ? System.out.println("입력한 값 : " + num2) : System.out.println("적절한 값이 아닙니다."); 
		// else result2 = true System.out.println("입력한 값 : " + num2);
		// 위 두 줄 에러 뜨는 이유 찾아서 해결할 것
			
		String check = (result2 == true) ? "입력하신 값은 " + num2 + "입니다."  : "적절한 값이 아닙니다";
		System.out.println(check);
		
	}
	
	public void method3() {

		// 사용자에게 한 글자를 입력 받아서 입력받은 값이 영문자 A 또는 a 인지를 확인해서 출력하기
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("알파벳 하나를 입력하시오");
		char ch1 = sc3.nextLine().charAt(0);
		// nextLine은 개행문자 이전까지 입력 내용을 받는 것이므로 기본적으로 문자열 자료형 (string)으로 처리된다. 그러므로 형변환을 통한 좌항과 우항의 자료형 일치화가 필요. 이 때 쓰는 것이 문자열의 첫 번째(0번)부터 순서에 따라 낱개의 글자를 불러올 수 있는 charAt을 사용한다.
		
		System.out.println("입력한 문자 : " + ch1);
		
		// 무슨 연산을 하게 되는가?
		// 동등비교 연산 : 단일 문자의 경우 동등비교 연산이 가능한가? - 가능하다.
		// 이유 - char형이 int 형으로 자동 형변환이 일어난 뒤 연산을 한다.
		boolean result3 = (ch1 == 'A') || (ch1 == 'a');
		System.out.println("입력한 값이 A 또는 a인가 : " + result3);
		
		
	}
	
	public void tip() {
		
		int num = 10;
		boolean result = false && (num>0);
		boolean result2 = (num<0) && (num == 10);
		
		// AND 연산에서 앞의 연산이 false일 경우 뒤의 연산의 참 여부를 살필 필요가 없이 전체 연산이 거짓이므로 자바는 아예 뒤의 연산을 살피지 않음.
	}

}
