package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	public static void main(String[] args) {
	
		/*
		 * ��ü ���� ���α׷��� : ���Ǽ��迡���� �������� ����(��ü)�� �Ӽ��� ������ ���� ��ü�� ���� ��ü���� ��ȣ�ۿ��� ���� ���α׷����ϴ� ���. �� ��ǻ���� ���� ����� �ƴ� ����� �����ϴ� ��Ŀ� ������ ���α׷����� �ϴ� ��.
		 * 
		 * �����ϰ��� �ϴ� ���α׷��� ��ü�� ����� ���ؼ��� (�����ϱ� ���ؼ���) -> Ŭ������ ���� �����ؾ� ��.
		 * 
		 * Ŭ������? �� ��ü���� ����(�Ӽ�, ����)���� ��Ƴ��� �׸�, Ʋ, ���赵, ��. ��, �����ڰ� ����� ����� ���� �ڷ���.
		 * 
		 * Ŭ���� : VO(Value Object)
		 * 
		 * ������ ���� - ���ǿ� �����ϴ� �������� ��ҿ� ���ؼ� VO Ŭ������ ����� ������ ��ü�� ������ �� �ִ� ���α׷��� �ۼ��� ��. (PuppyCareRun Ŭ���� ����)
		 * ���� ) VO Ŭ���� 5�� + VO �������α׷� 5��(��, �ּ� 10���� Ŭ���� �ʿ�)
		 * �� VOŬ������ �ּ� �ʵ� �� 5��
		 * 
		 * ������ �� : �츮�ݰԽ��� �Խñ� �ۼ� - ���� ��
		 * ���ѽð� : 2025 / 08 / 07  07:59
		 * �Խñ� ���� : "�̸�" + "VO Ŭ���� �����"
		 * 
		 * + �޸𸮱��� �׸���(�̰� 1����)
		 * 
		 */
		
		/* �ڹٿ����� class�� �������� �з������� '��'�� �ش��ϴ� �ǹ̷� ����.
		 * ex) Ư���� �������� ������ �� �ʿ�� �ϴ� ���� �߻�ȭ�Ͽ� ������ ����
		 * 
		 * �� - ���޶�Ͼ�
		 * �̸� - �ʶ���
		 * ���� - 4
		 * ���� - ����
		 * ���� - ����
		 * ������ - 3k
		 * 		
		 */
		// ��ü�� �����Ϸ��� ���Ͽ� ���� �Ѵ�.
		Puppy smart = new Puppy(); // ���� �ؿ� ��. new��� ����� ���
	//  �ڷ���
		
		// smart.sniff();
		
		// System.out.println(smart);  
		
		// System.out.println(smart.name); - �׳� �� �ڵ常 �Է��ϸ� �翬�� null���� ��� 
		
		smart.name = "�ʶ���";
		// System.out.println(smart.name);
		smart.species = "���޶�Ͼ�";
		smart.age = 4;
		smart.gender = "����";
		smart.color = "����";
		smart.weight = 3;
		System.out.println(smart.name + "�� " + smart.color + " " + smart.species + "�Դϴ�.");
		System.out.println(smart.age + "�� " + smart.gender + "�̰� " + smart.weight + "kg�Դϴ�.");
		
		// 1 more
		
		Puppy soldier = new Puppy();
		
		soldier.name = "�����";
		soldier.age = 22;
		soldier.species = "�׷���Ʈ �Ƿ�����";
		soldier.gender = "����";
		soldier.color = "���";
		soldier.weight = 60;
		System.out.println(soldier.name + "�̴� " + soldier.color + " " + soldier.species + "�Դϴ�.");
		System.out.println(soldier.age + "�� " + soldier.gender + "�̰� " + soldier.weight + "kg�Դϴ�."); 
		
		System.out.println("==========");
		smart.sniff();
		soldier.sniff();
		System.out.println("¢�� �� ����� ������ : ");
		System.out.println(soldier.weight + "kg");
		
		soldier.bark();
		soldier.bark();
		soldier.bark();
		
		System.out.println("¢�� �� �� : ");
		System.out.println(soldier.weight + "kg");
		
	}
	
	// public static void main(String[] args) { -> ���� �Է��� �ʿ� ���� main �������� ���� �� ��Ʈ�� �����̽� ����Ű�� �ս��� �ҷ��� �� ���� 
		
//}
}
