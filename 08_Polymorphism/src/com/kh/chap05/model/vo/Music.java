package com.kh.chap05.model.vo;

public class Music {

	// 개발에 있어서 유명한 금언
	// 1. 바퀴를 다시 발명하지 마라. - 이미 있는 것을 굳이 다시 만들어내려고 하지 마라. 이 경우 협업이 곤란해짐.
	// 2. 은탄환은 없다. - 전가의 보도같은 것은 존재하지 않으니 그런 것 찾고 있을 시간에 코드를 탄탄하게 작성하는 것이 낫다.
	
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
