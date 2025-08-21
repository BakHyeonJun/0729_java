package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;
import com.kh.chap07.remote.model.vo.AirConditioner;

// 사용자로부터 값을 입력받고 내용을 출력해주는 메소드를 넣어둘 클래스
public class RemoteView {
	private Scanner sc = new Scanner(System.in);
	private RemoteController rc = new RemoteController();
	

	// 프로그램 시작시 보일 메인메뉴를 출력하는 메소드
	public void mainMenu() {

		while (true) {
			System.out.println("리모컨 조작 프로그램입니다.");
			System.out.println("이용하실 메뉴를 선택해주세요.");
			System.out.println("1. 전원 on/off");
			System.out.println("2. 온도 ↑");
			System.out.println("3. 온도 ↓");
			System.out.println("4. 풍향 ↑");
			System.out.println("5. 풍향 ↓");
			System.out.println("6. 풍향 ←");
			System.out.println("7. 풍향 →");
			System.out.println("8. 예약");
			System.out.println("9. 리모컨 종료");
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
				System.out.println("리모컨을 종료합니다.");
				return;
			default:
				System.out.println("부적절한 입력입니다.");

			}
		}
	}

	private void cenUp() {
		if (rc.power()) {
			rc.cenUp();
		} else {
			System.out.println("전원이 꺼진 상태입니다.");
		}
	}

	private void cenDown() {
		if (rc.power()) {
			rc.cenDown();
		} else {
			System.out.println("전원이 꺼진 상태입니다.");
		}
	}

}
