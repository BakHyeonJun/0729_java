package com.kh.example.practice1.model.vo;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public String setMemberId() {
		return memberId;
	}
	public String setMemberPwd() {
		return memberPwd;
	}
	public String setMemberName() {
		return memberName;
	}
	public int setAge() {
		return age;
	}
	public char setGender() {
		return gender;
	}
	public String setPhone() {
		return phone;
	}
	public String setEmail() {
		return email;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPwd() {
		return memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String changeName() {
		memberName = sc.nextLine();
		return memberName;
	}
	
	public void memberManagement() {
		System.out.println("회원정보를 입력받겠습니다.");
		System.out.println("회원아이디를 입력해주세요.");
		memberId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		memberPwd = sc.nextLine();
		System.out.println("회원님의 성함을 입력해주세요");
		memberName = sc.nextLine();
		System.out.println("나이를 입력해주세요");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력해주세요");
		gender = (char)sc.nextByte();
		System.out.println("전화번호를 입력해주세요");
		phone = sc.nextLine();
		System.out.println("이메일을 입력해주세요");
		email = sc.nextLine();
		System.out.println("등록된 회원 이름을 변경하겠습니다. 변경된 이름을 입력해주세요.");
		changeName();
		System.out.println("최종적인 회원님의 정보는 다음과 같습니다.");
		System.out.println("아이디 : " + memberId);
		System.out.println("패스워드 : " + memberPwd);
		System.out.println("성함 : " + memberName);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender + "성");
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
		
		
		
	}
}
