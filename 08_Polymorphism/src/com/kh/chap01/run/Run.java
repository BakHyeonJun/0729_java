package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {

			
		/*
		 *	����̶� �����ΰ�?
		 *	����� ���� = �ʵ�, �޼ҵ� - ������ ���� �߿����� ����.
		 *	��ӿ��� ���� �߿��� ����? Ÿ��(�ڷ���)
		 */
		
	public static void main(String[] args) {	
		
		
		// 1. �θ� Ÿ�� �ڷ������� �θ� Ÿ�� ��ü�� �ٷ�
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); // <- parent Ŭ����������  printChild�� ���ǵǾ����� �����Ƿ� �������� ����.
		
		// 2. �ڽ� Ÿ�� �ڷ������� �ڽ� Ÿ�� ��ü�� �ٷ�
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // <- Child1�� Parent�� ��������Ƿ� Parent�� ��ɵ鿡�� ���� ����.
		
		// 3. �θ� Ÿ�� �ڷ������� �ڽ� Ÿ�� ��ü�� �ٷ� -> ������ ����
		Parent p2 = /*(Parent) ��� ���� ���п� �ڵ����� �ڷ��� ��ȯ�� ����*/new Child1();
		// ���� �ڷ��� ���õ� ���뿡�� ���Ե��� =�� �������� ������ �ڷ����� �����ؾ� �ϴµ� �������� �ʴ�. �׷����� �ұ��ϰ� Child1�� Parent�� ����ϱ� ������ �ڵ����� �ڷ��� ��ȯ�� ���� Child1�� Parent ������ ��ȯ�Ͽ� ó���Ͽ� �־���.
		p2.printParent();
		// p2.printChild1(); <- �� ��� p2�� Child1() �ڷ����� �ƴ϶� Parent �ڷ������� ���ǵǾ��� ������ printChild1()�� ó������ �ʴ� ����� ���� ��.
		
		//4. �ڽ� Ÿ�� �ڷ������� �θ� Ÿ�� ��ü�� �ٷ�
		// Child1 c1 = new Parent();
		// �� ���� Parent�� Child1�� ������� �ʾҰ�, ���� ����� Child1�� ��� ������ �������� ���Ѵ�. �׷��Ƿ� �ڷ��� ��ȯ�� ���� ������ �������� �����Ƿ� ù �ܰ迡������ �ڷ��� ����ġ�� ������ �ٷ� �߻��ϰ� �ȴ�.
		
		/*
		 * Ŭ���� �� ��ȯ�� "��� ����"�� ��쿡�� ����
		 * 
		 * 1. Up Casting
		 * �ڽ� Ÿ�Կ��� �θ� Ÿ������ �����ϴ� ��. ������ ������. ���� 3���� �ش�.
		 * 
		 * 2. Down Casting
		 * �θ� Ÿ�Կ��� �ڽ� Ÿ������ �����ϴ� ��. ������ �Ұ���. ���� 4���� �ش�.
		 */
		((Child1)p2).printChild1();
		
		// Child1 Ÿ���� ��ü �� ���� Child2 Ÿ���� ��ü �� �� �� 4���� ��ü�� �ٷﺼ ��.
		
		/* ������ ����� ���
		 * Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		�� ����� ��ü�� ������ŭ ������ �ʿ��ϹǷ� ȿ���� ���� �ʴ�.
		*/
		
		/*
		 * ��ü �迭�� Ȱ���� ���
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1(); 
		arr1[1] = new Child1(); 
		arr2[0] = new Child2(); 
		arr2[1] = new Child2(); 
		�׳��� �迭�� Ȱ���Ͽ� �ʿ��� ������ ������ ���� ����̴�.
		*/
		
		// ���ϴ� ������ ������� Ȱ���� ����
		System.out.println("\n\n\n�������� �����غ���");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent) new Child1();
		arr[1] = (Parent) new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		
		/*
		// �������� ��Ҹ� Ȱ���Ͽ� �̷��� for�� Ȱ���� �ݺ������ε� ó���� �� �ְ� ��.
		
		System.out.println("\n\n\n\n");
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			}	else {
				((Child2)arr[i]).printChild2();
			}
			�� ����� ������ �ϳ� �� ���� ����� �ƴ�.
		
		
		if(arr[i] instanceof Child1) {
			// instanceof -> true/false
			// ������ ���������� ���������� � Ŭ���� Ÿ���� �����ϰ� �ִ��� Ȯ���� �� ���
			((Child1)arr[i]).printChild1();
		} else {
			((Child2)arr[i]).printChild2();
		}
		// �̰� ���� ������ ����̱� ��.
		*/
		arr[i].print();
		/* ���� ����� �̸��� �������ε�.
		 * �����ε������� �������ε��� ���Ǵ� ����.
		 * �������ε��̶� : ���α׷� "���� ��" ������ ������ �������ε� ����(�ڷ����� �޼ҵ带 ����Ŵ) ���������� �����ϰ� �ִ� ��ü�� ~
		 * 
		 * 
		 */
		}
	}

	}

