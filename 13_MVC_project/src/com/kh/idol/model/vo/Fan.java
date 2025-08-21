package com.kh.idol.model.vo;

public class Fan {

	private String userId;
	private String userpwd;
	private String nickName;
	
	
	
	private Fan() {
		super();
	}

	private Fan(String userId, String userpwd, String nickName) {
		super();
		this.userId = userId;
		this.userpwd = userpwd;
		this.nickName = nickName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	
	
	
	
	
}
