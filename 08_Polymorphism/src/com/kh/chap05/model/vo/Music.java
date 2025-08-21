package com.kh.chap05.model.vo;

public class Music {

	// ���߿� �־ ������ �ݾ�
	// 1. ������ �ٽ� �߸����� ����. - �̹� �ִ� ���� ���� �ٽ� �������� ���� ����. �� ��� ������ �������.
	// 2. ��źȯ�� ����. - ������ �������� ���� �������� ������ �׷� �� ã�� ���� �ð��� �ڵ带 źź�ϰ� �ۼ��ϴ� ���� ����.
	
	private String title;
	private String runningTime;
	private String code;
	
	public Music() {}
	public Music(String title, String runningTime, String code) {
		this.title = title;
		this.runningTime = runningTime;
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public String getCode() {
		return code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
