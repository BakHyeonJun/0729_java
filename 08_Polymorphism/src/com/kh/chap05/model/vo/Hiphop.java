package com.kh.chap05.model.vo;

public class Hiphop extends Music implements MusicI {

	
	@Override
	public void play() {
		System.out.println("힙합 음악을 재생합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	}
	// 인터페이스를 구현한 모든 클래스가 동일하게 수행해야 하는 메소드에는 default 키워드를 붙인다.
	
}
