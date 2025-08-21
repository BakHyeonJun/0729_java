package com.kh.chap06.controller;

public class MethodController {

	
	
	/*
	 * �޼ҵ�(Method) - Ŭ������ ������ �ִ� ��� == ��� �Լ� : �Է°��� ������ Ư�� ������ ������ �� ������� �����´�.
	 * 
	 * ���α׷��� ������ �Լ� : Ư�� �۾��� �����ϱ� ���ؼ� ������� �ڵ� ���
	 * 1. ���뼺
	 * 2. ���ȭ
	 * ��ü���� ���α׷��ֿ����� �޼ҵ�� - ��ü�� ������ �� �ִ� �ൿ�� ������ �ڵ� ����� �ǹ���.
	 * �ᱹ �޼ҵ�� Ư�� �ڷ��������� ����� ������ �Լ��� �ǹ��Ѵ�.
	 * 
	 * 
	 */
	
	// ������ �����Ͽ� ����� ��ȯ���ִ� �ڵ� ���� ������� �Ѵ�.
	public int add(int a, int b) { // �� �࿡ ���� ������� �޼ҵ� �ñ״�ó��� �θ�. �޼ҵ��� ��ȣ�� �ִ� �κ��̹Ƿ�
		int sum = a + b; // ���� ���빰�� �޼ҵ� �ٵ��� ��. �ش� �޼ҵ忡�� ������ �������� �۾� �����̹Ƿ�
		return sum; // ��ȯ���̶�� ��. �޼ҵ��� �۾� ������ ���� ��ȯ�� ���̹Ƿ�
			
		
	}
	
	public void method1() { // <- ��ȯ���� ��ó�� void�� ��쿡�� return ��ɾ ������ �� �ִ�.
		System.out.println("�Ű������� ��ȯ�� ��� �������� �ʽ��ϴ�.");
	}
	
	public String method2() {
		System.out.println("�Ű������� �������� ������ ��ȯ���� �����մϴ�.");
		return "returnValue";
	}
	public String method3() {
		return method2();
	}
	public void println(String parameter) {
		System.out.println(parameter);
	}
	
	// �Ű������� ���������� ��ȯ���� �������� �ʴ� �޼ҵ�
	// public void setName(String name) {}
	
	public void method4(int num) {
		System.out.println("�Ű������� �����ϰ� ��ȯ���� �������� �ʽ��ϴ�.");
		System.out.println("���� ���� �� + 100 : " + (num + 100));
	}
	
	// �Ű������� �����ϰ� ��ȯ���� �����ϴ� �޼ҵ�
	public int method5(int num) {
		System.out.println("�Ű������� �ְ� ��ȯ���� �ֽ��ϴ�.");
		return num + 100;
	}
	/*
	 *
		System.out.println("�޼ҵ� a ȣ��");
		b();
	}
	public void b() {
		System.out.println("�޼ҵ� b ȣ��");
		a();
	}
	*/
	  // ���� ���� ���� ȣ���� �ݺ��ϰ� �ǰų� ���ȣ��(�����θ� �θ���) ���°� ������ �� ��� �ݺ��۾��� �̷������ �ǹǷ� stack�� overflow ������ �߻��ϰ� �ȴ�.
	 
	public void test(MethodController mc) {
		mc.method1();
	}
	
	public static void staticMethod() { // static Ű������ �ǹ� - ������ ����. Math.random �̳� Arrays.toString���� ��ɾ���� �� ���(���� ��ü �������� �ʰ� �޼ҵ� ȣ���� �����ϴ�)
		System.out.println("���� ����ƽ �޼ҵ�");
	}
	
	public void haha(int num) {
		
	}
}
