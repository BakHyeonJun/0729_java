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
		System.out.println("ȸ�������� �Է¹ްڽ��ϴ�.");
		System.out.println("ȸ�����̵� �Է����ּ���.");
		memberId = sc.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���");
		memberPwd = sc.nextLine();
		System.out.println("ȸ������ ������ �Է����ּ���");
		memberName = sc.nextLine();
		System.out.println("���̸� �Է����ּ���");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է����ּ���");
		gender = (char)sc.nextByte();
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		phone = sc.nextLine();
		System.out.println("�̸����� �Է����ּ���");
		email = sc.nextLine();
		System.out.println("��ϵ� ȸ�� �̸��� �����ϰڽ��ϴ�. ����� �̸��� �Է����ּ���.");
		changeName();
		System.out.println("�������� ȸ������ ������ ������ �����ϴ�.");
		System.out.println("���̵� : " + memberId);
		System.out.println("�н����� : " + memberPwd);
		System.out.println("���� : " + memberName);
		System.out.println("���� : " + age + "��");
		System.out.println("���� : " + gender + "��");
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("�̸��� : " + email);
		
		
		
	}
}
