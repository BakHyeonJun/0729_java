package com.kh.chap02.loop;

public class B_While {
	
	public void randomPick() {
	
	// �߶� ���� ���� - ���� ������
	 int num1 = (int)(Math.random() * 296 + 1);
	 int num2 = (int)(Math.random() * 296 + 1);
	 int num3 = (int)(Math.random() * 296 + 1);
	 int num4 = (int)(Math.random() * 296 + 1);
	 int num5 = (int)(Math.random() * 296 + 1);
	 int num6 = (int)(Math.random() * 296 + 1);
	  
	 System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6); 
	}

	
	public void method5() {
		// do-while�� ��Ʈ
		
		do {
			System.out.println("�ϴ� �� ���� �����ϰ� ��.");
		} while(false); 
		
	}
}
