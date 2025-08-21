package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {

			
		/*
		 *	상속이란 무엇인가?
		 *	상속의 구조 = 필드, 메소드 - 하지만 별로 중요하지 않음.
		 *	상속에서 가장 중요한 것은? 타입(자료형)
		 */
		
	public static void main(String[] args) {	
		
		
		// 1. 부모 타입 자료형으로 부모 타입 객체를 다룸
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); // <- parent 클래스에서는  printChild가 정의되어있지 않으므로 성립되지 않음.
		
		// 2. 자식 타입 자료형으로 자식 타입 객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // <- Child1이 Parent를 상속했으므로 Parent의 기능들에도 접근 가능.
		
		// 3. 부모 타입 자료형으로 자식 타입 객체를 다룸 -> 다형성 적용
		Parent p2 = /*(Parent) 상속 구조 덕분에 자동으로 자료형 변환을 해줌*/new Child1();
		// 앞의 자료형 관련된 내용에서 나왔듯이 =를 기준으로 양쪽의 자료형이 동일해야 하는데 동일하지 않다. 그럼에도 불구하고 Child1이 Parent를 상속하기 때문에 자동으로 자료형 변환을 통해 Child1을 Parent 형으로 변환하여 처리하여 주었다.
		p2.printParent();
		// p2.printChild1(); <- 그 결과 p2는 Child1() 자료형이 아니라 Parent 자료형으로 정의되었기 때문에 printChild1()이 처리되지 않는 결과를 낳게 됨.
		
		//4. 자식 타입 자료형으로 부모 타입 객체를 다룸
		// Child1 c1 = new Parent();
		// 이 경우는 Parent가 Child1을 상속하지 않았고, 따라서 내용상 Child1의 모든 내용을 포섭하지 못한다. 그러므로 자료형 변환을 통한 보정도 가능하지 않으므로 첫 단계에서부터 자료형 불일치의 문제가 바로 발생하게 된다.
		
		/*
		 * 클래스 형 변환은 "상속 구조"일 경우에만 가능
		 * 
		 * 1. Up Casting
		 * 자식 타입에서 부모 타입으로 변형하는 것. 생략이 가능함. 위의 3번에 해당.
		 * 
		 * 2. Down Casting
		 * 부모 타입에서 자식 타입으로 변형하는 것. 생략이 불가능. 위의 4번에 해당.
		 */
		((Child1)p2).printChild1();
		
		// Child1 타입의 객체 두 개와 Child2 타입의 객체 두 개 총 4개의 객체를 다뤄볼 것.
		
		/* 변수만 사용한 경우
		 * Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		이 방법은 객체의 개수만큼 변수가 필요하므로 효율이 좋지 않다.
		*/
		
		/*
		 * 객체 배열을 활용한 경우
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1(); 
		arr1[1] = new Child1(); 
		arr2[0] = new Child2(); 
		arr2[1] = new Child2(); 
		그나마 배열을 활용하여 필요한 변수의 개수를 줄인 방식이다.
		*/
		
		// 이하는 다형성 개념까지 활용한 경우들
		System.out.println("\n\n\n다형성을 적용해보자");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent) new Child1();
		arr[1] = (Parent) new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		
		/*
		// 다형성의 요소를 활용하여 이렇게 for를 활용한 반복문으로도 처리할 수 있게 됨.
		
		System.out.println("\n\n\n\n");
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			}	else {
				((Child2)arr[i]).printChild2();
			}
			이 방법도 가능은 하나 썩 좋은 방법은 아님.
		
		
		if(arr[i] instanceof Child1) {
			// instanceof -> true/false
			// 현재의 참조변수가 실질적으로 어떤 클래스 타입을 참조하고 있는지 확인할 때 사용
			((Child1)arr[i]).printChild1();
		} else {
			((Child2)arr[i]).printChild2();
		}
		// 이것 역시 가능한 방법이긴 함.
		*/
		arr[i].print();
		/* 위의 방식이 이른바 동적바인딩.
		 * 오버로딩에서의 정적바인딩과 대비되는 개념.
		 * 동적바인딩이란 : 프로그램 "실행 전" 컴파일 시점에 정적바인딩 수행(자료형의 메소드를 가리킴) 실질적으로 참조하고 있는 객체가 ~
		 * 
		 * 
		 */
		}
	}

	}

