package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	
	/*
	 * (단일) if문
	 * 
	 * 표현법 - if(조건식) { 조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * -> 조건식의 결과가 true일 경우 : if문 Scope안의 코드가 수행됨. false일 경우 해당 Scope를 건너뜀.
	 * 
	 */
	
	
	public void method1() {
		
		// System.out.println("모범시민으로서의 점검 완수");
		if (0 < 1) {
			System.out.println("0은 1보다 작다");
		}
		// if문의 조건식 자리에는 결론적으로 true 아니면 false 값이 들어가도록 만들어야 함.
		if (false) {
			System.out.println("얘는 죽었다 깨어나도 안 나온다.");
			// 즉, 무조건 버려지는 내용(데드코드)이라 옆에 느낌표가 뜸
			}
		if (true) {
			System.out.println("조건식 자리에는 최종적으로 true가 와야 한다.");
		}
		

		
	}
	
	
	public void method2() {
		
		boolean loginCheck = false; // 로그인 상태를 저장해둔 변수
		
		if (loginCheck == false) {
			System.out.println ("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println ("NAVER 로그인");
			System.out.println ("아이디 찾기 | 비밀번호 찾기 | 회원가입");
			
				}
		if (loginCheck) {
			System.out.println ("홍길동님 환영합니다");
			System.out.println ("메일 | 카페 | 블로그 | 쇼핑 | 예약");
			
		}
		
	}
	
	
	public void lunchMenu() {
		
		// 오늘의 날씨를 입력받아서 점심메뉴를 추천해주는 프로그램을 만들 것.
		
		Scanner sc = new Scanner(System.in);
		
		// 날씨의 종류는 더움. 맑음. 비옴 3가지로 한정해서 받으려 함.
		
		System.out.print("오늘의 날씨는 어떤가요( 1. 더움 / 2. 맑음 / 3. 비)");
		int weatherCode = sc.nextInt();
		
		// 비옴을 입력했다면 김천을 가라고 하자.
		
		if (weatherCode == 1) {
			System.out.println ("더운 날씨에는 김밥천국 파전에 막걸리를 추천합니다.");
			}
		else if (weatherCode == 2) {
			System.out.println ("맑은 날씨에는 김밥천국 파전에 막걸리를 추천합니다.");
			}
		else if (weatherCode == 3) {
			System.out.println ("비오는 날씨에는 김밥천국 파전에 막걸리를 추천합니다.");
			}
		else {
			System.out.println ("유효한 입력이 아닙니다.");
		}
		// if (weatherCode != 1 && weatherCode != 2 && weatherCode != 3){
		//	System.out.println ("유효한 입력이 아닙니다.");
		// }
		// if (!(weatherCode == 1 || weatherCode == 2 || weatherCode == 3)){
		//	System.out.println ("유효한 입력이 아닙니다.");
		// }
		
		// 문자열은 동등비교 연산자(==)로 비교할 수 없다. 8가지 기본자료형만 가능. -> 대신 문자열이 일치하는지 비교해주는 ".equals()"라는 동등비교용 메소드를 호출해야 한다.
		// ex) System.out.println(weather.equals("비"));
		// 조건 : 만약에 사용자가 입력한 문자열이 "비"와 일치한다면
				
	}
	
	public void method3() {
		
		// 사용자에게 정수값을 입력받아서 홀짝을 판별한 후 출력
		// 이번에는 if문을 이용해서 출력할 것이고, + 입력받은 정수가 0보다 클 경우에만 조건문을 실행할 것.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝을 판별해드릴 테니 0보다 큰 정수를 입력하세요.");
		int num = sc.nextInt();
		System.out.println(num);
		
		if ((num > 0 ) && (num % 2 == 0)) { 
			System.out.println("입력하신 정수는 짝수입니다.");
			}
		else if ((num > 0 ) && (num % 2 == 1)) { 
			System.out.println("입력하신 정수는 홀수입니다.");
			}
		else { 
			System.out.println("유효하지 않은 입력입니다.");
			}
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("입력하신 정수는 짝수입니다.");
			}
			else {
				System.out.println("입력하신 정수는 홀수입니다.");
			}
		}
		else { 
			System.out.println("유효하지 않은 입력입니다.");
		}
		
		// Scope는 복합문을 묶어주기 위한 것이므로 단일문에는 생략할 수도 있다. 그러나 써주는 것이 좋다.
		
		boolean flag = num > 0;
		
		if (flag && num % 2 == 0) {
			System.out.println("입력하신 정수는 짝수입니다.");
		}
		else if (flag && num % 2 != 0) {
			System.out.println("입력하신 정수는 홀수입니다.");
		}
		else {
			System.out.println("유효하지 않은 입력입니다.");
		}
	
		
		// 물론 연산의 횟수를 줄일 수 있으면 좋지만, 그보다 우선시해야 하는 것은 일단 원하는 목표를 구현하는 것이다.
	}
	
	public void method4() {
		
		/*
		 * 1. 메뉴판 띄우기
		 * 2. 메뉴번호로 메뉴 입력받기
		 * 3. 수량 입력받기 
		 * 4. 조건문 - if문 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기. 혹시 없는 메뉴 번호 입력했다면 없는 메뉴라고 대입하기
		 * 5. ~ 메뉴를 ~잔 주문하셨습니다. 메시지 띄우기
		 * 6. 진짜 주문할 건지 물어보기 (Y/N 입력받아서 확인하기)
		 * 7. 6에서 입력받은 단일 문자가 Y 또는 y 일 경우 메뉴명과 수량과 가격 출력하기  - if문 + 중첩 if문 + 출력문
		 * 
		 */
		
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("=======메뉴판=======");
		System.out.println("1. 맥주 - 5,000 원");
		System.out.println("2. 소주 - 3,500 원");
		System.out.println("메뉴를 선택해주세요.");
		
		int menuNo = sc.nextInt();
		System.out.println("수량을 입력해주세요 > ");
		int glassNo = sc.nextInt();
		if (menuNo == 1) {
			if (glassNo > 0) {
				System.out.println("맥주를 " + glassNo + "잔 주문하셨습니다.");
			}
		}
		else if(menuNo == 2) {
			if (glassNo > 0) {
				System.out.println("소주를 " + glassNo + "병 주문하셨습니다.");
			}
		}
		else { System.out.println("유효하지 않은 주문입니다.");}
		System.out.println("\n위 내역으로 주문하시겠습니까? Y / N >");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		if (answer == 'Y' || answer == 'y') {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3500;
			System.out.println("총 결제 금액은 " + (price * glassNo) + "원 입니다.");
			
		}
		else if (answer == 'N' || answer == 'n') {
			System.out.println("주문이 취소되었습니다.");
		}
		
		}
	
	}
	
	

	
	

