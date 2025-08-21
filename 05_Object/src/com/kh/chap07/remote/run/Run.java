package com.kh.chap07.remote.run;

import com.kh.chap07.remote.view.RemoteView;

// 프로그램 실행하고 화면 띄우는 역할만 담당
public class Run {

	public static void main(String[] args) {
		
		RemoteView view = new RemoteView();
		view.mainMenu();
		
	}

}
