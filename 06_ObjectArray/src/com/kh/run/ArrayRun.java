package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;


public class ArrayRun {

	public static void main(String[] args) {
		
		// �迭�� Ư¡
		// ���� �⺻���� Ư¡ : ������ ������ �������� ������ �����ϴ�.
		// ��Ÿ : ���� �ڷ����鳢���� ���� �� �ִ� -> ���� ����
		// �ϳ��� �迭�� ���� ���� ���� �� �ִ�.
		// �����ڷ����� �ش�ȴ�.
		// �ε��������� ������
		
		// int[] nums = new int[3]; // �Ϲ����� �迭 ��� ���
		// String[] strs = new String[5]; // ��ü �迭�� �ش���.
		
		// ��ü�迭�� ���� �� �Ҵ�
		// ������ - �����ڷ���[] �迭�ĺ��� = new �����ڷ���[�迭ũ��];
		
		Restaurant[] restaurants = new Restaurant[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < restaurants.length; i++) {
			System.out.print("��ȣ���� �Է��ϼ��� > ");
			String storeName = sc.nextLine();
			System.out.print("�ּ����� �Է��ϼ��� > ");
			String address = sc.nextLine();
			System.out.print("�ַ¸޴��� �Է��ϼ��� > ");
			String mainMenu = sc.nextLine();
			restaurants[i] = new Restaurant(storeName, address, mainMenu);
			System.out.println(restaurants[0].getMainMenu());
			restaurants[0].information();
			
		}
	for(int i = 0; i < restaurants.length; i++) {
		restaurants[i].information();
	}
	
	System.out.print("��ȣ���� �Է����ּ���. > ");
	String searched = sc.nextLine();
	for(int i = 0; i < restaurants.length; i++) {
		if(searched.equals(restaurants[i].getStoreName())) {
			System.out.println("��ǥ �޴� : " + restaurants[i].getMainMenu());
		}
	}
	
	}

}
