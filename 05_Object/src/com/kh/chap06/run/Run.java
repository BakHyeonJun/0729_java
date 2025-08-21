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
		
		mc.println("method3 호출 결과 : " + mc.method3());
		
		mc.method4(10);
		int result = mc.method5(100);
		System.out.println(result);
		mc.test(mc); // 중요 : "얕은 복사"에 해당한다. - 주소값을 대입하는 것이고 이는 동일한 주소값을 가리키도록 하는 것이므로.
		
		
		Math.random();
		int[] arr = {2, 3};
		System.out.println(Arrays.toString(arr));
		MethodController.staticMethod();
		// mc.haha(10);
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라?");
		System.out.println(mc);
		System.out.println();
	
		OverloadingController oc = new OverloadingController(); 
		
		// 정적 바인딩(Static Binding)이란?
		// 컴파일이 끝난 시점에 어떤 메소드가 호출딜지 결정하는 것.
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출을 연결함.
		
		
		oc.test();
		oc.test(10); // <- 여기 들어가있는 10의 경우 선언부에서는 매개변수에 해당하나, 메소드 호출부에서는 인자값(arguements)이라고 표현한다.
		oc.test("t");
		oc.test(10, 20);
		oc.test("t", "e");
		oc.test(10, "t");
		oc.test("t", 10);
		
	}

}
