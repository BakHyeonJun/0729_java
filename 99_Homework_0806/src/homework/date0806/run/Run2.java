package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework2;

public class Run2 {

	public static void main(String[] args) {
		System.out.println("�뷡 �˾ƺ���");
		Scanner sc = new Scanner(System.in); 
		Homework2 h2 = new Homework2();
		System.out.print("�뷡 ������ �Է����ּ���. > ");
		h2.title = sc.nextLine();
		System.out.print("�۰�� �Է����ּ��� > ");
		h2.writer = sc.nextLine();
		System.out.print("�ۻ簡�� �Է����ּ��� > ");
		h2.lyricist = sc.nextLine();
		System.out.print("������ �Է����ּ��� > ");
		h2.singer = sc.nextLine();
		System.out.print("���ֽð��� �Է����ּ���.(��) > ");
		h2.minute = sc.nextInt(); 
		System.out.print("���ֽð��� �Է����ּ���.(��) > ");
		h2.second = sc.nextInt();
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h2.title + " �뷡�� ����");
			System.out.println("�۰�� : " + h2.writer);
			System.out.println("�ۻ簡�� : " + h2.lyricist);
			System.out.println("������ : " + h2.singer);
			System.out.println("���ֽð� : " + h2.minute + "�� " + h2.second + "��");
			System.out.println("==========");
			System.out.println();
			
			System.out.println("�޴��� �������ּ��� > ");

			System.out.print("1. ���ֽð� �м� / 2. ���α׷� ���� > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h2.lengthCheck(); break;
			case 2 : exit = true; System.out.print("���α׷��� �����մϴ�."); break;
			default : System.out.println("��ȿ���� ���� �Է��Դϴ�. �޴��� �ٽ� �������ּ���.");
			}
		}
	}

}
