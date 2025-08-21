package com.kh.rsp;

import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		
		System.out.println("가위바위보를 시작합니다");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신");
		String you = scanner.nextLine();
		
		System.out.println("상대");
		String enemy = scanner.nextLine();
		
		System.out.println("판정");
	}
	}
