package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework1;

public class Run1 {

	public static void main(String[] args) {
				
		System.out.println("��ǰ �м��ϱ�");
		Scanner sc = new Scanner(System.in); // ���� - ��ĳ�� Ÿ���� ���� ����. ���� - ��ĳ�� ��ü ����
		Homework1 h1 = new Homework1();
		System.out.print("��ǰ�� �̸��� �Է����ּ���. > ");
		h1.name = sc.nextLine();
		System.out.print("��ǰ�� ������ �Է����ּ���.(��) > ");
		h1.price = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ�� ������ �Է����ּ���.(Kcal) > ");
		h1.calorie = sc.nextInt();
		sc.nextLine(); 
		System.out.print("��ǰ�� �߷��� �Է����ּ���.(g/mL) > ");
		h1.gram = sc.nextInt();
		sc.nextLine(); 
		System.out.print("��ǰ�� �Һ������ �Է����ּ���. (yyyymmdd) > ");
		h1.date = sc.nextInt();
		sc.nextLine();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h1.name + " ��ǰ�� ����!");
			System.out.println("���� : " + h1.price + " ��");
			System.out.println("���� : " + h1.calorie + "Kcal");
			System.out.println("�߷� : " + h1.gram + "gram");
			System.out.println("�Һ���� : " + h1.date);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("�޴��� �������ּ��� > ");

			System.out.print("1. �Һ���� ���� / 2. ���� �м� / 3. ���α׷� ���� > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h1.dateCheck(); break;
			case 2 : h1.calCheck(); break;
			case 3 : exit = true; System.out.print("���α׷��� �����մϴ�."); break;
			default : System.out.println("��ȿ���� ���� �Է��Դϴ�. �޴��� �ٽ� �������ּ���.");
			}
		

	}
	}
}
