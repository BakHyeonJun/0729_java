package com.kh.chap06.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �������� ���� �� ���� �� ���� ����
		int cnt1 = 0;
		int cnt2 = 0;
		int boundary = 0;
		int quizCount = 0;
		
		
		while(true) {quizCount++;
			System.out.println("���� ����");
			System.out.println("���̵��� �������ּ���(��/ ��/ �� / ������)");
			String level = sc.nextLine();
			
			if (level.equals("��")) { 
			System.out.println("���̵� ���� �����ϼ̽��ϴ�. 1~10000 ������ ������ �����˴ϴ�.");
			boundary = 10000;
			}
			else if (level.equals("��")) { 
			System.out.println("���̵� ���� �����ϼ̽��ϴ�. 1 ~ 100 ������ ������ �����˴ϴ�.");
			boundary = 100;
			}
			else if (level.equals("��")) { 
				System.out.println("���̵� �ϸ� �����ϼ̽��ϴ�. 1 ~ 10 ������ ������ �����˴ϴ�.");
				boundary = 10;
			}
			else if (level.equals("������")){ 
				System.out.println("���� ��� �����մϴ�.");
				break;
			}
				
			else {System.out.println("�������� ���̵� �Է��Դϴ�. �ٽ� �������ּ���.");
			continue;
			}
			int firstNum = (int)(Math.random() * boundary + 1);
			int secondNum = (int)(Math.random() * boundary + 1);
			
			System.out.println(quizCount + "�� ����");
			System.out.println(firstNum + " + " + secondNum + " = ?");
			System.out.print("������ �Է����ּ���. > ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == firstNum + secondNum) {
				System.out.println("�����Դϴ�.");
				cnt1++; 
				}
			else {
				System.out.println("�����Դϴ�.");
				cnt2++; 
			}
			double rate = ((double)cnt1 / ((double)quizCount));
			System.out.println("����Ƚ�� : " + cnt1 + "�� / ����Ƚ�� : " + cnt2 + "��");
			System.out.println("����� : " + (((double)rate) * 100) + "%");
			System.out.println("");
		}
}
}