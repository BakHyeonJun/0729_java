package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * 
	 * If ~ else
	 * ǥ���� - if(���ǽ�) {
	 * }
	 * 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���� �ϳ��� �Է��ϼ��� > ");
		
		int num = sc.nextInt();
		System.out.println("�Է��Ͻ� ������ " + num + "�Դϴ�");
		if(num > 0) {
			System.out.println("�Է°��� 0���� Ů�ϴ�.");
			}
		else { System.out.println("�Է°��� 0���� ũ�� �ʽ��ϴ�.");
			}
		
		/*
		 * if(!(num>0) {
		 *  System.out.println("0���� ũ�� �ʽ��ϴ�.");
		 *  }
		 *  
		 *  if ���� ���ǽ��� ����� true�� ��� -> else ���� �ǳ� ��. �� ��� ���ʿ��� ������ �پ��� ó���ӵ��� ���.
		 *  
		 */
	}
	
	public void method2() {
		// ������ �Է¹޾Ƽ� 0���� ū�� 0���� 0���� ������ ����� ��.
		
			
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� > ");
		int num = sc.nextInt();
		System.out.println("�Է��Ͻ� ������ " + num + "�Դϴ�");
		if(num > 0) {
			System.out.println("�Է°��� 0���� Ů�ϴ�.");
			}
		else if(num == 0) {
			System.out.println("�Է°��� 0�Դϴ�.");
			}
		else { System.out.println("�Է°��� 0���� �۽��ϴ�.");
			}
		}
	
	public void ageCheck() {
		// ����ڷκ��� ����(����)�� �Է¹ް�, �Է¹��� ���̿� ���� ���� �ٸ� ������ ������ּ���.
		// 1 ~ 12 : ����Դϴ�.
		// 13 ~ 17 : û�ҳ��Դϴ�.
		// 18 ~ : �����Դϴ�.
		// else : ��ȿ���� ���� ���Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� ���Դϱ�? > ");
		int age = sc.nextInt();
		System.out.println("����� " + age + "���̽ñ���");
		if(0< age && age <= 12)  {
			System.out.println("����� ����Դϴ�.");
			}
		else if(13 <= age && age <= 17) {
			System.out.println("����� û�ҳ��Դϴ�.");
			}
		else if(18 <= age && age <= 148) {
			System.out.println("����� �����Դϴ�.");
			}
		else {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
		}
		
		// ���ʿ��� ������ ���̱� ���ؼ��� ������ ���� ���Ǻ��� �Է��ϴ� ���� ����.
		/*
		 * ex) if(age <= 0 || age >= 148) {
		 * System.out.println("��ȿ���� ���� ���Դϴ�.");
			}
		else if {
			(18 <= age && age <= 148) {
						System.out.println("����� �����Դϴ�.");
			}
		else if (age <= 12)  {
			System.out.println("����� ����Դϴ�.");
			}
		else { 
		System.out.println("����� û�ҳ��Դϴ�.");
		} 
		 * 
		 * 
		 * 
		 */
	}
	
}
