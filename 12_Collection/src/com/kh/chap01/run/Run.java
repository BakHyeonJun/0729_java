package com.kh.chap01.run;

import com.kh.chap01.collection.Integers;

public class Run {

	public static void main(String[] args) {

		// ���� ���� ���� �� �ٷ�� ���� ��Ȳ. ��Ȯ�� �� ���� �ٷ�� ���� �� �� ����.
		
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
