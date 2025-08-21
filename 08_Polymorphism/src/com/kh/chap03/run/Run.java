package com.kh.chap03.run;

import com.kh.chap03.model.vo.Baseball;
import com.kh.chap03.model.vo.Soccer;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {

		Soccer s = new Soccer();
		s.rule();
		Baseball b = new Baseball();
		b.rule();
		
		/* Sports os = new Sports();
		os.rule();
		 추상 클래스로 선언되면 객체 생성이 불가능해짐.
		 */
		// 다형성 개념은 적용가능.
		
		// Sports[] = 
		
	}

}
