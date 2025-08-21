package com.kh.chap07.remote.model.vo;


// 필요한 값들을 저장하는 역할
public class AirConditioner {
	
	
	private boolean onOff;
	private int centigrade = 25;
	private int angleLeftRight;
	private int angleUpDown;
	private int reservation;
	
	public boolean setOnOff() {
		onOff = !onOff; // 이렇게 간단한 방법으로 해결 가능.
		return onOff;
	}

	public int setCenUp() {
		if(centigrade < 30)
		{centigrade++; }
		return centigrade;
	}
	public int setCenDown() {
		if(centigrade > 20)
			{centigrade-- ;}
		return centigrade;
	}
	public int setAngleLeft() {
		if(angleLeftRight > -50)
		{angleLeftRight = (angleLeftRight - 10); }
		return angleLeftRight;
	}
	public int setAngleRight() {
		if(angleLeftRight < 50)
		{angleLeftRight = (angleLeftRight + 10); }
		return angleLeftRight;
	}
	public int setAngleUp() {
		if(angleUpDown < 50) 
		{angleUpDown = (angleUpDown + 10); }
		return angleUpDown;
	}
	public int setAngleDown() {
		if(angleUpDown > -50) 
		{angleUpDown = (angleUpDown - 10); }
		return angleUpDown;
	}	
	public int setReservation() {
		if(reservation < 600)
		{reservation = (reservation + 60); }
		else if (reservation == 600)
		{reservation = 0;}
		return reservation;
	}
	
	
		
		if (onOff == true) { onOff = false;
				System.out.println("off");	
				return false;
		} else { onOff = true;
		System.out.println("on");
		return true;
		
		
	public boolean getOnOff() {
		return onOff;
	}
	public int getCentigrade() {
		return centigrade;
	}
	
}
	



