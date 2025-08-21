package com.kh.plant.model.vo;

public class Plant {

	private String name;
	private String type;
	
	// VO ����� ����
	// �⺻������, �Ű�����������, getter, setter, toString
	// �⺻������
	
	
	// ����Ű Alt Shift s -> o -> Alt d -> Alt g
	public Plant() {
		super();
	}

	// ����Ű Alt Shift s -> o -> Alt g
	
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	
	// ����Ű Alt Shift s -> r -> Alt a -> Alt r
	
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

	// ����Ű Alt Shift s -> s -> Alt g
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
	
	

	
	
	
	
	
}
