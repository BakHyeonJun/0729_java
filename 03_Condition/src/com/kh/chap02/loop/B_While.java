package com.kh.chap02.loop;

public class B_While {
	
	public void randomPick() {
	
	// 잘라 붙일 내용 - 난수 생성기
	 int num1 = (int)(Math.random() * 296 + 1);
	 int num2 = (int)(Math.random() * 296 + 1);
	 int num3 = (int)(Math.random() * 296 + 1);
	 int num4 = (int)(Math.random() * 296 + 1);
	 int num5 = (int)(Math.random() * 296 + 1);
	 int num6 = (int)(Math.random() * 296 + 1);
	  
	 System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6); 
	}

	
	public void method5() {
		// do-while문 파트
		
		do {
			System.out.println("일단 한 번은 실행하고 봄.");
		} while(false); 
		
	}
}
