package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework3;

public class Run3 {

	public static void main(String[] args) {

		System.out.println("���� �˾ƺ���");
		Scanner sc = new Scanner(System.in); 
		Homework3 h3 = new Homework3();
		System.out.print("���� ������ �Է����ּ���. > ");
		h3.title = sc.nextLine();
		System.out.print("�÷����� �ð��� �Է����ּ���. (h) > ");
		h3.playTime = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է����ּ��� > ");
		h3.price = sc.nextInt();
		sc.nextLine();
		System.out.print("���߻縦 �Է����ּ��� > ");
		h3.develop = sc.nextLine();
		System.out.print("����縦 �Է����ּ���.(��) > ");
		h3.publish = sc.nextLine(); 
		
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h3.title + " ������ ����");
			System.out.println("�÷����� �ð� : " + h3.playTime + "�ð�");
			System.out.println("���� : " + h3.price);
			System.out.println("���߻�� : " + h3.develop);
			System.out.println("������ : " + h3.publish);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("�޴��� �������ּ��� > ");

			System.out.print("1. �÷��̽ð� �� / 2. ���� �� / 3. ���α׷� ���� > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h3.timeCheck(); break;
			case 2 : h3.priceCheck(); break;
			case 3 : exit = true; System.out.print("���α׷��� �����մϴ�."); break;
			default : System.out.println("��ȿ���� ���� �Է��Դϴ�. �޴��� �ٽ� �������ּ���.");
			}
		}

		
		
		
	}

}
