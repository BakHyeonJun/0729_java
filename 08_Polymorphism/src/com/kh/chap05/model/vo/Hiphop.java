package com.kh.chap05.model.vo;

public class Hiphop extends Music implements MusicI {

	
	@Override
	public void play() {
		System.out.println("���� ������ ����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	// �������̽��� ������ ��� Ŭ������ �����ϰ� �����ؾ� �ϴ� �޼ҵ忡�� default Ű���带 ���δ�.
	
}
