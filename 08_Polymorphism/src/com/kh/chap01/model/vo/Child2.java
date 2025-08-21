package com.kh.chap01.model.vo;

public class Child2 extends Parent{ // extends가 상속 명령어
	private int n;
	
	public Child2() {}
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n=n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void printChild2() {
		System.out.println("안녕 나는 자식클래스 Child2야.");
	}
	@Override
	public void print() {
		System.out.print("나는 자식2");
	}

}
