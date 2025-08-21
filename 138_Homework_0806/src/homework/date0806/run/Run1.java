package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework1;

public class Run1 {

	public static void main(String[] args) {
				
		System.out.println("상품 분석하기");
		Scanner sc = new Scanner(System.in); // 좌항 - 스캐너 타입의 변수 선언. 우항 - 스캐너 객체 생성
		Homework1 h1 = new Homework1();
		System.out.print("상품의 이름을 입력해주세요. > ");
		h1.name = sc.nextLine();
		System.out.print("상품의 가격을 입력해주세요.(원) > ");
		h1.price = sc.nextInt();
		sc.nextLine();
		System.out.print("상품의 열량을 입력해주세요.(Kcal) > ");
		h1.calorie = sc.nextInt();
		sc.nextLine(); 
		System.out.print("상품의 중량을 입력해주세요.(g/mL) > ");
		h1.gram = sc.nextInt();
		sc.nextLine(); 
		System.out.print("상품의 소비기한을 입력해주세요. (yyyymmdd) > ");
		h1.date = sc.nextInt();
		sc.nextLine();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h1.name + " 제품의 정보!");
			System.out.println("가격 : " + h1.price + " 원");
			System.out.println("열량 : " + h1.calorie + "Kcal");
			System.out.println("중량 : " + h1.gram + "gram");
			System.out.println("소비기한 : " + h1.date);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");

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
