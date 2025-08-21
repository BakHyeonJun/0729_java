package com.kh.chap01.run;

import com.kh.chap01.collection.Integers;

public class Run {

	public static void main(String[] args) {

		// 정수 값을 여러 개 다루고 싶은 상황. 정확히 몇 개를 다루게 될지 알 수 없다.
		
		/*int[] integers = new int[3];
		integers[0] = 6;
		integers[1] = 3;
		integers[2] = 7;
		*/
		Integers integers = new Integers();
		integers.add(9);
		integers.add(63);
		integers.add(21);
		integers.add(21);
		
		
		int element = integers.get(3);
		integers.get(9);
		System.out.println(element);
		
		System.out.println(integers);
		
	}

}
