package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {
	
	// �߿䵵 �ſ� * 40 ����
	
	public void method1() {
		// 1���� 10���� �ݺ��� �ϸ鼭 �������� ����ϴµ� Ȧ���� ���� ����� ��.
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
		System.out.println("ȸ������ �����Դϴ�");
		System.out.println("���̵� �Է����ּ���(9�� ����) > ");
		String userId = sc.nextLine();
		if(userId.length()>9) {
			System.out.println("9�� ������ ���̵� ��� �����մϴ�.");
			continue;
		} else {
			System.out.println("��� ������ ���̵��Դϴ�,");
			break;
		}
		
		
		}
		System.out.println("�����");
	}

}
