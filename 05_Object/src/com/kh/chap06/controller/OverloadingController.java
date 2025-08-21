package com.kh.chap06.controller;

public class OverloadingController {

	/*
	 * 메소드 오버로딩 - 면접에서의 단골 질문 요소. 중요!
	 * - 하나의 클레스 안에 동일한 메소드 식별자로 여러 개의 메소드들을 정의할 수 있는 기술.
	 * - 매개변수 자료형의 개수, 순서, 종류를 다르게 작성해야 한다.
	 * - 참고로 매개변수 식별자, 접근제한자, 반환형은 메소드 오버로딩에 아무런 영향을 끼치지 않는다.
	 * - 즉, 호출할 때의 명칭이 차별화가 가능한지 여부가 핵심.
	 * 
	 */
	
	// 메소드명은 test로 통일
	public void test() {
		 System.out.println("메소드 오버로딩 테스트 1");
	}
	public void test(int num) {
		 System.out.println("메소드 오버로딩 테스트 2");
	}
	public void test(String str) {
		 System.out.println("메소드 오버로딩 테스트 3");
	}
	public void test(int num1, int num2) {
		 System.out.println("메소드 오버로딩 테스트 4");
	}
	public void test(String str1, String str2) {
		 System.out.println("메소드 오버로딩 테스트 5");
	}
	public void test(int a, String b) {
		System.out.println("메소드 오버로딩 테스트 6");
	}
	public void test(String a, int b) {
		System.out.println("메소드 오버로딩 테스트 7");
	}
}
