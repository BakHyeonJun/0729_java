package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * �� ������ : �� ���� ������ �����ϴ� ������
	 * 
	 * ǥ���� : ���� �������� ���� -> ������� ����
	 * 
	 *  ����
	 *  1. AND ������ - &&
	 *  ���װ� ������ ���� ��� ture���߸� ���� ����� true
	 *  
	 *  2. OR ������ - ||
	 *  ���װ� ���� �� �ϳ��� true�̸� ���� ����� true
	 *  
	 * 
	 * 
	 */
	
	public void method1() {
		
		// ����ڿ��� �������� �ϳ� �Է¹��� �� ����ڰ� �Է��� ���� ���� 0���� ũ�鼭 ¦������ �Ǻ��Ѵ� -> �׸��� ���� �� ����� ����� ��.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ�");
		int num1 = sc.nextInt();
		boolean result = (num1 > 0) && (num1 % 2 == 0);
		System.out.println("�Է��� ������ : " + num1); // ����ù��� �ؾ� �� ��, �Է��� ���� �� Ȯ���ϱ� - ������ ����.
		System.out.println("�Է��� �������� 0���� ū�� : " + (num1 > 0));
		System.out.println("�Է��� �������� ¦���ΰ� : " + (num1 % 2 == 0));
		System.out.println("�Է��� �������� 0���� ū ¦���ΰ� : " + result);
		System.out.println("�Է��� �������� 70���� ũ�ų� Ȧ���ΰ� : " + ((num1 > 70) || (num1 % 2 == 1)));
		System.out.println("�Է��� ������ ������ ���ΰ� : " + num1 * num1);
		System.out.println("�Է��� ������ �������� ���ΰ� : " + num1 * num1 * num1);
		System.out.println("�Է��� ������ �������� ���ΰ� : " + num1 * num1 * num1 * num1);
		System.out.println("�Է��� ������ �������� 10���� 1�� ���ΰ�(�Ҽ��� ����) : " + num1 * num1 * num1/10);
					
	}
	
	public void method2() {
		// ����ڿ��� ���� ���� �Է¹޾Ƽ�
		// ������ ������ ��
		// ����غ�����.
		Scanner sc2 = new Scanner(System.in);
		System.out.println("-70�̻� 70 ������ �������� �� ��° �������� �Է��Ͻÿ�");
		int num2 = sc2.nextInt();
		boolean result2 = (-70 <= num2) && (num2 <= 70);
		System.out.println("������ ������ ���� �Ǵ� : " + result2);
		// result2 = true ? System.out.println("�Է��� �� : " + num2) : System.out.println("������ ���� �ƴմϴ�."); 
		// else result2 = true System.out.println("�Է��� �� : " + num2);
		// �� �� �� ���� �ߴ� ���� ã�Ƽ� �ذ��� ��
			
		String check = (result2 == true) ? "�Է��Ͻ� ���� " + num2 + "�Դϴ�."  : "������ ���� �ƴմϴ�";
		System.out.println(check);
		
	}
	
	public void method3() {

		// ����ڿ��� �� ���ڸ� �Է� �޾Ƽ� �Է¹��� ���� ������ A �Ǵ� a ������ Ȯ���ؼ� ����ϱ�
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("���ĺ� �ϳ��� �Է��Ͻÿ�");
		char ch1 = sc3.nextLine().charAt(0);
		// nextLine�� ���๮�� �������� �Է� ������ �޴� ���̹Ƿ� �⺻������ ���ڿ� �ڷ��� (string)���� ó���ȴ�. �׷��Ƿ� ����ȯ�� ���� ���װ� ������ �ڷ��� ��ġȭ�� �ʿ�. �� �� ���� ���� ���ڿ��� ù ��°(0��)���� ������ ���� ������ ���ڸ� �ҷ��� �� �ִ� charAt�� ����Ѵ�.
		
		System.out.println("�Է��� ���� : " + ch1);
		
		// ���� ������ �ϰ� �Ǵ°�?
		// ����� ���� : ���� ������ ��� ����� ������ �����Ѱ�? - �����ϴ�.
		// ���� - char���� int ������ �ڵ� ����ȯ�� �Ͼ �� ������ �Ѵ�.
		boolean result3 = (ch1 == 'A') || (ch1 == 'a');
		System.out.println("�Է��� ���� A �Ǵ� a�ΰ� : " + result3);
		
		
	}
	
	public void tip() {
		
		int num = 10;
		boolean result = false && (num>0);
		boolean result2 = (num<0) && (num == 10);
		
		// AND ���꿡�� ���� ������ false�� ��� ���� ������ �� ���θ� ���� �ʿ䰡 ���� ��ü ������ �����̹Ƿ� �ڹٴ� �ƿ� ���� ������ ������ ����.
	}

}
