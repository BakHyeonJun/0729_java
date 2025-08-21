package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {

	
	
	public void method1() {
		// System.out.println("안녕 나는 메소드 1이여");
		
		// 무한 반복하면서 랜덤한 정수(1~296)를 생성해서 출력하다가 50이 생성되면 반복을 중단하도록.
		// 몇 번 시행할지 알 수 없으므로 while문이 적합.
		while(true) {
			
		int num = (int)(Math.random() * 296) +1; 
		System.out.println(num);
		
		if(num == 153) { 
		
			System.out.println("난수 생성을 종료합니다.");
			break;
		}
		}
	
		
	}
	
	public void method2() {
		
		// 무한 반복하면서 사용자에게 매 번 문자열을 입력받은 후 해당 문자열의 길이를 출력함. 단, 사용자가 입력한 문자열이 "exit"과 같다면 반복을 종료.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아무 문자열이나 입렬해주세요. 단, 종료를 원하시면 'exit' 또는 '나가기'를 입력해주세요 > ");
			String keyword = sc.nextLine();
			System.out.print( keyword + "은(는) " + keyword.length() + " 글자입니다. > ");
			
			if(keyword.equals("exit") || keyword.equals("나가기")) { System.out.print("문자열 입력을 종료합니다.");
				break;
			}
		}
		
			
	}
	public void method3() {
		// 매번 사용자로부터 정수값을 입력받고 만약 입력한 숫자가 0보다 작다면 "프로그램을 종료합니다."라는 문구를 출력하고 종료할 것.
		Scanner sc = new Scanner(System.in);
		System.out.print("음수 판별기입니다. 아무 정수나 입력해주세요. >");
		while(true) {
			int num = sc.nextInt();
			if (num > 0 ) { System.out.print( "입력하신 정수(는) " + num + "입니다. 다시 입력해주세요. > ");} 
			
			else { System.out.print("입력하신 정수(는) " + num + "입니다.프로그램을 종료합니다.");
			
			break;
			}
		}
	}
	
	
	
	public void method4() {
		/* 사용자로부터 한 개의 정수값을 입력받아서 입력받은 숫자부터 1까지의 모든 숫자를 출력하도록 할 것. 단 입력받는 정수는 1보다 커야 함.
		 * 만약 1 미만의 숫자를 입력받았을 경우 "1 이상의 숫자를 입력해주세요"라고 출력한 뒤 다시 값을 입력받을 수 있도록 만들 것.ㄴ
		 */
		Scanner sc = new Scanner(System.in);
		// 나중에 문제점 찾아서 고칠 것.
		
		// System.out.print(num);
		System.out.print("1 이상의 수를 입력해주십시오.");
		int num = sc.nextInt();
		while(true) {
			
			
			if(num >=  1) { 
			System.out.println(num);
			num = (num - 1);
			}
			else {System.out.print("프로그램을 종료합니다.");}
			break;
		}
	}
}
