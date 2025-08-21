package com.kh.operator;

import java.util.Scanner;

public class C_Compound {

	// 연산자
	
	
		/* 복합 대입 연산자
		 * 
		 * ~
		 * 
		 * 예시
		 * 
		 * int endDays = 129;
		 * 매일 23시 59분 59초에 실행할 코드 :
		 * 
		 * endDays = endDays - 1;
		 * 
		 * ------------------------
		 * 
		 * endDays -= 1;
		 * 
		 */
		
		public void method1() {
			
			System.out.println("크게 뭐가 없습니다.");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수값을 하나만 입력해주세요");
			
			int number = sc.nextInt();
			System.out.println(number);
			
			// 사용자가 입력할 정수값은 알 수 없음.
			// 사용자가 입력한 값에서 10을 뺀 값을 출력하고자 함.
			
			number = number - 10;
			System.out.println("10을 감소시킨 정수 값 : " + number);
			
			
		}
		
	
}
