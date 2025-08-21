package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	
	/*
	 * 연산자 파트의 마지막 - 삼항 연산자 : 피연산자가 3개 -> 값 3개와 1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 		결과값이 true일 경우 첫 문장을 처리하고
	 * 		결과값이 false일 경우 두 번째 문장을 처리함.
	 * 
	 * 표현식 - 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 더 멜론 오브 멜론 프라푸치노");
		System.out.println("2. 자몽 망고 코코 프라푸치노");
		System.out.println("3. 카페 브륄레 프라푸치노");
	
		// 임포트(Source 메뉴에 있는 Organize Imports) 단축키 - Ctrl Shift O
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		System.out.println("수량을 입력해주세요 > ");
		int glassNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "더 멜론 오브 멜론 프라푸치노를 " + glassNo + "잔 주문하셨습니다."
							: (menuNo == 2) ? "자몽 망고 코코 프라푸치노를 " + glassNo + "잔 주문하셨습니다."
							: (menuNo == 3) ? "카페 브륄레 프라푸치노를 " + glassNo + "잔 주문하셨습니다."
							: "존재하지 않는 메뉴입니다.";
		System.out.println(selectedMenu);
		
		// 홀짝 구하기
	}
	public void method2() {
	
		// 사용자로부터 정수 값을 하나 입력받아서 입력받은 정수가 홀수인지 짝수인지 판별하여 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요.");
		
		int integer1 = sc.nextInt();
		System.out.println("입력하신 정수는 " + integer1 + "입니다.");
		String result = (integer1 % 2 == 0) ? "판정결과, 입력하신 정수는 짝수입니다."
					  : "판정결과, 입력하신 정수는 홀수입니다.";
		System.out.println(result);
		char oddEven = ((integer1 % 2 == 0)) ? '짝'
			  	 : '홀';
		System.out.println("입력하신 " + integer1 + "은(는)" + oddEven + "수입니다.");
			
		
			
	}
		
	public void mine1() { 
	
	// 사용자로부터 알파벳 한 글자를 입력받아서 입력받은 알파벳이 소문자인지 대문자인지 판별 후 출력하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 하나 입력하세요");
		char letter = sc.nextLine().charAt(0);
		System.out.println("입력하신 문자는 " + letter + "입니다");
		String result = (65 <= letter) && (letter <= 96) ? "판정결과, 입력하신 알파벳은 대문자입니다."
					  : (97 <= letter) && (letter <= 128) ? "판정결과, 입력하신 알파벳은 소문자입니다."
					  : "유효한 알파벳이 아닙니다."; 
		// 그냥 'a', 'z', 'A', 'Z'와 대소비교하여도 유효한 결과값 출력됨.
		
		System.out.println(result);
		
		
		
		
		
	}
		
		
	}
	
