package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	
	public void method0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է����ּ���. (B1 / 1F / 2F/ 3F/ 4F) > ");
		String floor = sc.next();
		// System.out.println(floor);
		switch(floor) {
		case "B1" : System.out.println("���� 1���Դϴ�. ���� �����ϴ�."); break;
		case "1F" : System.out.println("1���Դϴ�. ���� �����ϴ�."); break;
		case "2F" : System.out.println("2���Դϴ�. ���� �����ϴ�."); break;
		case "3F" : System.out.println("3���Դϴ�. ���� �����ϴ�."); break;
		case "4F" : System.out.println("4���Դϴ�. ���� �����ϴ�."); break;
		default : System.out.println("��ȿ���� ���� �Է��Դϴ�.");
		}
		
		/*
		 * switch�� 
		 * ǥ���� - switch(case���� ������� ����� �Է� - ����, ����, �Ǽ�, ���ڿ� �� ��� ����)
		 *  {case "������� ��": ������ �ڵ�
		 *  �� �� � case���� ���յ��� ���� ��� - default ��ɾ Ȱ���Ͽ� ǥ��. ��, if�������� else�� �ش��ϴ� ����.
		 *  break�� �ش� ���������� Ż���Ű�� ��ɾ��̴�.
		 */
		}
	
	public void method1() {
		
		// �޴� �ֹ� : �δ��(10000), ������(11000), ��������(7000), Į����(6000), ������(5000), ������(8000)
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �������ּ���. (�δ�� / ������ / �������� / Į����/ ������ / ������ / ����) > ");
		String menu = sc.next();
		// System.out.println(menu);
		switch(menu) {
		case "�δ��" : System.out.println("�δ���� 10000 ���Դϴ�."); break;
		case "������" : System.out.println("������� 11000 ���Դϴ�."); break;
		case "��������" : System.out.println("���������� 7000 ���Դϴ�."); break;
		case "Į����" : System.out.println("Į������ 6000 ���Դϴ�."); break;
		case "������" : System.out.println("������� 5000 ���Դϴ�."); break;
		case "������" : System.out.println("������� 8000 ���Դϴ�."); break;
		case "����" : System.out.println("�غ����Դϴ�."); break;
		default : System.out.println("�������� �ʴ� �޴��Դϴ�.");
		return;
		} //break�� ������ ���������� �κ�
		
		// �ߺ������ϱ�
		// 1. �ߺ��� �κ��� �ϳ��� ����
		// 2. �ߺ��� �ƴ� �κ��� ������ ó��
		int result = switch(menu) {
		case "��������", "������", "Į����" -> 3000;
		case "������", "�δ��" -> 5000;
		default -> 0;
		};
		// -> �ַο�(ȭ��ǥ) �����ڶ�� �Ͽ� �̷� ������ �ڷḦ ó���ϴ� ��ĵ� ����.
		
		int price = 0;
		switch(menu) {
		
		case "�δ��" : price = 10000; break;
		case "������" : price = 11000; break;
		case "��������" : price = 7000; break;
		case "Į����" : price = 6000; break;
		case "������" : price = 5000; break;
		case "������" : price = 8000; break;
		case "����" : break;
		default : System.out.println("�������� �ʴ� �޴��Դϴ�.");
				
		}
		if(price != 0) {
		System.out.println("�����Ͻ� �޴��� " + price + "�� �Դϴ�.");
		}
		else {
			System.out.println("�غ����� �޴��Դϴ�.");
			
		}
	} // return�� ������ ���������� �κ�(method �ݴ� �κ�) : ���� �������� �޼ҵ� ������ �ƿ� ���������� ��ɾ��̹Ƿ�, �ƿ� �޼ҵ带 ȣ���� ������ ���ư�.
	
	public void login() {
		
		// �α��� ��� �����غ���.
		// ��ȹ - �� ���� ���ΰ�. ���� - ��� ���� ���ΰ�. ��ȹ�� �밳�� ��� Ŭ���̾�Ʈ�� �����̰�, �������� ���� ������ �����̹Ƿ� ���谡 ���� �߿�.
		// �α��� ������ �� �ʿ��� �� - ����ڰ� �Է��� ���̵�, �н����� - �밳�� ��� �� �� ���ڿ�(String) ������ ��.
		// �α��� �� �ʿ��� ���� �۾� - ȸ������
		// 1. ȸ�����Խ� ����ڰ� ���ϴ� ���̵� ���� ��й�ȣ ���� �Է��Ͽ� ȸ�������� ������ ���̰�,
		// 2. ���� �� �Է��ߴ� ���̵�� ��й�ȣ�� �� �� ��Ȯ�� �Է��Ѵٸ� �α��� ���� ȭ���� ����ϰ� �ǰ�
		// 3. �� �� �ϳ��� ��ġ���� �ʴ´ٸ� �α��� ���� ȭ���� ����Ͽ��� �Ѵ�.
		String id = "user01";
		String password = "pass01";
		String name = "����ȫ";
		
		System.out.println("kh up10 ");
		System.out.println("=================");
		System.out.println("�α��� �����Դϴ�.");
		System.out.println("=================");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.print("���̵� > ");
		String userId = sc.nextLine();
		System.out.println("-----------------");
		
		System.out.println("-----------------");
		System.out.print("�н����带 �Է��ϼ���. > ");
		String userPwd = sc.nextLine();
		System.out.println("-----------------");
		
		// ���� ����ڰ� �Է��� ���̵� ���� ȸ������ �� ������ ���̵� ���� �����ϰ� ����ڰ� �α��� �� �Է��� ��й�ȣ ���� ȸ�����Խ� ������ ��й�ȣ ���� �����ϴٸ�
		if (userId.equals(id) && userPwd.equals(password)) {
			System.out.println( name + "�� ȯ���մϴ�.");
		}
		else if (!userId.equals(id))
		{	
		System.out.println("�������� �ʴ� ���̵��Դϴ�.");}
		else {
		System.out.println("��й�ȣ�� �߸� �ԷµǾ����ϴ�.");
		}
		// �⺻�ڷ��� : boolean, char, byte, short, int, long, float, double - ����� ������ ���࿡ ������ ����
		// �����ڷ��� : �� �� - ����� �����ڸ� ���ؼ� ���� ���ϴ� ���� �Ұ����ϴ�. ���� ������ ���� ���� '�ּҰ�'�̱� ����.
		// �׷��� ������ ���ڿ��� ���� �� : equals() -> true / false 
	}
	
	
}
