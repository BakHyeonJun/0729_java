package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {

		// Restaurant r1 - new Restaurant();
		// System.out.println(r1.information);

		/*
		 * 1�ܰ�. ����ڷκ��� �Ĵ��� ������ �Է¹޾Ƽ� ���� 3���� �Ĵ������� �Է¹޴´ٰ� ����
		 */
		Scanner sc = new Scanner(System.in);
		Restaurant r1 = null;
		Restaurant r2 = null;
		Restaurant r3 = null;

		for (int i = 1; i < 4; i++) {
			System.out.printf("�Ĵ� %d�� ��ȣ�� �Է����ּ���. > ", i);
			String storeName = sc.nextLine();
			System.out.printf("�Ĵ� %d�� �ּҸ� �Է����ּ���. > ", i);
			String address = sc.nextLine();
			System.out.printf("�Ĵ� %d�� �ַ¸޴��� �Է����ּ���. > ", i);
			String mainMenu = sc.nextLine();
			if(i == 1) {
				r1 = new Restaurant(storeName , address, mainMenu);
				r1.information();
			} else if (i == 2) {
				r2 = new Restaurant(storeName, address, mainMenu);
				r2.information();
			}	else {
				r3 = new Restaurant(storeName, address, mainMenu);
				r3.information();
			}
			
			

		}
		System.out.print("��ȣ���� �Է����ּ��� > ");
		String searched = sc.nextLine();
		
		if(searched.equals(r1.getStoreName())) {
			System.out.println("��ǥ �޴� : " + r1.getMainMenu());
		}
		if(searched.equals(r2.getStoreName())) {
			System.out.println("��ǥ �޴� : " + r2.getMainMenu());
		}
		if(searched.equals(r3.getStoreName())) {
			System.out.println("��ǥ �޴� : " + r3.getMainMenu());
		}
		
		
	}
}
/*
 * System.out.print("�Ĵ�2�� ��ȣ�� �Է����ּ���. > "); String storeName2 = sc.nextLine();
 * System.out.print("�Ĵ�2�� �ּҸ� �Է����ּ���. > "); String address2 = sc.nextLine();
 * System.out.print("�Ĵ�2�� �ַ¸޴��� �Է����ּ���. > "); String mainMenu2 = sc.nextLine();
 * 
 * System.out.print("�Ĵ�3�� ��ȣ�� �Է����ּ���. > "); String storeName3 = sc.nextLine();
 * System.out.print("�Ĵ�3�� �ּҸ� �Է����ּ���. > "); String address3 = sc.nextLine();
 * System.out.print("�Ĵ�3�� �ַ¸޴��� �Է����ּ���. > "); String mainMenu3 = sc.nextLine();
 * 
 * Restaurant r = new Restaurant(storeName, address, mainMenu); Restaurant r2 =
 * new Restaurant(storeName2, address2, mainMenu2); Restaurant r3 = new
 * Restaurant(storeName3, address3, mainMenu3); r.information();
 * r2.information(); r3.information();
 */
// ó����� - 1. ���� ȣ�� 2.�Ű������� ���ڰ��� ����

// (������) ª�� �ڵ尡 ���� -> false. �ߺ��� ���� �ڵ�� ���� �ʴ�. -> true.
// - �� ���ؿ� ������ ���� ����� ���� ����� �ƴ�.

/*
 * 2�ܰ�. ����ڷκ��� ��ȣ���� �Է¹޾Ƽ�
 * 
 */
