package com.kh.plant.run;

import com.kh.plant.view.PlantView;
public class PlantRun {

	public static void main(String[] args) {

		// MVC ����(Model - View - Controller)
		// ���ø����̼��� ������ �� ���� ��ҷ� �и�����.
		// ��� ����Ʈ���� ��Ű���� ������ ����
		// 1. Model
		// ������ ��� -> VO
		// �ܺ� ��ü�� ��ȣ�ۿ� ����ϴ� ���� DAO -? ���� ������ �� ������ ����
		// ~~ ����Ͻ� ����
		// 2. View
		// ����� �������̽��� ���
		// ����ڿ��� ���� ǥ�� / ������� �Է°��� �޾���
		// �𵨿��� ������� �����͸� �ð������� ǥ����
		// �𵨰� ���� ��ȣ�ۿ����� ����.
		// 3. Controller
		// Model�� View ������ �߰��ٸ� ����
		// ����� �Է��� ó���ϰ� �𵨿� �����ϴ� ����.
		// �׸��� �𵨿��� �Ͼ ó���۾��� �信 �ݿ��ϴ� ������ ��.
		
		PlantView view = new PlantView();
		view.mainMenu();
		
	}

}
