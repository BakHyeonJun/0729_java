package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Idol;

public class IdolView {

	// 필드부
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	
	//생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		
		
		// 메소드 하나당 기능 하나를 대응시키는 게 기본.
		System.out.println("\n\n aespa 커뮤니티에 오신 것을 환영합니다.");
		
		while(true) {
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("1.");
			System.out.println("2.");
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("메뉴 번호를 입력하세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : signUp(); break;
			case 3 : login(); break;
			case 4 : boardMenu(); break; // 원래대로라면 게시판 역할을 담당하는 board 역시 별도의 클래스에 들어가주어야 할 내용. (ex) BoardMenu 클래스를 별도로 두는 등)
			case 5 : break;
			default : System.out.println("잘못된 입력입니다.");
			
			}
			
			public void infoMenu() {
				System.out.println();
				System.out.println("정보보기 서비스입니다.");
				System.out.println("정보를 보기 원하시는 멤버를 선택해주세요.");
				System.out.println("1. 카리나");
				System.out.println("2. 지젤");
				System.out.println("3. 윈터");
				System.out.println("4. 닝닝");
				System.out.println("5. 모든 멤버");
				System.out.println("6. 메인메뉴로 돌아가기");
				System.out.println("이용하실 메뉴를 입력해주세요 > ");
				int menuNo = sc.nextInt();
				sc.nextLine();
				
				switch(menuNo) {
				case 1, 2, 3, 4 : findMember(); break;
				case 5 : findAll();
				case 6 : return;
				}
				
				private void findmember() {
					
				}
				private void findall() {
					List<Idol> aespa = ic.findall();
					
					if(!aespa.isEmpty()) {
						for(Idol i : aespa) {
							System.out.println("==================");
						}
						
						
					} else {
						System.out.println("에스파는 사라졌습니다.");
					}
					
				}
				if(loginFan != null) {
					
					SYstem.out.print("게시글 게목을 입력해주세요 > ")				};
					String boardTitle = sc
							
			}
			
		}
		
		private void selectBoardList() { 
			System.out.println();
			System.out.println("\n 전체 게시글 목록");
			System.out.println();
			
			List<Board> boardList = ic.selectBoardList();
			
			if(boardList.isEmpty()) {
				System.out.println("게시글이 아직 존재하지 않습니다.");
			} else {
				
				for(Board board : boardList) {
					System.out.print("글 번호 : " + board.getBoardNo() + "\t");
					System.out.print("글 제목 : " + board.getBoardTitle() + "\t");
					System.out.print("글 번호 : " + board.getUserId() + "\t");
					System.out.print("글 번호 : " + board.getCreateDate());
					System.out.println();
								
					
					
				}
				
				
			}
		
	}
	
	
}
