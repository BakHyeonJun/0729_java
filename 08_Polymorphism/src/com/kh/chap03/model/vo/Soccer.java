package com.kh.chap03.model.vo;

public class Soccer extends Sports{

	@Override
	public void rule() {
		System.out.println("골키퍼 이외의 선수들은 공에 손을 대면 안 된다.");
	}
	
}
