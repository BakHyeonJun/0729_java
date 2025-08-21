package com.kh.chap02.model.vo;

public class MakgeolliDrinker extends Drinker{

	private int age;
	
	public MakgeolliDrinker() {
		
	}
	public MakgeolliDrinker(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void drink() {
		System.out.println("막걸리를 1잔 마십니다");
	}
	@Override
	public void eat() {
		System.out.println("전 안주를 1점 먹습니다");
	}
}


