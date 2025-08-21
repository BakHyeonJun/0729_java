package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.view.RemoteView;
import com.kh.chap07.remote.model.vo.AirConditioner;


// 실질적인 컨트롤 담당
public class RemoteController {
	private AirConditioner ac = new AirConditioner();
	
	public boolean power() {
		ac.setOnOff();
		if(ac.getOnOff() == true) {
			System.out.println("전원이 켜졌습니다.");
		} else {System.out.println("전원이 꺼졌습니다.");
		}
		return ac.getOnOff();
	}
	public int cenUp() {
		if(ac.getOnOff() == true) {
			ac.setCenUp();
		} else {System.out.println("전원이 꺼져있습니다.");
		}
		return ac.getCentigrade();
	}
	/*public int cenDown() {
		if (centigrade > 20) {centigrade--;}
		return centigrade;
	}
	public int getCentigrade() {
		return centigrade;*/
	}
	
	

	

