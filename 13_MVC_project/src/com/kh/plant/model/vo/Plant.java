package com.kh.plant.model.vo;

public class Plant {

	private String name;
	private String type;
	
	// VO 만들기 졸업
	// 기본생성자, 매개변수생성자, getter, setter, toString
	// 기본생성자
	
	
	// 단축키 Alt Shift s -> o -> Alt d -> Alt g
	public Plant() {
		super();
	}

	// 단축키 Alt Shift s -> o -> Alt g
	
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	
	// 단축키 Alt Shift s -> r -> Alt a -> Alt r
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 단축키 Alt Shift s -> s -> Alt g
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
	
	

	
	
	
	
	
}
