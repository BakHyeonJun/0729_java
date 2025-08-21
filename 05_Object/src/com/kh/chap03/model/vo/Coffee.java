package com.kh.chap03.model.vo;

public class Coffee {

	private String name;
	private String bean;
	private String size;
	private int price;
	private boolean deca;
	
	// 생성자부
	
	
	//메소드부 getter / setter / info
	
	public String getName() {
		return name;
	}
	public String getBean() {
		return bean;
	}
	public String getSize() {
		return size;
	}
	public int gerPrice() {
		return price;
	}
	public boolean getDeca() {
		return deca;
	}
	
	// 필드값을 세팅해주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDeca(boolean deca) {
		this.deca = deca;
	}
	public String info() {
		String info = "상품명 : " + name
					+ "\n원두 : " + bean
					+ "\n사이즈 : " + size
					+ "\n가격 : " + price
					+ "\n디카페인 여부 : " + deca;
		return info;
	}
	
}
