package com.kh.operator;

import java.util.Scanner;

public class C_Compound {

	// ������
	
	
		/* ���� ���� ������
		 * 
		 * ~
		 * 
		 * ����
		 * 
		 * int endDays = 129;
		 * ���� 23�� 59�� 59�ʿ� ������ �ڵ� :
		 * 
		 * endDays = endDays - 1;
		 * 
		 * ------------------------
		 * 
		 * endDays -= 1;
		 * 
		 */
		
		public void method1() {
			
			System.out.println("ũ�� ���� �����ϴ�.");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�������� �ϳ��� �Է����ּ���");
			
			int number = sc.nextInt();
			System.out.println(number);
			
			// ����ڰ� �Է��� �������� �� �� ����.
			// ����ڰ� �Է��� ������ 10�� �� ���� ����ϰ��� ��.
			
			number = number - 10;
			System.out.println("10�� ���ҽ�Ų ���� �� : " + number);
			
			
		}
		
	
}
