package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker{

	private boolean gout;
	
	public BeerDrinker() {
		
	}
	public BeerDrinker(boolean gout) {
		this.gout = gout;
	}
	public boolean getGout() {
		return gout;
	}
	public void setGout(boolean gout) {
		this.gout = gout;
	}
	
	@Override
	public void drink() {
		System.out.println("맥주를 한 모금 마십니다.");
	}
	@Override
	public void eat() {
		System.out.println("치킨 안주를 1점 먹습니다");
	}
}


