package com.kh.idol.view;

import java.util.Scanner;

import com.kh.idol.controller.IdolController;

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
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			default : System.out.println("�߸��� �Է��Դϴ�.");
			
			}
			
			private void infoMenu() {
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
				
			}
			
		}
		
	}
	
	
}
