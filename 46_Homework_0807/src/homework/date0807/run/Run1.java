package homework.date0807.run;

import java.util.Scanner;

import homework.date0807.capHW.Homework1;

public class Run1 {

	public static void main(String[] args) {

		
		Homework1 h1 = new Homework1();
		
		System.out.println(h1.info());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명이 뭔가요? > ");
		String name = sc.nextLine();
		h1.setName(name);
		System.out.print("가격은 얼마인가요?(원) > ");
		int price = sc.nextInt();
		sc.nextLine();
		h1.setPrice(price);
		System.out.print("열량은 얼마인가요?(Kcal) > ");
		int calorie = sc.nextInt();
		sc.nextLine();
		h1.setCalorie(calorie);
		System.out.print("무게는 얼마죠?(g) > ");
		int gram = sc.nextInt();
		sc.nextLine();
		h1.setGram(gram);
		System.out.print("소비기한은 언제죠?(yyyyMMdd) > ");
		h1.setDate(sc.nextInt());
		sc.nextLine();
		// h1.setDeca(sc.nextBoolean()); <- 마찬가지
		
		String info = h1.info();
		System.out.println("===============");
		System.out.println(info);
		System.out.println("===============");
		boolean exit = false;

		while(!exit) {
			System.out.print("1. 소비기한 점검 / 2. 열량 분석 / 3. 프로그램 종료 > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h1.dateCheck(); break;
			case 2 : h1.calCheck(); break;
			case 3 : exit = true; System.out.print("프로그램을 종료합니다."); break;
			default : System.out.println("유효하지 않은 입력입니다. 메뉴를 다시 선택해주세요.");
			}
		
		
	}
	}
}
