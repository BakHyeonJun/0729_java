package com.kh.variable;

public class A_Variable {

	
	// 변수 : Memory(RAM)에 값을 저장하기 위한 공간
	
	// 변수를 사용하면 뭐가 좋을까?
	
	// ex) 키오스크 
	
	public void findSeasonMenu() {
		
		// 가정상황 1. 시즌 메뉴들을 출력(메뉴명과 가격)
		// 가정상황 2. 사용자가 메뉴판을 보고 주문을 했다.
		// 3. 고객이 구매한 메뉴의 가격을 출력할 예정
		
		System.out.println("---변수를 사용하기 전---");
		System.out.println("시즌 메뉴:" );
		// System.out.println("1.수박주스(5600)");
		System.out.println("1.한교동 갈릭쉬림프 프레첼(1400)");
		System.out.println("2.토차코 요거젤러 소다 플랫치노(3500)");
		System.out.println("3.케로케로케로피 멜론라떼(4200)");
		
		
		// 가정 - 수박주스를 35잔, 케로케로케로피 멜론라떼 20잔 시킴
		
		System.out.println("한교동 갈릭쉬림프 프레첼을 21개 시키셨습니다");
		System.out.print(1400*21);
		System.out.println("원 입니다");
		
		//자바에서 문자열 값과 다른 형태의 값을 붙여서 사용하고 싶은 경우 + 기호를 사용할 수 있다.
		
		System.out.println(5600*35 + "원 입니다");
		
		//출력문을 두 번 작성하여 다음과 같이 출력하시오.  ↓
		//케로케로케로피 멜론라떼 20잔 시키셨습니다. 84000원 입니다.
		
		System.out.print("케로케로케로피 멜론라떼 20잔 시키셨습니다.");
		System.out.println((4200*20) + "원 입니다.");
		
		//출력문을 한 번 작성하여 위와 같이 출력하시오.
		
		System.out.println("케로케로케로피 멜론라떼 20잔 시키셨습니다." + (4200*20) + "원 입니다.");
		
		System.out.println("==============");
		System.out.println("변수를 사용해 봅시다!");
		System.out.println("시즌 메뉴 : ");
		
		// 메뉴명과 가격이라는 값을 담을 공간
		// 즉, 변수를 선언하고 변수공간에 값을 대입해서 사용
		
		
		// 대입연산자(=)를 기준으로 좌변은 항상 공간, 우변은 항상 값을 의미함.
		
		String seasonMenu = "KH정보교육원 A강의장에서 만든 딸기라떼 ";
		int price = 5600;
		
		System.out.println("메뉴명 : " + seasonMenu);
		System.out.println("가격 : " + price);
		
		System.out.println(seasonMenu + "14잔 주문하셨습니다.");
		System.out.println((price*14) + "원 입니다.");

		
		/* 변수를 사용하면
		 * 1. 단 한 번 값을 대입하여 필요한 순간마다 다시 사용할 수 있음. 재사용이 옹이함.
		 * 2. 값에 의미 부여할 수 있다. - 코드가 길어질수록 가독성이 좋아짐.
		 * 
		 *  가독성과 재사용성이 높아지면 유지보수가 쉬워진다.
		 */

		
	}
	
