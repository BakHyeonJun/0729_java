package com.kh.chap01.model.vo;

public class Child2 extends Parent{ // extends�� ��� ��ɾ�
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
		System.out.println("�ȳ� ���� �ڽ�Ŭ���� Child2��.");
	}
	@Override
	public void print() {
		System.out.print("���� �ڽ�2");
	}

}
