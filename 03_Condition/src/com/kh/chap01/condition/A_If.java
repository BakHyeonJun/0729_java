package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	
	/*
	 * (����) if��
	 * 
	 * ǥ���� - if(���ǽ�) { ���ǽ��� true�� ��� �����ϰ��� �ϴ� �ڵ�;
	 * }
	 * -> ���ǽ��� ����� true�� ��� : if�� Scope���� �ڵ尡 �����. false�� ��� �ش� Scope�� �ǳʶ�.
	 * 
	 */
	
	
	public void method1() {
		
		// System.out.println("����ù����μ��� ���� �ϼ�");
		if (0 < 1) {
			System.out.println("0�� 1���� �۴�");
		}
		// if���� ���ǽ� �ڸ����� ��������� true �ƴϸ� false ���� ������ ������ ��.
		if (false) {
			System.out.println("��� �׾��� ����� �� ���´�.");
			// ��, ������ �������� ����(�����ڵ�)�̶� ���� ����ǥ�� ��
			}
		if (true) {
			System.out.println("���ǽ� �ڸ����� ���������� true�� �;� �Ѵ�.");
		}
		

		
	}
	
	
	public void method2() {
		
		boolean loginCheck = false; // �α��� ���¸� �����ص� ����
		
		if (loginCheck == false) {
			System.out.println ("���̹��� �� �����ϰ� ���ϰ� �̿��غ�����.");
			System.out.println ("NAVER �α���");
			System.out.println ("���̵� ã�� | ��й�ȣ ã�� | ȸ������");
			
				}
		if (loginCheck) {
			System.out.println ("ȫ�浿�� ȯ���մϴ�");
			System.out.println ("���� | ī�� | ��α� | ���� | ����");
			
		}
		
	}
	
	
	public void lunchMenu() {
		
		// ������ ������ �Է¹޾Ƽ� ���ɸ޴��� ��õ���ִ� ���α׷��� ���� ��.
		
		Scanner sc = new Scanner(System.in);
		
		// ������ ������ ����. ����. ��� 3������ �����ؼ� ������ ��.
		
		System.out.print("������ ������ �����( 1. ���� / 2. ���� / 3. ��)");
		int weatherCode = sc.nextInt();
		
		// ����� �Է��ߴٸ� ��õ�� ����� ����.
		
		if (weatherCode == 1) {
			System.out.println ("���� �������� ���õ�� ������ ���ɸ��� ��õ�մϴ�.");
			}
		else if (weatherCode == 2) {
			System.out.println ("���� �������� ���õ�� ������ ���ɸ��� ��õ�մϴ�.");
			}
		else if (weatherCode == 3) {
			System.out.println ("����� �������� ���õ�� ������ ���ɸ��� ��õ�մϴ�.");
			}
		else {
			System.out.println ("��ȿ�� �Է��� �ƴմϴ�.");
		}
		// if (weatherCode != 1 && weatherCode != 2 && weatherCode != 3){
		//	System.out.println ("��ȿ�� �Է��� �ƴմϴ�.");
		// }
		// if (!(weatherCode == 1 || weatherCode == 2 || weatherCode == 3)){
		//	System.out.println ("��ȿ�� �Է��� �ƴմϴ�.");
		// }
		
		// ���ڿ��� ����� ������(==)�� ���� �� ����. 8���� �⺻�ڷ����� ����. -> ��� ���ڿ��� ��ġ�ϴ��� �����ִ� ".equals()"��� ����񱳿� �޼ҵ带 ȣ���ؾ� �Ѵ�.
		// ex) System.out.println(weather.equals("��"));
		// ���� : ���࿡ ����ڰ� �Է��� ���ڿ��� "��"�� ��ġ�Ѵٸ�
				
	}
	
	public void method3() {
		
		// ����ڿ��� �������� �Է¹޾Ƽ� Ȧ¦�� �Ǻ��� �� ���
		// �̹����� if���� �̿��ؼ� ����� ���̰�, + �Է¹��� ������ 0���� Ŭ ��쿡�� ���ǹ��� ������ ��.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȧ¦�� �Ǻ��ص帱 �״� 0���� ū ������ �Է��ϼ���.");
		int num = sc.nextInt();
		System.out.println(num);
		
		if ((num > 0 ) && (num % 2 == 0)) { 
			System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			}
		else if ((num > 0 ) && (num % 2 == 1)) { 
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
			}
		else { 
			System.out.println("��ȿ���� ���� �Է��Դϴ�.");
			}
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			}
			else {
				System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
			}
		}
		else { 
			System.out.println("��ȿ���� ���� �Է��Դϴ�.");
		}
		
		// Scope�� ���չ��� �����ֱ� ���� ���̹Ƿ� ���Ϲ����� ������ ���� �ִ�. �׷��� ���ִ� ���� ����.
		
		boolean flag = num > 0;
		
		if (flag && num % 2 == 0) {
			System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
		}
		else if (flag && num % 2 != 0) {
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� �Է��Դϴ�.");
		}
	
		
		// ���� ������ Ƚ���� ���� �� ������ ������, �׺��� �켱���ؾ� �ϴ� ���� �ϴ� ���ϴ� ��ǥ�� �����ϴ� ���̴�.
	}
	
	public void method4() {
		
		/*
		 * 1. �޴��� ����
		 * 2. �޴���ȣ�� �޴� �Է¹ޱ�
		 * 3. ���� �Է¹ޱ� 
		 * 4. ���ǹ� - if�� �̿��ؼ� �Է��� �޴���ȣ�� ���� �޴��� �����ϱ�. Ȥ�� ���� �޴� ��ȣ �Է��ߴٸ� ���� �޴���� �����ϱ�
		 * 5. ~ �޴��� ~�� �ֹ��ϼ̽��ϴ�. �޽��� ����
		 * 6. ��¥ �ֹ��� ���� ����� (Y/N �Է¹޾Ƽ� Ȯ���ϱ�)
		 * 7. 6���� �Է¹��� ���� ���ڰ� Y �Ǵ� y �� ��� �޴���� ������ ���� ����ϱ�  - if�� + ��ø if�� + ��¹�
		 * 
		 */
		
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("=======�޴���=======");
		System.out.println("1. ���� - 5,000 ��");
		System.out.println("2. ���� - 3,500 ��");
		System.out.println("�޴��� �������ּ���.");
		
		int menuNo = sc.nextInt();
		System.out.println("������ �Է����ּ��� > ");
		int glassNo = sc.nextInt();
		if (menuNo == 1) {
			if (glassNo > 0) {
				System.out.println("���ָ� " + glassNo + "�� �ֹ��ϼ̽��ϴ�.");
			}
		}
		else if(menuNo == 2) {
			if (glassNo > 0) {
				System.out.println("���ָ� " + glassNo + "�� �ֹ��ϼ̽��ϴ�.");
			}
		}
		else { System.out.println("��ȿ���� ���� �ֹ��Դϴ�.");}
		System.out.println("\n�� �������� �ֹ��Ͻðڽ��ϱ�? Y / N >");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		if (answer == 'Y' || answer == 'y') {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3500;
			System.out.println("�� ���� �ݾ��� " + (price * glassNo) + "�� �Դϴ�.");
			
		}
		else if (answer == 'N' || answer == 'n') {
			System.out.println("�ֹ��� ��ҵǾ����ϴ�.");
		}
		
		}
	
	}
	
	

	
	

