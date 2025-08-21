package com.kh.chap06.controller;

public class MethodController {

	
	
	/*
	 * 메소드(Method) - 클래스가 가지고 있는 기능 == 멤버 함수 : 입력값을 가지고 특정 동작을 수행한 뒤 결과물을 내놓는다.
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블록
	 * 1. 재사용성
	 * 2. 모듈화
	 * 객체지향 프로그래밍에서의 메소드란 - 객체가 수행할 수 있는 행동을 정의한 코드 블록을 의미함.
	 * 결국 메소드는 특정 자료형에서만 사용이 가능한 함수를 의미한다.
	 * 
	 * 
	 */
	
	// 덧셈을 시행하여 결과를 반환해주는 코드 블럭을 만들고자 한다.
	public int add(int a, int b) { // 이 행에 들어가는 내용들을 메소드 시그니처라고 부름. 메소드라는 신호를 주는 부분이므로
		int sum = a + b; // 안의 내용물은 메소드 바디라고 함. 해당 메소드에서 수행할 실질적인 작업 내용이므로
		return sum; // 반환값이라고 함. 메소드의 작업 수행을 통해 반환된 값이므로
			
		
	}
	
	public void method1() { // <- 반환값이 이처럼 void일 경우에만 return 명령어를 생략할 수 있다.
		System.out.println("매개변수와 반환값 모두 존재하지 않습니다.");
	}
	
	public String method2() {
		System.out.println("매개변수는 존재하지 않지만 반환값은 존재합니다.");
		return "returnValue";
	}
	public String method3() {
		return method2();
	}
	public void println(String parameter) {
		System.out.println(parameter);
	}
	
	// 매개변수는 존재하지만 반환값은 존재하지 않는 메소드
	// public void setName(String name) {}
	
	public void method4(int num) {
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달 받은 값 + 100 : " + (num + 100));
	}
	
	// 매개변수도 존재하고 반환값도 존재하는 메소드
	public int method5(int num) {
		System.out.println("매개변수도 있고 반환값도 있습니다.");
		return num + 100;
	}
	/*
	 *
		System.out.println("메소드 a 호출");
		b();
	}
	public void b() {
		System.out.println("메소드 b 호출");
		a();
	}
	*/
	  // 위와 같이 서로 호출을 반복하게 되거나 재귀호출(스스로를 부르는) 형태가 나오게 될 경우 반복작업이 이루어지게 되므로 stack의 overflow 에러가 발생하게 된다.
	 
	public void test(MethodController mc) {
		mc.method1();
	}
	
	public static void staticMethod() { // static 키워드의 의미 - 공유의 목적. Math.random 이나 Arrays.toString같은 명령어들이 그 사례(굳이 객체 생성하지 않고도 메소드 호출이 가능하다)
		System.out.println("나는 스태틱 메소드");
	}
	
	public void haha(int num) {
		
	}
}
