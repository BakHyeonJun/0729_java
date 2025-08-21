package com.kh.variable;

import java.util.Scanner;


public class B_KeyboardInput { 

	//API - Application Programming Interface 
	
	/*
	 * Ű���带 �̿��ؼ� ����ڷκ��� ���� �Է¹��� ����.
	 * �ڹٿ��� �������ִ� Scanner��� Ŭ������ ����Ѵ�. 
	 * Scanner Ŭ������ �����ϰ� �ִ� �޼ҵ���� ȣ���ؼ� �Է��� ���� �� ����.
	 * 
	 */
	
	public void inputTest() {
		System.out.println();
		System.out.println("����ȣȣ~");
		
		Scanner sc = new Scanner(System.in);
		// System.in : ǥ�� �Էµ������� �Է¹��� ������ �ްڴ�. (����Ʈ ����)

		// �ⰡĿ��
		// ����ڿ��� �ֹ��� ���Ḧ �Է¹޾Ƽ� ����غ���
		
		System.out.println("=======�ܸ޴��ǣ�=======");
		System.out.println("���ⰡĿ�ǿ� ���� ���� ȯ���մϴ�.��");
		System.out.println("���ѱ��� ���������� ����ÿ��");
		System.out.println("��KH���������� A�����忡�� ���� ����󶼣�");
		System.out.println("�ܼ����ֽ���");
		System.out.println("=====================");
		System.out.println("�ֹ��Ͻ� �޴��� �Է����ּ��� > ");
		
		String menu = sc.next();
		
		
		// next() : ����ڰ� �Է��� �� �� ������ ���� ��� ���鹮�� ���������� �Է¹���.
		// ����ڰ� �Է��� �޴��� ���������. ex) �����ֽ��� �ֹ��ϼ̽��ϴ�.
		
		System.out.println(menu + "��(��) �ֹ��ϼ̽��ϴ�.");
		
		System.out.println("�� �� �ֹ��Ͻðڽ��ϱ�?(���ڷ� �Է����ּ���) > ");
		int number = sc.nextInt();
		System.out.println(menu + "��(��)" + number + "�� �ֹ��ϼ̽��ϴ�.");
		sc.nextLine();
		System.out.println("�ּ����� �Է����ּ��� > ");
		String address = sc.nextLine();
		
		// nextLine() : ����ڰ� �Է��� ���� ����� �����ϰ� ���๮�� �������� ��ü�� �� �о��. ���� �Է¹��ۿ� �����ϴ� "���๮��"�� ������.
		// ���� ���� ��ĳ�ʸ� ������ �Է¹��ۿ��� ��ġ �κи� RAM���� �������� ���๮�ڸ� ���ܵδ� ������ �ִµ�, �̸� �ذ��ϱ� ���ؼ��� nextline()�� �� �� �� ���ش�.
		
		
		System.out.println(menu + " " + number + "���� " + address + "�� ����մϴ�.");
		
	}
	
	
}
