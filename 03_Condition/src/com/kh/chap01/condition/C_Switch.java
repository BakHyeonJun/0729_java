package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	
	public void method0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층을 가실지 입력해주세요. (B1 / 1F / 2F/ 3F/ 4F) > ");
		String floor = sc.next();
		// System.out.println(floor);
		switch(floor) {
		case "B1" : System.out.println("지하 1층입니다. 문이 열립니다."); break;
		case "1F" : System.out.println("1층입니다. 문이 열립니다."); break;
		case "2F" : System.out.println("2층입니다. 문이 열립니다."); break;
		case "3F" : System.out.println("3층입니다. 문이 열립니다."); break;
		case "4F" : System.out.println("4층입니다. 문이 열립니다."); break;
		default : System.out.println("유효하지 않은 입력입니다.");
		}
		
		/*
		 * switch문 
		 * 표현식 - switch(case문에 동등비교할 대상을 입력 - 정수, 문자, 실수, 문자열 등 모두 가능)
		 *  {case "동등비교할 값": 실행할 코드
		 *  이 때 어떤 case에도 부합되지 않을 경우 - default 명령어를 활용하여 표현. 즉, if문에서의 else에 해당하는 역할.
		 *  break는 해당 스코프에서 탈출시키는 명령어이다.
		 */
		}
	
	public void method1() {
		
		// 메뉴 주문 : 부대찌개(10000), 떡갈비(11000), 제육볶음(7000), 칼국수(6000), 수제비(5000), 샐러드(8000)
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택해주세요. (부대찌개 / 떡갈비 / 제육볶음 / 칼국수/ 수제비 / 샐러드 / 파전) > ");
		String menu = sc.next();
		// System.out.println(menu);
		switch(menu) {
		case "부대찌개" : System.out.println("부대찌개는 10000 원입니다."); break;
		case "떡갈비" : System.out.println("떡갈비는 11000 원입니다."); break;
		case "제육볶음" : System.out.println("제육볶음은 7000 원입니다."); break;
		case "칼국수" : System.out.println("칼국수는 6000 원입니다."); break;
		case "수제비" : System.out.println("수제비는 5000 원입니다."); break;
		case "샐러드" : System.out.println("샐러드는 8000 원입니다."); break;
		case "파전" : System.out.println("준비중입니다."); break;
		default : System.out.println("존재하지 않는 메뉴입니다.");
		return;
		} //break를 만나면 빠져나오는 부분
		
		// 중복제거하기
		// 1. 중복된 부분은 하나로 빼기
		// 2. 중복이 아닌 부분은 변수로 처리
		int result = switch(menu) {
		case "제육볶음", "수제비", "칼국수" -> 3000;
		case "떡갈비", "부대찌개" -> 5000;
		default -> 0;
		};
		// -> 애로우(화살표) 연산자라고 하여 이런 식으로 자료를 처리하는 방식도 있음.
		
		int price = 0;
		switch(menu) {
		
		case "부대찌개" : price = 10000; break;
		case "떡갈비" : price = 11000; break;
		case "제육볶음" : price = 7000; break;
		case "칼국수" : price = 6000; break;
		case "수제비" : price = 5000; break;
		case "샐러드" : price = 8000; break;
		case "파전" : break;
		default : System.out.println("존재하지 않는 메뉴입니다.");
				
		}
		if(price != 0) {
		System.out.println("선택하신 메뉴는 " + price + "원 입니다.");
		}
		else {
			System.out.println("준비중인 메뉴입니다.");
			
		}
	} // return을 만나면 빠져나오는 부분(method 닫는 부분) : 현재 실행중인 메소드 영역을 아예 빠져나가는 명령어이므로, 아예 메소드를 호출한 곳으로 돌아감.
	
	public void login() {
		
		// 로그인 기능 구현해보자.
		// 기획 - 뭘 만들 것인가. 설계 - 어떻게 만들 것인가. 기획은 대개의 경우 클라이언트의 영역이고, 개발자의 업무 영역은 설계이므로 설계가 보다 중요.
		// 로그인 구현할 때 필요한 값 - 사용자가 입력한 아이디, 패스워드 - 대개의 경우 둘 다 문자열(String) 형태일 것.
		// 로그인 시 필요한 선행 작업 - 회원가입
		// 1. 회원가입시 사용자가 원하는 아이디 값과 비밀번호 값을 입력하여 회원가입을 진행할 것이고,
		// 2. 가입 시 입력했던 아이디와 비밀번호를 둘 다 정확히 입력한다면 로그인 성공 화면을 출력하게 되고
		// 3. 둘 중 하나라도 일치하지 않는다면 로그인 실패 화면을 출력하여야 한다.
		String id = "user01";
		String password = "pass01";
		String name = "동길홍";
		
		System.out.println("kh up10 ");
		System.out.println("=================");
		System.out.println("로그인 서비스입니다.");
		System.out.println("=================");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.print("아이디 > ");
		String userId = sc.nextLine();
		System.out.println("-----------------");
		
		System.out.println("-----------------");
		System.out.print("패스워드를 입력하세요. > ");
		String userPwd = sc.nextLine();
		System.out.println("-----------------");
		
		// 만약 사용자가 입력한 아이디 값과 회원가입 시 가입한 아이디 값이 동일하고 사용자가 로그인 시 입력한 비밀번호 값과 회원가입시 가입한 비밀번호 값이 동일하다면
		if (userId.equals(id) && userPwd.equals(password)) {
			System.out.println( name + "님 환영합니다.");
		}
		else if (!userId.equals(id))
		{	
		System.out.println("존재하지 않는 아이디입니다.");}
		else {
		System.out.println("비밀번호가 잘못 입력되었습니다.");
		}
		// 기본자료형 : boolean, char, byte, short, int, long, float, double - 동등비교 연산자 수행에 문제가 없음
		// 참조자료형 : 그 외 - 동등비교 연산자를 통해서 값을 비교하는 것이 불가능하다. 실제 변수에 담기는 값이 '주소값'이기 때문.
		// 그렇기 때문에 문자열의 값을 비교 : equals() -> true / false 
	}
	
	
}
