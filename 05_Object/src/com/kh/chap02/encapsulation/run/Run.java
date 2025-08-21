package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	public static void main(String[] args) {
		
		// encapsulation(ĸ��ȭ) - 
		// �Ӽ�(������)�� �ش� �����͸� �����ϴ� �ൿ(�޼ҵ�)�� �ϳ��� ������ ���� ��
		// ��������(information hiding) 
		// (�߻�ȭ) ĸ��ȭ ��� ������ : �ڹ��� 3�� Ư��(�߻�ȭ ���Խ� 4�� Ư��) 
		
		
		// ���� ����     ��ü ����(�޸𸮿� �Է�)
		Cafe cafe = new Cafe();
		
		/*cafe.dishWashing();
		cafe.cleaning();
		cafe.windowCleaning();
		cafe.bootingKiosk();
		*/

		// cafe.open();
		// ��ü�� ���̴� ���� '�𸦼���' ����. ��, �����͵� ������ �������� ���� �巯���� �������� ����.
		/*cafe.name = "KHī��";
		System.out.println(cafe.name);
		cafe.signatureMenu = "KHĿ��";
		cafe.signaturePrice = 4600;
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signaturePrice);
		*/
		// �޼ҵ� ȣ�� �ο����� ������ ���� �ѱ� �� �ִ�.
		cafe.setSignatureMenu("�����ֽ�");
		cafe.setSignaturePrice(5600);
		cafe.setName("kh ī��");
		cafe.setAddress("����Ư���� �߱� ���빮�� 120 ���Ϻ��� 2��");
		String cafeName = cafe.getName();
		System.out.println(cafeName);
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		String cafeSignatureMenu = cafe.getSignatureMenu();
		System.out.println(cafeSignatureMenu);
		int cafeSignaturePrice = cafe.getSignturePrice();
		System.out.println(cafeSignaturePrice);
		String cafeInfo = cafe.info();
		System.out.println(cafeInfo);
		
	}

}
