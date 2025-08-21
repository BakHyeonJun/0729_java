package com.kh.chap06.run;

import java.util.Arrays;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		/*MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(1, 2);
		int c = mc.add(1, 2);
		int d = mc.add(1, 2);
		int e = mc.add(1, 2);
		*/
		MethodController mc = new MethodController();
		
		mc.println("method3 ȣ�� ��� : " + mc.method3());
		
		mc.method4(10);
		int result = mc.method5(100);
		System.out.println(result);
		mc.test(mc); // �߿� : "���� ����"�� �ش��Ѵ�. - �ּҰ��� �����ϴ� ���̰� �̴� ������ �ּҰ��� ����Ű���� �ϴ� ���̹Ƿ�.
		
		
		Math.random();
		int[] arr = {2, 3};
		System.out.println(Arrays.toString(arr));
		MethodController.staticMethod();
		// mc.haha(10);
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("���?");
		System.out.println(mc);
		System.out.println();
	
		OverloadingController oc = new OverloadingController(); 
		
		// ���� ���ε�(Static Binding)�̶�?
		// �������� ���� ������ � �޼ҵ尡 ȣ����� �����ϴ� ��.
		// �����Ϸ��� �˾Ƽ� �ڵ带 �м��Ͽ� �޼ҵ� ȣ���� ������.
		
		
		oc.test();
		oc.test(10); // <- ���� ���ִ� 10�� ��� ����ο����� �Ű������� �ش��ϳ�, �޼ҵ� ȣ��ο����� ���ڰ�(arguements)�̶�� ǥ���Ѵ�.
		oc.test("t");
		oc.test(10, 20);
		oc.test("t", "e");
		oc.test(10, "t");
		oc.test("t", 10);
		
	}

}
