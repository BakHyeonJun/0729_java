package homework.date0807.run;

import java.util.Scanner;

import homework.date0807.capHW.Homework1;

public class Run1 {

	public static void main(String[] args) {

		
		Homework1 h1 = new Homework1();
		
		System.out.println(h1.info());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ���� ������? > ");
		String name = sc.nextLine();
		h1.setName(name);
		System.out.print("������ ���ΰ���?(��) > ");
		int price = sc.nextInt();
		sc.nextLine();
		h1.setPrice(price);
		System.out.print("������ ���ΰ���?(Kcal) > ");
		int calorie = sc.nextInt();
		sc.nextLine();
		h1.setCalorie(calorie);
		System.out.print("���Դ� ����?(g) > ");
		int gram = sc.nextInt();
		sc.nextLine();
		h1.setGram(gram);
		System.out.print("�Һ������ ������?(yyyyMMdd) > ");
		h1.setDate(sc.nextInt());
		sc.nextLine();
		// h1.setDeca(sc.nextBoolean()); <- ��������
		
		String info = h1.info();
		System.out.println("===============");
		System.out.println(info);
		System.out.println("===============");
		boolean exit = false;

		while(!exit) {
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
