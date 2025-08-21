package com.kh.exception.controller;

import java.util.Scanner;

public class UncheckedException {

	/*
	 * ���α׷� ����� �߻��ϴ� ���ܵ�(�����Ϸ��� üũ������ ����)
	 * RuntimeException
	 * 
	 *  - NullPointerException(NPE) : �ּҰ� ��ü�� �����ߴ��� null ���� ������� ��� �߻��ϴ� ����
	 *  - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �������� �� �߻��ϴ� ����
	 *  - ClassCastException : ����� �� ���� ����ȯ�� ������ ��� �߻��ϴ� ����
	 *  - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ����
	 *  - NegativeArraySizeException : �迭�� �Ҵ��� �� ũ�⸦ ������ �����ϸ� �߻��ϴ� ����
	 *  ���
	 *  
	 *  
	 *  RuntimeException�� ���õ� ���ܵ��� �������� ���� - �����ڰ� ������ ������.
	 */
	
	// ArithmeticException
	public void method1() {
		// ����ڷκ��� �� ���� �������� �Է¹޾Ƽ� �������� �� �� ����� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է����ּ���. > ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�� ��° ������ �Է����ּ���. (0�� �Ұ�) > ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// ��� 1. ���ܹ߻� ��ü�� ��õ �����ϴ� ��.
		if(num2 != 0 ) {
		System.out.println("���� ��� : " + (num1 / num2));
		} else {
			System.out.println("���� ����� �� ���� ����");
		}
		
		// ��� 2. ����ó���� �����ϴ� ��.
		// ���� ��Ȳ�� �����ϰ� ���� ��Ȳ �߻���
		// ���α׷��� ���������� ���ᰡ �Ǵ� ���� �����ϰ� ������ ������ġ�� ���ϴ� ��
		/*
		 * try ~ catch ��
		 * ǥ����
		 * try { (num1 / num2) // <- �̿� ���� ���ܰ� �߻��� �� �ִ� ������ �־��}
		 * catch(�߻��� ���� Ŭ���� ��, ���� ���� ����) {
		 * }
		 * 
		 */
		try {
			System.out.println(num1 / num2);
			System.out.println("�ùٸ� ���� �Է�!"); // try���� error(���� ����) �߻��ϴ� ��� catch�� �����. �׷��Ƿ� ���� �߻��� �� �ִ� �κ� ���� ������ ���������� �� ���ɼ��� �����Ƿ� ���⿡�� �߿��� ������ ���� ���ƾ� �Ѵ�.
		} catch(ArithmeticException e) {
			System.out.println("�� ��° ������ 0�� �Է��Ͻø� ���� ���� �����ϴ�.");
			
		}
		
		System.out.println("���α׷� ����");
		
	}
	
}
