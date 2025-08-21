package com.kh.variable;

import java.util.Scanner;


public class B_KeyboardInput { 

	//API - Application Programming Interface 
	
	/*
	 * 키보드를 이용해서 사용자로부터 값을 입력받을 예정.
	 * 자바에서 제공해주는 Scanner라는 클래스를 사용한다. 
	 * Scanner 클래스에 존재하고 있는 메소드들을 호출해서 입력을 받을 수 있음.
	 * 
	 */
	
	public void inputTest() {
		System.out.println();
		System.out.println("하하호호~");
		
		Scanner sc = new Scanner(System.in);
		// System.in : 표준 입력도구에서 입력받은 값들을 받겠다. (바이트 단위)

		// 기가커피
		// 사용자에게 주문할 음료를 입력받아서 출력해보자
		
		System.out.println("=======￦메뉴판￦=======");
		System.out.println("¤기가커피에 오신 것을 환영합니다.¤");
		System.out.println("￦한교동 갈릭쉬림프 프레첼￦");
		System.out.println("￦KH정보교육원 A강의장에서 만든 딸기라떼￦");
		System.out.println("￦수박주스￦");
		System.out.println("=====================");
		System.out.println("주문하실 메뉴를 입력해주세요 > ");
		
		String menu = sc.next();
		
		
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백문자 이전까지만 입력받음.
		// 사용자가 입력한 메뉴를 출력해주자. ex) 수박주스를 주문하셨습니다.
		
		System.out.println(menu + "을(를) 주문하셨습니다.");
		
		System.out.println("몇 개 주문하시겠습니까?(숫자로 입력해주세요) > ");
		int number = sc.nextInt();
		System.out.println(menu + "을(를)" + number + "개 주문하셨습니다.");
		sc.nextLine();
		System.out.println("주소지를 입력해주세요 > ");
		String address = sc.nextLine();
		
		// nextLine() : 사용자가 입력한 값을 공백과 무관하게 개행문자 이전까지 전체를 다 읽어옴. 이후 입력버퍼에 존재하는 "개행문자"를 날려줌.
		// 정수 관련 스캐너를 구동시 입력버퍼에서 수치 부분만 RAM으로 가져가고 개행문자를 남겨두는 문제가 있는데, 이를 해결하기 위해서는 nextline()을 한 번 더 써준다.
		
		
		System.out.println(menu + " " + number + "개를 " + address + "로 배달합니다.");
		
	}
	
	
}
