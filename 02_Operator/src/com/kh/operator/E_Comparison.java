package com.kh.operator;

public class E_Comparison {

	/*
	 * �� ������(���� ������) '3' == (int) '3'
	 * 
	 * �� ���� ���� ������ ���ϹǷ� ���� ��������
	 * �񱳿����� �� ��� -> ���� ��� true, ������ ��� false
	 * Ư�� ������ ������ �� �ִ� ���ǹ����� ���ǽ����� ����� ����
	 * 
	 * ���� - �����, ��Һ�
	 * 
	 * 
	 * 1. ����� : �� ���� ���� ��ġ�ϴ����� ��
	 * 
	 * a == b : �ǹ� - a�� b�� ��ġ�ϴ°�?
	 * a != b : �ǹ� - a�� b�� ��ġ���� �ʴ°�?
	 * 
	 * 2. ��Һ� 
	 * a < b : �ǹ� - a�� b���� ������?
	 * a > b : �ǹ� - a�� b���� ū��?
	 * a <= b : �ǹ� - a�� b���� �۰ų� ������?
	 * a >= b : �ǹ� - a�� b���� ũ�ų� ������?
	 * 
	 * ������� true/false�� ������ ��.
	 * 
	 */
	
	public void method1() {
		
		System.out.println("ųųų");
		int num1 = 70;
		int num2 = 10;
		System.out.printf("\n�� 1 : %d,  �� 2 : %d\n" , num1, num2);
		System.out.println();
		System.out.println("��1 < ��2 : " + (num1 < num2));
		System.out.println("�� ���� ������ : " + (num1 == num2));
		System.out.println("�� ���� ���� 60�ΰ� : " + (num1 - num2 == 60 ));
		System.out.println("ù ��° ���� ¦���ΰ� : " + (num1 % 2 == 0));
		System.out.println("�� ��° ���� Ȧ���ΰ� : " + (num2 % 2 == 1));
		
		
		
		// % ���� ������ ���� �������� ���ϴ� ������
		
		
		
		
		
	}
	
}
