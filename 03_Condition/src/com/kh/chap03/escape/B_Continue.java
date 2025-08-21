package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {
	
	// 중요도 매우 * 40 높음
	
	public void method1() {
		// 1부터 10까지 반복을 하면서 정수값을 출력하는데 홀수일 때만 출력할 것.
		for(int i = 1; i <= 10; i += 2 ) {
			 System.out.println(i);
			
		}
		
		
	
		for(int i = 1; i <= 10; i++ ) {
			if(i % 2 == 0) {
				continue;
		}
			System.out.println(i);

		}
	}
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("회원가입 서비스입니다");
		System.out.println("아이디를 입력해주세요(9자 이하) > ");
		String userId = sc.nextLine();
		if(userId.length()>9) {
			System.out.println("9자 이하의 아이디만 사용 가능합니다.");
			continue;
		} else {
			System.out.println("사용 가능한 아이디입니다,");
			break;
		}
		
		
		}
		System.out.println("블라블라");
	}

}
