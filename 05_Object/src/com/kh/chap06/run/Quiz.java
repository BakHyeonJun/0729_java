package com.kh.chap06.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 랜덤으로 정수 둘 띄우고 그 합을 얻어내기
		int cnt1 = 0;
		int cnt2 = 0;
		int boundary = 0;
		int quizCount = 0;
		
		
		while(true) {quizCount++;
			System.out.println("덧셈 퀴즈");
			System.out.println("난이도를 선택해주세요(상/ 중/ 하 / 나가기)");
			String level = sc.nextLine();
			
			if (level.equals("상")) { 
			System.out.println("난이도 상을 선택하셨습니다. 1~10000 사이의 범위로 출제됩니다.");
			boundary = 10000;
			}
			else if (level.equals("중")) { 
			System.out.println("난이도 중을 선택하셨습니다. 1 ~ 100 사이의 범위로 출제됩니다.");
			boundary = 100;
			}
			else if (level.equals("하")) { 
				System.out.println("난이도 하를 선택하셨습니다. 1 ~ 10 사이의 범위로 출제됩니다.");
				boundary = 10;
			}
			else if (level.equals("나가기")){ 
				System.out.println("덧셈 퀴즈를 종료합니다.");
				break;
			}
				
			else {System.out.println("부적절한 난이도 입력입니다. 다시 선택해주세요.");
			continue;
			}
			int firstNum = (int)(Math.random() * boundary + 1);
			int secondNum = (int)(Math.random() * boundary + 1);
			
			System.out.println(quizCount + "번 문제");
			System.out.println(firstNum + " + " + secondNum + " = ?");
			System.out.print("정답을 입력해주세요. > ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == firstNum + secondNum) {
				System.out.println("정답입니다.");
				cnt1++; 
				}
			else {
				System.out.println("오답입니다.");
				cnt2++; 
			}
			double rate = ((double)cnt1 / ((double)quizCount));
			System.out.println("정답횟수 : " + cnt1 + "번 / 오답횟수 : " + cnt2 + "번");
			System.out.println("정답률 : " + (((double)rate) * 100) + "%");
			System.out.println("");
		}
}
}