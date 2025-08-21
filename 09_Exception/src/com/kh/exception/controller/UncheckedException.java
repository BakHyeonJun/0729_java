package com.kh.exception.controller;

import java.util.Scanner;

public class UncheckedException {

	/*
	 * 프로그램 실행시 발생하는 예외들(컴파일러가 체크해주지 않음)
	 * RuntimeException
	 * 
	 *  - NullPointerException(NPE) : 주소값 객체를 참조했더니 null 값이 들어있을 경우 발생하는 예외
	 *  - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 *  - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 *  - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 *  - NegativeArraySizeException : 배열을 할당할 때 크기를 음수로 지정하면 발생하는 예외
	 *  등등
	 *  
	 *  
	 *  RuntimeException과 관련된 예외들은 공통점이 있음 - 개발자가 예측이 가능함.
	 */
	
	// ArithmeticException
	public void method1() {
		// 사용자로부터 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요. > ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 정수를 입력해주세요. (0은 불가) > ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// 방법 1. 예외발생 자체를 원천 차단하는 것.
		if(num2 != 0 ) {
		System.out.println("연산 결과 : " + (num1 / num2));
		} else {
			System.out.println("하지 말라면 좀 하지 마쇼");
		}
		
		// 방법 2. 예외처리를 진행하는 것.
		// 예외 상황을 감지하고 예외 상황 발생시
		// 프로그램이 비정상적인 종료가 되는 것을 방지하고 적절한 대응조치를 취하는 것
		/*
		 * try ~ catch 문
		 * 표현법
		 * try { (num1 / num2) // <- 이와 같이 예외가 발생할 수 있는 구문을 넣어둠}
		 * catch(발생할 예외 클래스 명, 변수 명을 적음) {
		 * }
		 * 
		 */
		try {
			System.out.println(num1 / num2);
			System.out.println("올바른 정수 입력!"); // try에서 error(예외 사항) 발생하는 즉시 catch로 이행됨. 그러므로 예외 발생할 수 있는 부분 뒤의 내용이 무용지물이 될 가능성이 있으므로 여기에는 중요한 내용을 넣지 말아야 한다.
		} catch(ArithmeticException e) {
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수가 없습니다.");
			
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
