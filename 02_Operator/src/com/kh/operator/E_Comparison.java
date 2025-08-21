package com.kh.operator;

public class E_Comparison {

	/*
	 * 비교 연산자(관계 연산자) '3' == (int) '3'
	 * 
	 * 두 개의 값을 가지고 비교하므로 이항 연산자임
	 * 비교연산을 한 결과 -> 참인 경우 true, 거짓인 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 예정
	 * 
	 * 종류 - 동등비교, 대소비교
	 * 
	 * 
	 * 1. 동등비교 : 두 항이 서로 일치하는지를 비교
	 * 
	 * a == b : 의미 - a와 b가 일치하는가?
	 * a != b : 의미 - a와 b가 일치하지 않는가?
	 * 
	 * 2. 대소비교 
	 * a < b : 의미 - a가 b보다 작은가?
	 * a > b : 의미 - a가 b보다 큰가?
	 * a <= b : 의미 - a가 b보다 작거나 같은가?
	 * a >= b : 의미 - a가 b보다 크거나 같은가?
	 * 
	 * 결과값은 true/false로 나오게 됨.
	 * 
	 */
	
	public void method1() {
		
		System.out.println("킬킬킬");
		int num1 = 70;
		int num2 = 10;
		System.out.printf("\n값 1 : %d,  값 2 : %d\n" , num1, num2);
		System.out.println();
		System.out.println("값1 < 값2 : " + (num1 < num2));
		System.out.println("두 값이 같은가 : " + (num1 == num2));
		System.out.println("두 값의 차가 60인가 : " + (num1 - num2 == 60 ));
		System.out.println("첫 번째 값이 짝수인가 : " + (num1 % 2 == 0));
		System.out.println("두 번째 값이 홀수인가 : " + (num2 % 2 == 1));
		
		
		
		// % 뒤의 값으로 나눈 나머지를 구하는 연산자
		
		
		
		
		
	}
	
}
