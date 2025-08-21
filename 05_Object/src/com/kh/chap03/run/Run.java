package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		// Coffee��� Ŭ����(���赵)�� ������ ��ü�� �����Ϸ� ��.
		Coffee coffee = new Coffee(); // <- ��ü ����(instance ȭ)
		// 1. �����ڷ���
		// Ŭ������ ����� ���� == ����� ���� �ڷ����� ����ڴٴ� �ǹ�
		// 2. ���� ���� �ڷ����� ���� ���� ���� ���� + ���
		// 3. �ּҰ��� ����
		
		System.out.println(coffee.info());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ŀ�Ǹ��� ������? > ");
		String name = sc.nextLine();
		coffee.setName(name);
		// String coffeeName = coffee.getName();
		System.out.print("� ���η� �Ͻ� �ǰ���? > ");
		String bean = sc.nextLine();
		coffee.setBean(bean);
		System.out.print("������� ��� �Ͻ� �ǰ���? > ");
		String size = sc.nextLine();
		coffee.setSize(size);
		// coffee.setSize(sc.nextLine()); <- ������ �ϳ�, ���� �����ϴ� ����� �ƴ�
		System.out.print("������ ����? > ");
		int price = sc.nextInt();
		sc.nextLine();
		coffee.setPrice(price);
		// coffee.setPrice(sc.nextInt()); <- ��������
		// sc.nextLine();
		System.out.print("��ī���� ���δ� ���? > ");
		boolean deca = sc.nextBoolean();
		coffee.setDeca(deca);
		// coffee.setDeca(sc.nextBoolean()); <- ��������
		
		String info = coffee.info();
		System.out.println("===============");
		System.out.println(info);
		
	}

}
