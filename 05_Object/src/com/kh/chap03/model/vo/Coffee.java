package com.kh.chap03.model.vo;

public class Coffee {

	private String name;
	private String bean;
	private String size;
	private int price;
	private boolean deca;
	
	// �����ں�
	
	
	//�޼ҵ�� getter / setter / info
	
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
	
	// �ʵ尪�� �������ִ� �޼ҵ�
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
		String info = "��ǰ�� : " + name
					+ "\n���� : " + bean
					+ "\n������ : " + size
					+ "\n���� : " + price
					+ "\n��ī���� ���� : " + deca;
		return info;
	}
	
}
