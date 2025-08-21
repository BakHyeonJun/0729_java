package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	public static void main(String[] args) {
	
		/*
		 * 객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(개체)를 속성과 행위를 가진 객체로 만들어서 객체간의 상호작용을 통해 프로그래밍하는 기법. 즉 컴퓨터의 연산 방식이 아닌 사람이 생각하는 방식에 가깝게 프로그래밍을 하는 것.
		 * 
		 * 구현하고자 하는 프로그램에 객체를 만들기 위해서는 (생성하기 위해서는) -> 클래스를 먼저 생성해야 함.
		 * 
		 * 클래스란? 각 객체들의 정보(속성, 행위)들을 담아내는 그릇, 틀, 설계도, 명세. 즉, 개발자가 만드는 사용자 정의 자료형.
		 * 
		 * 클래스 : VO(Value Object)
		 * 
		 * 오늘의 과제 - 현실에 존재하는 개인적인 요소에 대해서 VO 클래스를 만들고 생성한 객체를 관리할 수 있는 프로그램을 작성할 것. (PuppyCareRun 클래스 참고)
		 * 개수 ) VO 클래스 5개 + VO 관리프로그램 5개(즉, 최소 10개의 클래스 필요)
		 * 각 VO클래스의 최소 필드 수 5개
		 * 
		 * 제출할 곳 : 우리반게시판 게시글 작성 - 과제 탭
		 * 제한시간 : 2025 / 08 / 07  07:59
		 * 게시글 제목 : "이름" + "VO 클래스 만들기"
		 * 
		 * + 메모리구조 그리기(이건 1개만)
		 * 
		 */
		
		/* 자바에서의 class는 생물학적 분류에서의 '강'에 해당하는 의미로 쓰임.
		 * ex) 특정한 강아지의 정보들 중 필요로 하는 것을 추상화하여 가져올 예정
		 * 
		 * 종 - 포메라니안
		 * 이름 - 똘똘이
		 * 나이 - 4
		 * 성별 - 암컷
		 * 색상 - 갈색
		 * 몸무게 - 3k
		 * 		
		 */
		// 객체를 생성하려면 이하와 같이 한다.
		Puppy smart = new Puppy(); // 여태 해온 것. new라는 예약어 사용
	//  자료형
		
		// smart.sniff();
		
		// System.out.println(smart);  
		
		// System.out.println(smart.name); - 그냥 이 코드만 입력하면 당연히 null값이 출력 
		
		smart.name = "똘똘이";
		// System.out.println(smart.name);
		smart.species = "포메라니안";
		smart.age = 4;
		smart.gender = "암컷";
		smart.color = "갈색";
		smart.weight = 3;
		System.out.println(smart.name + "는 " + smart.color + " " + smart.species + "입니다.");
		System.out.println(smart.age + "살 " + smart.gender + "이고 " + smart.weight + "kg입니다.");
		
		// 1 more
		
		Puppy soldier = new Puppy();
		
		soldier.name = "상근이";
		soldier.age = 22;
		soldier.species = "그레이트 피레니즈";
		soldier.gender = "수컷";
		soldier.color = "흰색";
		soldier.weight = 60;
		System.out.println(soldier.name + "이는 " + soldier.color + " " + soldier.species + "입니다.");
		System.out.println(soldier.age + "살 " + soldier.gender + "이고 " + soldier.weight + "kg입니다."); 
		
		System.out.println("==========");
		smart.sniff();
		soldier.sniff();
		System.out.println("짖기 전 상근이 몸무게 : ");
		System.out.println(soldier.weight + "kg");
		
		soldier.bark();
		soldier.bark();
		soldier.bark();
		
		System.out.println("짖고 난 후 : ");
		System.out.println(soldier.weight + "kg");
		
	}
	
	// public static void main(String[] args) { -> 직접 입력할 필요 없이 main 정도까지 누른 후 컨트롤 스페이스 단축키로 손쉽게 불러올 수 있음 
		
//}
}
