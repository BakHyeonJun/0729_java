package com.kh.run;

import com.kh.variable. Casting;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.A_Variable;

public class Run {
	
	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드를 호출하고 싶을 경우, 클래스도 "생성"해야 함.
		
		// "클래스이름" "클래스 별칭" = new "클래스이름"();
		
				
		//com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		
		//a.findSeasonMenu();
		
		A_Variable a = new A_Variable();
		
		//a.declareVariable();
		
		//com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput(); - 이와 같은 효과를 내려면 위(제4행에 있는)의 import를 활용할 수도 있음.
		
		B_KeyboardInput b = new B_KeyboardInput(); 
		//b.inputTest();
		
		Casting c = new Casting(); 
		c.autoCasting();
		
	}
	

}
