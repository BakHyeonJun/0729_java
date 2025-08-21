package com.kh.chap03.model.vo;

/* 추상 메소드를 포함하려면 클래스도 추상 클래스가 되어야 한다.
 * 추상 클래스의 표현법
 * 접근제한자 abstract class 클래스식별자
 * 
 * 추상클래스 - 필드와 메소드, 추상메소드(생략가능)를 가질 수 있다.
 * -> 추상메소드 없어도 추상 클래스로 정의가 가능하다.
 * 
 * -> 개념적으로는 개발자가 판단했을 때 해당 클래스가 구체적으로 구현된 상태가 아닌 경우 추상클래스로 선언해둔다.
 * 
 * -> 객체 생성은 불가능하게 하면서 공통적인 속성 및 메소드 그리고 타입만 다형성을 적용하게 하려 한다면
 */


public abstract class Sports {

	private int players;
	
	public Sports() {}
	public Sports(int Players) {
		this.players = players;
	}
	
	public int getPlayers() {
		return players;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
		// 오버라이딩을 통해 다형성 개념 적용시켜 사용할 용도의 메소드
	public abstract void rule();
	//	System.out.println("스포츠의 규칙들");
	// 하지만 원래의 의도와 다르게 여기에 내용을 입력함으로써 실질적으로 내용을 수정할 수 있게 되어버리는 문제가 발생함.
	// 이런 경우 추상 메소드를 만들어줌으로써 문제를 방지할 수 있음.
	// 추상 메소드 표현법
	// 접근제한자 abstract 반환형 식별자(); <- 왼쪽과 같은 형태로 써주게 됨.
}
