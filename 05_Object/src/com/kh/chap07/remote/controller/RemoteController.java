package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.view.RemoteView;
import com.kh.chap07.remote.model.vo.AirConditioner;


// �������� ��Ʈ�� ���
public class RemoteController {
	private AirConditioner ac = new AirConditioner();
	
	public boolean power() {
		ac.setOnOff();
		if(ac.getOnOff() == true) {
			System.out.println("������ �������ϴ�.");
		} else {System.out.println("������ �������ϴ�.");
		}
		return ac.getOnOff();
	}
	public int cenUp() {
		if(ac.getOnOff() == true) {
			ac.setCenUp();
		} else {System.out.println("������ �����ֽ��ϴ�.");
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
	
	

	

