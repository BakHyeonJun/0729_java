package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Idol;

public class IdolView {

	// �ʵ��
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	
	//������
	
	// �޼ҵ��
	// ���α׷��� �������� �� ���� ���� ������ ȭ���� ������ִ� ���
	public void mainMenu() {
		
		
		// �޼ҵ� �ϳ��� ��� �ϳ��� ������Ű�� �� �⺻.
		System.out.println("\n\n aespa Ŀ�´�Ƽ�� ���� ���� ȯ���մϴ�.");
		
		while(true) {
			System.out.println("�̿��Ͻ� ���񽺸� �������ּ���.");
			System.out.println("1.");
			System.out.println("2.");
			System.out.println("�̿��Ͻ� ���񽺸� �������ּ���.");
			System.out.println("�̿��Ͻ� ���񽺸� �������ּ���.");
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : signUp(); break;
			case 3 : login(); break;
			case 4 : boardMenu(); break; // ������ζ�� �Խ��� ������ ����ϴ� board ���� ������ Ŭ������ ���־�� �� ����. (ex) BoardMenu Ŭ������ ������ �δ� ��)
			case 5 : break;
			default : System.out.println("�߸��� �Է��Դϴ�.");
			
			}
			
			public void infoMenu() {
				System.out.println();
				System.out.println("�������� �����Դϴ�.");
				System.out.println("������ ���� ���Ͻô� ����� �������ּ���.");
				System.out.println("1. ī����");
				System.out.println("2. ����");
				System.out.println("3. ����");
				System.out.println("4. �״�");
				System.out.println("5. ��� ���");
				System.out.println("6. ���θ޴��� ���ư���");
				System.out.println("�̿��Ͻ� �޴��� �Է����ּ��� > ");
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
						System.out.println("�����Ĵ� ��������ϴ�.");
					}
					
				}
				if(loginFan != null) {
					
					SYstem.out.print("�Խñ� �Ը��� �Է����ּ��� > ")				};
					String boardTitle = sc
							
			}
			
		}
		
		private void selectBoardList() { 
			System.out.println();
			System.out.println("\n ��ü �Խñ� ���");
			System.out.println();
			
			List<Board> boardList = ic.selectBoardList();
			
			if(boardList.isEmpty()) {
				System.out.println("�Խñ��� ���� �������� �ʽ��ϴ�.");
			} else {
				
				for(Board board : boardList) {
					System.out.print("�� ��ȣ : " + board.getBoardNo() + "\t");
					System.out.print("�� ���� : " + board.getBoardTitle() + "\t");
					System.out.print("�� ��ȣ : " + board.getUserId() + "\t");
					System.out.print("�� ��ȣ : " + board.getCreateDate());
					System.out.println();
								
					
					
				}
				
				
			}
		
	}
	
	
}
