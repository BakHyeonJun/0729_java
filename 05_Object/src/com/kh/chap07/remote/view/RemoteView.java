package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;
import com.kh.chap07.remote.model.vo.AirConditioner;

// ����ڷκ��� ���� �Է¹ް� ������ ������ִ� �޼ҵ带 �־�� Ŭ����
public class RemoteView {
	private Scanner sc = new Scanner(System.in);
	private RemoteController rc = new RemoteController();
	

	// ���α׷� ���۽� ���� ���θ޴��� ����ϴ� �޼ҵ�
	public void mainMenu() {

		while (true) {
			System.out.println("������ ���� ���α׷��Դϴ�.");
			System.out.println("�̿��Ͻ� �޴��� �������ּ���.");
			System.out.println("1. ���� on/off");
			System.out.println("2. �µ� ��");
			System.out.println("3. �µ� ��");
			System.out.println("4. ǳ�� ��");
			System.out.println("5. ǳ�� ��");
			System.out.println("6. ǳ�� ��");
			System.out.println("7. ǳ�� ��");
			System.out.println("8. ����");
			System.out.println("9. ������ ����");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				rc.power();
				break;
			case 2:
				rc.cenUp();
				break;
			case 3:
				cenDown();
				break;
			case 4: // dirUp(); break;
			case 5: // dirDown(); break;
			case 6: // dirLeft(); break;
			case 7: // dirRight(); break;
			case 8: // reservation(); break;
			case 9:
				System.out.println("�������� �����մϴ�.");
				return;
			default:
				System.out.println("�������� �Է��Դϴ�.");

			}
		}
	}

	private void cenUp() {
		if (rc.power()) {
			rc.cenUp();
		} else {
			System.out.println("������ ���� �����Դϴ�.");
		}
	}

	private void cenDown() {
		if (rc.power()) {
			rc.cenDown();
		} else {
			System.out.println("������ ���� �����Դϴ�.");
		}
	}

}
