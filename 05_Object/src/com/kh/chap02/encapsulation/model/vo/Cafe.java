package com.kh.chap02.encapsulation.model.vo;

public class Cafe {

		
	// 필드(Field)부
	/*
	 * 객체가 가질 수 있는 속성
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	
	private String name;
	private String address;
	private String signatureMenu;
	private int signaturePrice;
	// private 접근자가 붙을 경우 클래스 외부에서는 접근할 수 없게 됨. -> 오류 발생.
	// 따라서 간접적으로 접근할 수 있는 방법을 만들어줘야 함.
	// Cafe라는 클래스에 getter / setter라는 메소드 만들기 
	
		
	
	// 생성자(Constructor)부는 내일 할 예정
	
	// 메소드(method)부
	/*
	 *  기능(method)를 구현하는 부분
	 *  
	 *  접근제한자 (예약어) 반환형 메소드식별자(매개변수) {
	 *  	메소드 호출 시 실행할 코드;
	 *  }
	 *  접근제한자 : 호출할 수 있는 범위를 제한할 수 있음
	 *  반환형 : void -> return할 때 돌려줄 값이 없다는 의미.
	 *  		반환을 원하는 값이 있는 경우에는 결과값의 자료형을 명시해주어야 함.
	 *  매개변수 : 메소드 호출할 때 전달 값을 받아주는 변수. 메소드 범위에서만 사양 가능하며, 생략이 가능하다
	 *  
	 */
	
	public void open() {
		dishWashing();
		cleaning();
		windowCleaning();
		bootingKiosk();
	}
	
	private void dishWashing() {
		System.out.println("깨끗하게 빡빡!");	
	}
	
	private void cleaning() {
		System.out.println("청소도 빡빡!");
	}
	
	private void windowCleaning() {
		System.out.println("유리도 빡빡!");
	}
	private void bootingKiosk() {
		System.out.println("키오스크 가동!");
	}
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter() 
	/*
	 * DTO -> setter를 만들어줌
	 * VO- > 일반적으로 setter 메소드를 구현하지 않음.
	 * 
	 * DTO는 2달 뒤에 배울 예정 - 그 전까지는 VO 클래스에 setter 구현해서 사용할 예정.
	 * 
	 * setter 만드는 규칙
	 * 1. setter 메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자는 항상 public을 이용함.
	 * 2. set 필드명으로 식별자를 작성하며 낙타봉표기법(camleCase)을 꼭 지키도록 한다.
	 * 3. (예외상황) 본 수업에서는 당분간 항상 모든 필드에 대하여 setter를 구현할 예정이다.
	 */
	// 고유메뉴의 가격 정보를 기록 및 수정할 수 있는 메소드
	// signaturePrice
	public void setSignaturePrice(int signaturePrice) {
		
		// System.out.println("세터에게서 전달 받은 정수 값 : "+ signaturePrice);
		
		// signaturePrice = signaturePrice; // 자기 자신의 값을 자기 자신에 입력하라는 명령이므로 아무런 효과가 없음.
		// Scope 안에서는 해당 영역 안에 있는 지역변수에 대한 우선권이 있다.
		// System.out.println("내 주소가 뭐지? " + this);
		
		// this 명령어 : 해당 객체의 주소값을 가리키는 역할
		if(signaturePrice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000 이상의 정수를 입력하세요.");
		} else {
		this.signaturePrice = signaturePrice ; 
		}
	}
	
	// name 필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSignatureMenu(String signatureMenu) {
		this.signatureMenu = signatureMenu;
	}
	/*
	 * 관례상 두 개 이상의 필드값을 변경하는 메소드의 명칭에는 set 을 붙이지 않는다. (setter라고 부르지 않는다.)
	 *  public void setNameAndAddress(String name, String address) { -> 이와 같은 형태는 x
	 */
	
	// System.out.println(cafe.name); -> 현재 name 이 들어간 부분이 private 으로 접근제한 되어있으므로 유효하지 않게 됨. 그 대책은 아래와 같다.
	// 데이터를 반환해주는 기능의 메소드 : getter()
	/*
	 * 규칙
	 * 1. getter()는 접근제한자 public을 사용한다.
	 * 2. get필드명으로 짓되, 낙타봉표기법(setter와 동일)을 사용한다.
	 * 3. 모든 필드에 대해서 반드시(무조건 꼭 다 절대로!) 만들어준다.
	 */
	
	// 메소드를 호출한 곳으로 name 필드값을 돌려주고자 할 때
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getSignturePrice() {
		return signaturePrice;
	}
	public String getSignatureMenu() {
		return signatureMenu;
	}
	// getter()와 setter()를 다 만들면 일단 문법적으로 캡슐화가 일단락되었다고 얘기함.
	/* 정리하자면
	 * 1. 값을 숨긴다. -> 필드의 접근제한자를 public 대신 private으로 선언한다.
	 * 2. 메소드를 통해 필드에 접근할 수 있도록 만들어준다 -> getter() / setter() 구현
	 * 
	 *  
	 *  캡슐화를 통해서 얻을 수 있는 효과 - 1. 데이터 숨김(정보은닉) -> 객체간의 결합도를 낮춤 -> 책임을 분리시킨다.
	 *  2. 
	 */
	// 모든 필드 값을 확인할 수 있도록 반환해주는 메소드 만들기
	
	public String info() {
		// return name, address, signaturePrice; 와 같은 형태는 당연히 불가.
		// return 시 반환할 수 있는 값은 단 한 개이다.
		String info = "[카페명 : " + name +"\n주소 : " + address + "\n시그니처 메뉴 : " + signatureMenu + "\n시그니처 메뉴의 가격 : " + signaturePrice + "]" ;
		return info;
	}
	
}
