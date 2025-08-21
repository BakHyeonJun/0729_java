package com.kh.model.vo;

import java.util.Scanner;

public class Restaurant {

	
	Scanner sc = new Scanner(System.in);
	private String storeName;
	private String address;
	private String mainMenu;
	

	public String getStoreName() {
		return storeName;
	}
	public String getAddress() {
		return address;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	public Restaurant() {
		
	}
	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	
	public String setStoreName(String storeName) {
		this.storeName = storeName;
		return storeName;
	}
	public String setAddress(String address) {
		this.address = address;
		return address;
	}
	public String setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
		return mainMenu;
	}
	public void information() { 
		System.out.println("식당의 정보 - 상호 : " + storeName + ", 주소 : " + address + ", 주력 메뉴 : " + mainMenu);
	}
	
	
	
	
	
	/*
	 * 기본생성자
	 * 모든 필드를 매개변수로 갖는 생성자
	 * getter
	 * setter
	 * information
	 * 세 가지 요소를 구현할 것.
	 */
	
	
}
