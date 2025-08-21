package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework3;

public class Run3 {

	public static void main(String[] args) {

		System.out.println("게임 알아보기");
		Scanner sc = new Scanner(System.in); 
		Homework3 h3 = new Homework3();
		System.out.print("게임 제목을 입력해주세요. > ");
		h3.title = sc.nextLine();
		System.out.print("플레이한 시간을 입력해주세요. (h) > ");
		h3.playTime = sc.nextInt();
		sc.nextLine();
		System.out.print("가격을 입력해주세요 > ");
		h3.price = sc.nextInt();
		sc.nextLine();
		System.out.print("개발사를 입력해주세요 > ");
		h3.develop = sc.nextLine();
		System.out.print("유통사를 입력해주세요.(분) > ");
		h3.publish = sc.nextLine(); 
		
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h3.title + " 게임의 정보");
			System.out.println("플레이한 시간 : " + h3.playTime + "시간");
			System.out.println("가격 : " + h3.price);
			System.out.println("개발사명 : " + h3.develop);
			System.out.println("유통사명 : " + h3.publish);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");

			System.out.print("1. 플레이시간 평가 / 2. 가격 평가 / 3. 프로그램 종료 > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h3.timeCheck(); break;
			case 2 : h3.priceCheck(); break;
			case 3 : exit = true; System.out.print("프로그램을 종료합니다."); break;
			default : System.out.println("유효하지 않은 입력입니다. 메뉴를 다시 선택해주세요.");
			}
		}

		
		
		
	}

}