	// 변수 선언 방법에 대해 알아보자.
	public void declareVariable() {
		
		/*
		 * 변수 선언 방법
		 * 
		 * int price;
		 * 
		 * "자료형" "변수 식별자"
		 * 권장하는 방법은아니지만 동일한 타입의 변수를 선언할 때는 한 번에 선언 가능하다
		 * int a, b, c; - 권장하지 않음.
		 * 변수를 선언하고 난 뒤 처음 값(초기값)을 대입하는 것을 초기화(Initialization)라고 함. - 이걸 하지 않으면 사용을 할 수 없음.
		 * 
		 * 
		 */
		
		// system.out.println(price);
		// 변수는 자신이 선언된 scope 에서만 사용할 수 있음
		// local variable(지역 변수)
		
		
		/*
		 *  식별자 -   클래스명, 메소드명, 변수명 등등 개발자가 만들어서 사용하는 고유의 이름
		 *  
		 *  
		 *  식별자를 생성할 때 꼭 지켜야 하는 규칙(안 지키면 안 만들어짐)
		 *  
		 *  1. 키워드(예약어)는 식별자로 사용할 수 없음.
		 *  2. 공백은 포함할 수 없음
		 *  3. 대, 소문자를 구분하고 길이 제한은 없음.
		 *  4. 문자, 숫자, _, 프$를 포함할 수 있다. - 단 숫자로 시작하는 것은 불가능.
		 *  
		 *  절대적 불가사항은 아니나 개발자들끼리의 암묵적인 약속.
		 *  
		 *  1. 클래스 / 인터페이스 명명 규칙
		 *  
		 *  첫 글자는 대문자로 표기(연결된 단어들의 첫 글자도 대문자로 표기)
		 *  명사, 형용사를 서술적으로 연결해서 사용.
		 *  
		 *  
		 *  -> WelcomeToJavaWorld
		 *  
		 *  2. 변수 명명 규칙
		 *  - 명사적 의미를 갖게 만들어 줌
		 *  - 클래스와의 차별화를 위해 첫 글자는 소문자로, 연결된 단어들의 첫 글자는 대문자로 표기
		 *  
		 *  -> phoneNumber
		 *  
		 *  3. 메소드 명명 규칙
		 *  
		 *  - 동사적 의미를 갖게 만들어 줌(명령어 느낌)
		 *  - 첫 글자는 소문자로, 연결된 단어들의 첫 글자는 대문자로 표기 
		 *  - 메소드 식별자의 경우 식별자 뒤에 반드시 한 쌍의 소괄호 ()를 붙임
		 *  - 메소드에는 일반적으로 _를 사용하지 않음.
		 *  -> join(), signUp()
		 *  
		 *  4. 상수 명명 규칙
		 *  - 모든 문자를 대문자로 표기
		 *  - 단어와 단어 사이는 _를 사용해서 구분한다.
		 *  -> LOGIN_OK
		 *  
		 *  
		 */
		
		// 변수의 자료형
		// Java의 기본자료형, 원시자료형
		// PrimitiveType
		
		/* 1. 논리자료형(논리 값 : true/false)
		 *  - 자료형 변수식별자;
		 *   
		 * 
		 */
		
		boolean isTrue;  //변수 선언
		//System.out.println(istrue); - 앞서 나온 바와 같이 초기화(Initialized - 초기값 입력)하지 않으면 사용할 수 없음.
		
		isTrue = true; //초기화
		System.out.println(isTrue);
		isTrue = false; //대입
		System.out.println(isTrue);
		
		
		/*
		 * 2. 숫자 자료형
		 * 
		 * 정수형 (4가지 자료형이 존재함) - byte, short, int, long 
		 * int형을 주로 쓰게 됨.
		 * long형을 사용할 경우 구별을 위해 대입할 숫자 뒤에 대문자 L을 붙임.
		 * 
		 * 실수형 (2가지 자료형이 존재함) - float, double
		 * float형을 사용할 경우 구별을 위해 대입할 숫자 뒤에 대문자 F를 붙임.
		 */
		
		byte byteNumber = -128;		// 1Byte
		short shortNumber = -32768;		// 2Byte  
		int intNumber = -2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2;			// 4Byte
		long longNumber = -2147483648L*2147483648L*2L;		// 8Byte
		
		float floatNumber = 2.22F;	// 4Byte
		double doubleNumber = 3.33;	// 8Byte
		
		//변수 선언과 동시에 초기화
		
		
		/*
		 * 3. (단일)문자형
		 */
		
		char gold = '밥';	// 2Byte
		// 단일문자에는 반드시 작은 따옴표(한 글자에만 쓰이는 문자형이므로)를 붙여줌.
		
		// 이상의 8가지 (논리자료형 1, 숫자 자료형 6, 단일 문자형 1가지)가 기본(원시)자료형 8가지로 분류됨.
		
		
		// 4. 문자열 : 참조자료형 - 차지할 수 있는 공간의 크기가 매우 폭넓을 수밖에 없으므로 기본자료형으로 설정이 불가.
		
		String str = "abc"; //문자열 같은 경우 반드시 큰 따옴표를 앞 뒤로 붙여줌.
		
		// 논리자료형 1개
		System.out.println("논리자료형 : " + isTrue);
		
		// 정수자료형 4개
		System.out.println("정수자료형 : " + byteNumber);
		System.out.println("정수자료형 : " + shortNumber);
		System.out.println("정수자료형 : " + intNumber);
		System.out.println("정수자료형 : " + longNumber);
		
		
		// 실수자료형 2개
		System.out.println("실수자료형 : " + floatNumber);
		System.out.println("실수자료형 : " + doubleNumber);

		// 단일 문자 자료형 1개
		System.out.println("단일문자자료형 : " + gold);
		
		// 문자열 자료형 1개
		System.out.println("문자열자료형 : " + str);
		
		// 출력문의 종류
		// System.out.print();
		// System.out.println(); -> 개행한다.
		// System.out.printf(); -> f는 format, 개행하지 않음.
		System.out.println("isTrue라는 변수에 대입한 값 : " + isTrue + ", char형은 " + gold);
		
		// 위와 같은 종류의 결과물을 출력하고 싶을 경우
		
		System.out.printf("isTrue라는 변수에 대입한 값 : %b, char형은 %c, int형은 %d, float형은 %.5f, string형은 %s", isTrue, gold, intNumber, floatNumber, str);
		
		// %b : 논리자료형 변수 공간
		// %c : 단일문자자료형 변수 공간
		// %d : 정수형 변수 공간
		// %f : 실수형 변수 공간
		// %s : 문자열자료형 변수 공간
		
		// 이후 개행을 하고싶다면?
		// System.out.println(); 을 넣어주거나,
		// printf 소괄호 안 첫머리에 탈출문자라고 하는 \n 을 넣어준다.
		
		System.out.printf("\nisTrue라는 변수에 대입한 값 : %b, char형은 %c, int형은 %d, float형은 %.3f, string형은 %s", isTrue, gold, intNumber, floatNumber, str);
		System.out.println();
		
		System.out.println("==============");
		
		// (프로그래밍 언어상의) 상수 
		// -> 값을 변경하지 않을 변수 공간을 의미함.
		
		// 잘 나가는 KH가 설립된 년도를 저장할 공간이 필요해졌다.
		int startYear = 2025;
		
		// 위의 수치를 고정시키고자 할 경우
		
		final int START_YEAR = 1998;
		
		// 위와 같이 final이 붙을 경우 다음에 START_YEAR = 2025; 같은 내용이 붙어도 처리되지 않고 오류로 처리됨.
		
		System.out.printf("\nKH 설립연도 : %d (%b)", startYear, isTrue );
		
		isTrue = true ;
		System.out.printf("\nKH 설립연도 : %d (%b)", START_YEAR, isTrue);
	}
}
