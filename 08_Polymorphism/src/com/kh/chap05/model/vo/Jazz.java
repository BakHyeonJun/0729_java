package com.kh.chap05.model.vo;

public class Jazz extends Music implements MusicI {
	
	@Override
	public void play() {
		System.out.println("¿Á¡Ó ¿Ωæ«¿ª ¿Áª˝«’¥œ¥Ÿ.");
	}
	
	@Override
	public void stop() {
		System.out.println("¿Ωæ«¿ª ∏ÿ√‰¥œ¥Ÿ.");
	}

}
