package com.kh.chap06.controller;

public class OverloadingController {

	/*
	 * �޼ҵ� �����ε� - ���������� �ܰ� ���� ���. �߿�!
	 * - �ϳ��� Ŭ���� �ȿ� ������ �޼ҵ� �ĺ��ڷ� ���� ���� �޼ҵ���� ������ �� �ִ� ���.
	 * - �Ű����� �ڷ����� ����, ����, ������ �ٸ��� �ۼ��ؾ� �Ѵ�.
	 * - ����� �Ű����� �ĺ���, ����������, ��ȯ���� �޼ҵ� �����ε��� �ƹ��� ������ ��ġ�� �ʴ´�.
	 * - ��, ȣ���� ���� ��Ī�� ����ȭ�� �������� ���ΰ� �ٽ�.
	 * 
	 */
	
	// �޼ҵ���� test�� ����
	public void test() {
		 System.out.println("�޼ҵ� �����ε� �׽�Ʈ 1");
	}
	public void test(int num) {
		 System.out.println("�޼ҵ� �����ε� �׽�Ʈ 2");
	}
	public void test(String str) {
		 System.out.println("�޼ҵ� �����ε� �׽�Ʈ 3");
	}
	public void test(int num1, int num2) {
		 System.out.println("�޼ҵ� �����ε� �׽�Ʈ 4");
	}
	public void test(String str1, String str2) {
		 System.out.println("�޼ҵ� �����ε� �׽�Ʈ 5");
	}
	public void test(int a, String b) {
		System.out.println("�޼ҵ� �����ε� �׽�Ʈ 6");
	}
	public void test(String a, int b) {
		System.out.println("�޼ҵ� �����ε� �׽�Ʈ 7");
	}
}
