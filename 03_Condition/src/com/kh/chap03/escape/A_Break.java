package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {

	
	
	public void method1() {
		// System.out.println("�ȳ� ���� �޼ҵ� 1�̿�");
		
		// ���� �ݺ��ϸ鼭 ������ ����(1~296)�� �����ؼ� ����ϴٰ� 50�� �����Ǹ� �ݺ��� �ߴ��ϵ���.
		// �� �� �������� �� �� �����Ƿ� while���� ����.
		while(true) {
			
		int num = (int)(Math.random() * 296) +1; 
		System.out.println(num);
		
		if(num == 153) { 
		
			System.out.println("���� ������ �����մϴ�.");
			break;
		}
		}
	
		
	}
	
	public void method2() {
		
		// ���� �ݺ��ϸ鼭 ����ڿ��� �� �� ���ڿ��� �Է¹��� �� �ش� ���ڿ��� ���̸� �����. ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ���ٸ� �ݺ��� ����.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�ƹ� ���ڿ��̳� �Է����ּ���. ��, ���Ḧ ���Ͻø� 'exit' �Ǵ� '������'�� �Է����ּ��� > ");
			String keyword = sc.nextLine();
			System.out.print( keyword + "��(��) " + keyword.length() + " �����Դϴ�. > ");
			
			if(keyword.equals("exit") || keyword.equals("������")) { System.out.print("���ڿ� �Է��� �����մϴ�.");
				break;
			}
		}
		
			
	}
	public void method3() {
		// �Ź� ����ڷκ��� �������� �Է¹ް� ���� �Է��� ���ڰ� 0���� �۴ٸ� "���α׷��� �����մϴ�."��� ������ ����ϰ� ������ ��.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ǻ����Դϴ�. �ƹ� ������ �Է����ּ���. >");
		while(true) {
			int num = sc.nextInt();
			if (num > 0 ) { System.out.print( "�Է��Ͻ� ����(��) " + num + "�Դϴ�. �ٽ� �Է����ּ���. > ");} 
			
			else { System.out.print("�Է��Ͻ� ����(��) " + num + "�Դϴ�.���α׷��� �����մϴ�.");
			
			break;
			}
		}
	}
	
	
	
	public void method4() {
		/* ����ڷκ��� �� ���� �������� �Է¹޾Ƽ� �Է¹��� ���ں��� 1������ ��� ���ڸ� ����ϵ��� �� ��. �� �Է¹޴� ������ 1���� Ŀ�� ��.
		 * ���� 1 �̸��� ���ڸ� �Է¹޾��� ��� "1 �̻��� ���ڸ� �Է����ּ���"��� ����� �� �ٽ� ���� �Է¹��� �� �ֵ��� ���� ��.��
		 */
		Scanner sc = new Scanner(System.in);
		// ���߿� ������ ã�Ƽ� ��ĥ ��.
		
		// System.out.print(num);
		System.out.print("1 �̻��� ���� �Է����ֽʽÿ�.");
		int num = sc.nextInt();
		while(true) {
			
			
			if(num >=  1) { 
			System.out.println(num);
			num = (num - 1);
			}
			else {System.out.print("���α׷��� �����մϴ�.");}
			break;
		}
	}
}
