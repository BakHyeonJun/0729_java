package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	public static void main(String[] args) {
		
		// encapsulation(캡슐화) - 
		// 속성(데이터)와 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
		// 정보은닉(information hiding) 
		// (추상화) 캡슐화 상속 다형성 : 자바의 3대 특성(추상화 포함시 4대 특성) 
		
		
		// 변수 선언     객체 생성(메모리에 입력)
		Cafe cafe = new Cafe();
		
		/*cafe.dishWashing();
		cafe.cleaning();
		cafe.windowCleaning();
		cafe.bootingKiosk();
		*/

		// cafe.open();
		// 객체들 사이는 서로 '모를수록' 좋다. 즉, 데이터들 사이의 연관성이 쉽게 드러나지 않을수록 좋다.
		/*cafe.name = "KH카페";
		System.out.println(cafe.name);
		cafe.signatureMenu = "KH커피";
		cafe.signaturePrice = 4600;
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signaturePrice);
		*/
		// 메소드 호출 부에서는 오로지 값만 넘길 수 있다.
		cafe.setSignatureMenu("수박주스");
		cafe.setSignaturePrice(5600);
		cafe.setName("kh 카페");
		cafe.setAddress("서울특별시 중구 남대문로 120 대일빌딩 2층");
		String cafeName = cafe.getName();
		System.out.println(cafeName);
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		String cafeSignatureMenu = cafe.getSignatureMenu();
		System.out.println(cafeSignatureMenu);
		int cafeSignaturePrice = cafe.getSignturePrice();
		System.out.println(cafeSignaturePrice);
		String cafeInfo = cafe.info();
		System.out.println(cafeInfo);
		
	}

}
