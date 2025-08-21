package com.kh.variable;

public class Casting {
	
	/*
	 * Type Casting(자료형 변환) : 자료형을 바꾸는 개념. 자바에서 가장 중요한 개념 하나를 고르라고 하면 바로 "자료형"이다.
	 * 매우 중요하며 교육 과정 종료시까지 잊어버리면 큰일나는, 자바에서 값을 처리하는 규칙임.
	 * 
	 *  1. =(대입 연산자)를 기준으로 좌변/우변이 같은 자료형이어야 함.
	 *  -> 같은 자료형에 해당하는 값만 대입할 수 있음.
	 *  -> 자료형이 다를 경우, 값의 종류를 바꿔서 대입해야 한다.
	 *  
	 *  2. 같은 자료형들끼리만 연산이 가능하다.
	 *  -> 자료형이 다름에도 불구하고 연산이 하고싶다면, 역시 값의 종류를 바꿔서("형변환") 동일하게 맞춘 후 연산을 시행해야 한다.
	 *  
	 *  3. 연산의 결과물 역시 동일한 자료형이어야 한다.
	 *  
	 *  [표현법] (바꾸고 싶은 자료형) 값 - 형태로 쓰면 끝
	 *  형변환연산자(cast연산자)
	 *  
	 *  형변환의 종류
	 *  
	 *  1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨.
	 *  
	 *  작은 크기의 자료형에서 큰 크기의 자료형으로 변환하는 것은 자동으로 이루어짐
	 *  
	 *  2. 강제형변환(Type Casting) : 자동형변환이 이루어지지 않은 경우 진행함.
	 *  
	 *  
	 *  
	 */
	
	public void autoCasting() {
		
			
		// System.out.println("이 내용을 콘솔창에 출력해보세요 실습 시작!");
		
		//1. int(정수, 4Byte) -> double(실수, 8Byte)
		//변수 선언과 동시에 초기화
		
		int intNum = 148;
		System.out.println(intNum);
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		// 2. int(정수, 4Byte) -> long(8Byte, 정수)
		
		int bigInteger = 21904;
		long smallLong = bigInteger;
		System.out.println(smallLong);
		
		// 3. long(정수, 8Byte) -> float(실수, 4Byte) - 큰 사이즈가 작은 사이즈로 형변환함에도 불구하고 예외적으로 자동으로 해줌. 다만, 매우 큰 값이라 4Byte로 감당하기 힘든 수준의 정수라면 엉뚱한 값이 출력될 가능성이 높다.
		// 이유 - 4byte float 형이 long형보다 표현할 수 있는 값의 범위가 더 넓기 때문
		
		long longNumber = 21905L;
		// int num = longNumber; - 에러가 나는 게 정상
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		long longNumber2 = 2147483648L;
		float floatNumber2 = longNumber2;
		System.out.println(floatNumber2);
		
		// 4. char(2Byte) -> int(4Byte)
		
		char ch = 'o';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		char ch2 = 74;
		System.out.println(ch2);
		
		// ---------------------------
		
		System.out.println('3');
		System.out.println((char)3);
		System.out.println((char)'3' + (char)3); 		// 결과값이 54로 나오는 이유 : char 변수형을 아무리 써두더라도 + 연산을 시도하는 순간 정수로 파악하게 된다.
		
		// 번외, byte 또는 short형 간의 연산
		
		byte byteNum = (byte)148; 
		System.out.println(byteNum);
		byte b2 = 126;
		byte b3 = 3; 
		System.out.println(b2 + b3); // byte 형끼리 연산하였음에도 불구하고, 원래 연산장치가 값을 처리하는 크기가 int 형의 사이즈인 4Byte 이므로 결과값이 Byte형의 한계를 넘어서는 129가 나올 수 있음.
		
		
	}
	
	

}
