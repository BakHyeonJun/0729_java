package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {

		/*
		 * ���׸�
		 * 
		 * �÷����� ����ϸ鼭 �ٷ� Ÿ�Ե��� �̸� ������ �� �ִ� ���
		 * -> ��������δ� <Integer>, <Plant>�� ���� ǥ��
		 * -> Ư�� Ÿ���� ��ҵ鸸 �÷��ǿ� ���� �� �ֵ��� ������ ���� ����.
		 * 
		 * ������ ���׸� ���� �÷��� ��ü ����(E == Object)
		 * 1. �ٷ� ����� Ÿ���� ������ ����
		 * 
		 */
		
		
		ArrayList plants = new ArrayList();
		plants.add(new Plant("�����Ĺ�", "�꼼������"));
		plants.add(new Plant());
		plants.add(new Plant("�����Ĺ�", "��������"));
		/*plants.add(1); //
		plants.add(1.1); */
		// �� �� ���� ���� �⺻�ڷ��� ������ Object�� �߰��Ǵ� ���� �����Ѱ�? -> �⺻�ڷ����� �����ڷ������� �������ִ� ���� Wrapper class��� ��.(������ �� ���� �� �κ�)
		
		/*Plant p  = plants.get[0];
		
		for(Plant plant : plants) {
			System.out.println(plant);*/
		}
		
		
		
		
	}


