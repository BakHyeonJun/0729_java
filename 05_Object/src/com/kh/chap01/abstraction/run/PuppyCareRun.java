package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

	public static void main(String[] args) {
		// ����ڷκ��� �������� ������ �Է¹޾Ƽ� �� ������ ������ְ� �������� �Բ� ����� �� �ִ� ���α׷�
		
		System.out.println("�Ϳ��� �� Ű���");
		Scanner sc = new Scanner(System.in); // ���� - ��ĳ�� Ÿ���� ���� ����. ���� - ��ĳ�� ��ü ����
		Puppy puppy = new Puppy();
		System.out.print("���� �̸��� �Է����ּ���. > ");
		puppy.name = sc.nextLine();
		System.out.print("���� ǰ���� �Է����ּ���. > ");
		puppy.species = sc.nextLine();
		System.out.print("���� ���̸� �Է����ּ���. > ");
		puppy.age = sc.nextInt();
		sc.nextLine(); // ������ �� ��!
		System.out.print("���� ������ �Է����ּ���. > ");
		puppy.color = sc.nextLine();
		System.out.print("���� ������ �Է����ּ���. > ");
		puppy.gender = sc.nextLine();
		System.out.print("���� ü���� �Է����ּ���. > ");
		puppy.weight = sc.nextInt();
		sc.nextLine(); // ������ �� ��!
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(puppy.name + "�� ����!");
			System.out.println("���� : " + puppy.age);
			System.out.println("ǰ�� : " + puppy.species);
			System.out.println("���� : " + puppy.color);
			System.out.println("���� : " + puppy.gender);
			System.out.println("ü�� : " + puppy.weight);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("�޴��� �������ּ��� > ");
			if (puppy.weight > 40) {
				System.out.println("���̾�Ʈ�� ���� ¢�⸦ ��õ�����");
			}
			System.out.print("1. �����ñ� / 2. ¢�� / 3. ���α׷� ���� > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : puppy.sniff(); break;
			case 2 : puppy.bark(); break;
			case 3 : exit = true; System.out.print("���α׷��� �����մϴ�."); break;
			default : System.out.println("�޴��� �ٽ� �������ּ���.");
			}
			
		}
		
		
		
		
		
	}

}
