package com.kh.chap01.model.vo;

public class Child1 extends Parent{
	
	// 필드부
	// int x, int y - 기본적으로 상속이 이루어지는 변수이므로 굳이 필요하지 않음.
	
	private int z;
	
	// 생성자부
	public Child1() {
	}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 메소드부
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void printChild1() {
		System.out.println("안녕 나는 첫 번째 자식 클래스 Child1 이야.");
	}
	@Override
	public void print() {
		System.out.print("나는 자식1");
	}
	
}
