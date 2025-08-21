package homework.date0806.run;

import java.util.Scanner;

import homework.date0806.voHW.Homework2;

public class Run2 {

	public static void main(String[] args) {
		System.out.println("노래 알아보기");
		Scanner sc = new Scanner(System.in); 
		Homework2 h2 = new Homework2();
		System.out.print("노래 제목을 입력해주세요. > ");
		h2.title = sc.nextLine();
		System.out.print("작곡가를 입력해주세요 > ");
		h2.writer = sc.nextLine();
		System.out.print("작사가를 입력해주세요 > ");
		h2.lyricist = sc.nextLine();
		System.out.print("가수를 입력해주세요 > ");
		h2.singer = sc.nextLine();
		System.out.print("연주시간을 입력해주세요.(분) > ");
		h2.minute = sc.nextInt(); 
		System.out.print("연주시간을 입력해주세요.(초) > ");
		h2.second = sc.nextInt();
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("==========");
			System.out.println(h2.title + " 노래의 정보");
			System.out.println("작곡가명 : " + h2.writer);
			System.out.println("작사가명 : " + h2.lyricist);
			System.out.println("가수명 : " + h2.singer);
			System.out.println("연주시간 : " + h2.minute + "분 " + h2.second + "초");
			System.out.println("==========");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");

			System.out.print("1. 연주시간 분석 / 2. 프로그램 종료 > ") ;
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : h2.lengthCheck(); break;
			case 2 : exit = true; System.out.print("프로그램을 종료합니다."); break;
			default : System.out.println("유효하지 않은 입력입니다. 메뉴를 다시 선택해주세요.");
			}
		}
	}

}
