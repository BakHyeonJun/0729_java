package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework4;

public class Run4 {

	public static void main(String[] args) {

		System.out.println("���� �˾ƺ���");
		Scanner sc = new Scanner(System.in); 
		Homework4 h4 = new Homework4();
		System.out.print("���� ������ �Է����ּ���. > ");
		h4.title = sc.nextLine();
		System.out.print("�۰����� �Է����ּ���. > ");
		h4.writer = sc.nextLine();
		System.out.print("������ �Է����ּ���. > ");
		h4.score = sc.nextDouble();
		sc.nextLine();
		System.out.print("�ֱ� ���ε� ���ڸ� �Է����ּ���. > ");
		h4.recent = sc.nextLine();
		System.out.print("���� ���ε� ���ڸ� �Է����ּ���. > ");
		h4.next = sc.nextLine(); 
		
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h4.title + " ������ ����");
			System.out.println("�۰��� : " + h4.writer);
			System.out.println("���� : " + h4.score);
			System.out.println("�ֱ� ���ε� ���� : " + h4.recent);
			System.out.println("���� ���ε� ���� : " + h4.next);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("�޴��� �������ּ��� > ");

			System.out.print("1. ���� �м� / 2. ���α׷� ���� > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h4.scoreCheck(); break;
			case 2 : exit = true; System.out.print("���α׷��� �����մϴ�."); break;
			default : System.out.println("��ȿ���� ���� �Է��Դϴ�. �޴��� �ٽ� �������ּ���.");
			}
		}
		
		
		
	}

}
