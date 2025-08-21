package com.kh.chap02.encapsulation.model.vo;

public class Cafe {

		
	// �ʵ�(Field)��
	/*
	 * ��ü�� ���� �� �ִ� �Ӽ�
	 * ����(Data)�� ��� �κ�
	 * 
	 * �ʵ� == �������
	 * 
	 * ���������� �ڷ��� �ʵ�ĺ���;
	 */
	
	private String name;
	private String address;
	private String signatureMenu;
	private int signaturePrice;
	// private �����ڰ� ���� ��� Ŭ���� �ܺο����� ������ �� ���� ��. -> ���� �߻�.
	// ���� ���������� ������ �� �ִ� ����� �������� ��.
	// Cafe��� Ŭ������ getter / setter��� �޼ҵ� ����� 
	
		
	
	// ������(Constructor)�δ� ���� �� ����
	
	// �޼ҵ�(method)��
	/*
	 *  ���(method)�� �����ϴ� �κ�
	 *  
	 *  ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����) {
	 *  	�޼ҵ� ȣ�� �� ������ �ڵ�;
	 *  }
	 *  ���������� : ȣ���� �� �ִ� ������ ������ �� ����
	 *  ��ȯ�� : void -> return�� �� ������ ���� ���ٴ� �ǹ�.
	 *  		��ȯ�� ���ϴ� ���� �ִ� ��쿡�� ������� �ڷ����� ������־�� ��.
	 *  �Ű����� : �޼ҵ� ȣ���� �� ���� ���� �޾��ִ� ����. �޼ҵ� ���������� ��� �����ϸ�, ������ �����ϴ�
	 *  
	 */
	
	public void open() {
		dishWashing();
		cleaning();
		windowCleaning();
		bootingKiosk();
	}
	
	private void dishWashing() {
		System.out.println("�����ϰ� ����!");	
	}
	
	private void cleaning() {
		System.out.println("û�ҵ� ����!");
	}
	
	private void windowCleaning() {
		System.out.println("������ ����!");
	}
	private void bootingKiosk() {
		System.out.println("Ű����ũ ����!");
	}
	
	// �����͸� ��� �� �����ϴ� ����� �޼ҵ� : setter() 
	/*
	 * DTO -> setter�� �������
	 * VO- > �Ϲ������� setter �޼ҵ带 �������� ����.
	 * 
	 * DTO�� 2�� �ڿ� ��� ���� - �� �������� VO Ŭ������ setter �����ؼ� ����� ����.
	 * 
	 * setter ����� ��Ģ
	 * 1. setter �޼ҵ�� �ܺο��� ������ �����ؾ� �ϱ� ������ ���������ڴ� �׻� public�� �̿���.
	 * 2. set �ʵ������ �ĺ��ڸ� �ۼ��ϸ� ��Ÿ��ǥ���(camleCase)�� �� ��Ű���� �Ѵ�.
	 * 3. (���ܻ�Ȳ) �� ���������� ��а� �׻� ��� �ʵ忡 ���Ͽ� setter�� ������ �����̴�.
	 */
	// �����޴��� ���� ������ ��� �� ������ �� �ִ� �޼ҵ�
	// signaturePrice
	public void setSignaturePrice(int signaturePrice) {
		
		// System.out.println("���Ϳ��Լ� ���� ���� ���� �� : "+ signaturePrice);
		
		// signaturePrice = signaturePrice; // �ڱ� �ڽ��� ���� �ڱ� �ڽſ� �Է��϶�� ����̹Ƿ� �ƹ��� ȿ���� ����.
		// Scope �ȿ����� �ش� ���� �ȿ� �ִ� ���������� ���� �켱���� �ִ�.
		// System.out.println("�� �ּҰ� ����? " + this);
		
		// this ��ɾ� : �ش� ��ü�� �ּҰ��� ����Ű�� ����
		if(signaturePrice <= 1000) {
			System.out.println("���������� ���� ���� �Է��ϼ̽��ϴ�. 1000 �̻��� ������ �Է��ϼ���.");
		} else {
		this.signaturePrice = signaturePrice ; 
		}
	}
	
	// name �ʵ带 ��� �� ������ �� �ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSignatureMenu(String signatureMenu) {
		this.signatureMenu = signatureMenu;
	}
	/*
	 * ���ʻ� �� �� �̻��� �ʵ尪�� �����ϴ� �޼ҵ��� ��Ī���� set �� ������ �ʴ´�. (setter��� �θ��� �ʴ´�.)
	 *  public void setNameAndAddress(String name, String address) { -> �̿� ���� ���´� x
	 */
	
	// System.out.println(cafe.name); -> ���� name �� �� �κ��� private ���� �������� �Ǿ������Ƿ� ��ȿ���� �ʰ� ��. �� ��å�� �Ʒ��� ����.
	// �����͸� ��ȯ���ִ� ����� �޼ҵ� : getter()
	/*
	 * ��Ģ
	 * 1. getter()�� ���������� public�� ����Ѵ�.
	 * 2. get�ʵ������ ����, ��Ÿ��ǥ���(setter�� ����)�� ����Ѵ�.
	 * 3. ��� �ʵ忡 ���ؼ� �ݵ��(������ �� �� �����!) ������ش�.
	 */
	
	// �޼ҵ带 ȣ���� ������ name �ʵ尪�� �����ְ��� �� ��
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getSignturePrice() {
		return signaturePrice;
	}
	public String getSignatureMenu() {
		return signatureMenu;
	}
	// getter()�� setter()�� �� ����� �ϴ� ���������� ĸ��ȭ�� �ϴܶ��Ǿ��ٰ� �����.
	/* �������ڸ�
	 * 1. ���� �����. -> �ʵ��� ���������ڸ� public ��� private���� �����Ѵ�.
	 * 2. �޼ҵ带 ���� �ʵ忡 ������ �� �ֵ��� ������ش� -> getter() / setter() ����
	 * 
	 *  
	 *  ĸ��ȭ�� ���ؼ� ���� �� �ִ� ȿ�� - 1. ������ ����(��������) -> ��ü���� ���յ��� ���� -> å���� �и���Ų��.
	 *  2. 
	 */
	// ��� �ʵ� ���� Ȯ���� �� �ֵ��� ��ȯ���ִ� �޼ҵ� �����
	
	public String info() {
		// return name, address, signaturePrice; �� ���� ���´� �翬�� �Ұ�.
		// return �� ��ȯ�� �� �ִ� ���� �� �� ���̴�.
		String info = "[ī��� : " + name +"\n�ּ� : " + address + "\n�ñ״�ó �޴� : " + signatureMenu + "\n�ñ״�ó �޴��� ���� : " + signaturePrice + "]" ;
		return info;
	}
	
}
