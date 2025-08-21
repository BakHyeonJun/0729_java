package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework4;

public class Run4 {

	public static void main(String[] args) {

		System.out.println("웹툰 알아보기");
		Scanner sc = new Scanner(System.in); 
		Homework4 h4 = new Homework4();
		System.out.print("웹툰 제목을 입력해주세요. > ");
		h4.title = sc.nextLine();
		System.out.print("작가명을 입력해주세요. > ");
		h4.writer = sc.nextLine();
		System.out.print("별점을 입력해주세요. > ");
		h4.score = sc.nextDouble();
		sc.nextLine();
		System.out.print("최근 업로드 일자를 입력해주세요. > ");
		h4.recent = sc.nextLine();
		System.out.print("다음 업로드 일자를 입력해주세요. > ");
		h4.next = sc.nextLine(); 
		
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h4.title + " 웹툰의 정보");
			System.out.println("작가명 : " + h4.writer);
			System.out.println("별점 : " + h4.score);
			System.out.println("최근 업로드 일자 : " + h4.recent);
			System.out.println("다음 업로드 일자 : " + h4.next);
			System.out.println("==========");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");

			System.out.print("1. 평점 분석 / 2. 프로그램 종료 > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h4.scoreCheck(); break;
			case 2 : exit = true; System.out.print("프로그램을 종료합니다."); break;
			default : System.out.println("유효하지 않은 입력입니다. 메뉴를 다시 선택해주세요.");
			}
		}
		
		
		
	}

}
