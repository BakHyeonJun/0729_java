package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	
	/*
	 * ������ ��Ʈ�� ������ - ���� ������ : �ǿ����ڰ� 3�� -> �� 3���� 1���� �����ڷ� �̷����(���ǹ��� �������� ����)
	 * 
	 * ���ǹ� : ���� ���� ������ ó���ϴ� ���
	 * 		������� true�� ��� ù ������ ó���ϰ�
	 * 		������� false�� ��� �� ��° ������ ó����.
	 * 
	 * ǥ���� - ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� �����
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		System.out.println("���� �޴��� : ");
		System.out.println("1. �� ��� ���� ��� ����Ǫġ��");
		System.out.println("2. �ڸ� ���� ���� ����Ǫġ��");
		System.out.println("3. ī�� ����� ����Ǫġ��");
	
		// ����Ʈ(Source �޴��� �ִ� Organize Imports) ����Ű - Ctrl Shift O
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴� ��ȣ�� �Է����ּ��� > ");
		int menuNo = sc.nextInt();
		
		System.out.println("������ �Է����ּ��� > ");
		int glassNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "�� ��� ���� ��� ����Ǫġ�븦 " + glassNo + "�� �ֹ��ϼ̽��ϴ�."
							: (menuNo == 2) ? "�ڸ� ���� ���� ����Ǫġ�븦 " + glassNo + "�� �ֹ��ϼ̽��ϴ�."
							: (menuNo == 3) ? "ī�� ����� ����Ǫġ�븦 " + glassNo + "�� �ֹ��ϼ̽��ϴ�."
							: "�������� �ʴ� �޴��Դϴ�.";
		System.out.println(selectedMenu);
		
		// Ȧ¦ ���ϱ�
	}
	public void method2() {
	
		// ����ڷκ��� ���� ���� �ϳ� �Է¹޾Ƽ� �Է¹��� ������ Ȧ������ ¦������ �Ǻ��Ͽ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ϳ� �Է��ϼ���.");
		
		int integer1 = sc.nextInt();
		System.out.println("�Է��Ͻ� ������ " + integer1 + "�Դϴ�.");
		String result = (integer1 % 2 == 0) ? "�������, �Է��Ͻ� ������ ¦���Դϴ�."
					  : "�������, �Է��Ͻ� ������ Ȧ���Դϴ�.";
		System.out.println(result);
		char oddEven = ((integer1 % 2 == 0)) ? '¦'
			  	 : 'Ȧ';
		System.out.println("�Է��Ͻ� " + integer1 + "��(��)" + oddEven + "���Դϴ�.");
			
		
			
	}
		
	public void mine1() { 
	
	// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ĺ��� �ҹ������� �빮������ �Ǻ� �� ����ϱ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ��� �ϳ� �Է��ϼ���");
		char letter = sc.nextLine().charAt(0);
		System.out.println("�Է��Ͻ� ���ڴ� " + letter + "�Դϴ�");
		String result = (65 <= letter) && (letter <= 96) ? "�������, �Է��Ͻ� ���ĺ��� �빮���Դϴ�."
					  : (97 <= letter) && (letter <= 128) ? "�������, �Է��Ͻ� ���ĺ��� �ҹ����Դϴ�."
					  : "��ȿ�� ���ĺ��� �ƴմϴ�."; 
		// �׳� 'a', 'z', 'A', 'Z'�� ��Һ��Ͽ��� ��ȿ�� ����� ��µ�.
		
		System.out.println(result);
		
		
		
		
		
	}
		
		
	}
	
