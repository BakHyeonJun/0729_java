package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : �ð����� �κ� ��, ȭ���� ��/��� ���.


public class PlantView {

	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	// ���α׷� ����� ������ ȭ���� ������ִ� ���
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("�Ĺ� ���� ���α׷�");
			
			// CRUD
			// C - Create : ����ڷκ��� �Է¹��� ������ ���ο� �Ĺ� �����͸� �߰�(����)�ϴ� �۾�
			// R - Read : ������ �Ĺ� �����͸� ��ȸ�ϴ� �۾�
			// U - Update : ������ �Ĺ� �����͸� �����ϴ� �۾�
			// D - Delete : �Ĺ� �����͸� �����ϴ� �۾�
			
			System.out.println("1. �Ĺ� �߰��ϱ�");
			System.out.println("2. ��ü �Ĺ� ��ȸ�ϱ�");
			System.out.println("3. Ư�� �Ĺ� �˻��ϱ�");
			System.out.println("4. Ư�� �Ĺ� �����ϱ�");
			System.out.println("5. Ư�� �Ĺ� �����ϱ�");
			System.out.println("6. �Ĺ� ����� ���Ϸ� �����ϱ�");
			System.out.println("0. ���α׷� �����ϱ�");
			System.out.println();
			
			System.out.println("�̿��ϰ��� �ϴ� ����� �����ϼ���. > ");
			try {
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : createPlant(); break;
			case 2 : readAll(); break;
			case 3 : findByKeyword(); break;
			case 4 : deletePlant(); break;
			case 5 : updatePlant(); break;
			case 6 : pc.outputFile(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��� �Է��Դϴ�. �ٽ� �������ּ���.");
			}
			} catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ���.");
				sc.nextLine();
			}
			
			
		}

	
	}
	private void createPlant() {
		System.out.println("\n �Ĺ� �߰� �����Դϴ�.");
		System.out.print("�Ĺ� ���� �Է����ּ���. > ");
		String name = sc.nextLine();
		System.out.print("������ �Է����ּ���. > ");
		String type = sc.nextLine();
		pc.createPlant(name, type);
	}
	// �Ĺ� VO Ŭ������ ������ �� �� ���� �Է¹޾����Ƿ� View Ŭ���������� �ϴ� �� ���� ���� ����.
	// ����ڰ� �Է��� �Ĺ���� ������ ���� �Ĺ� ��Ͽ� �߰��ش޶�� ��û�Ϸ� ��.
	
	// 2. ��ü �Ĺ� ����� ������ִ� ���
	private void readAll() {
		System.out.println();
		System.out.println("��ü �Ĺ� ����Դϴ�.");
		List<Plant> plants = pc.readAll();
		
		// ����� ��
		// case 1. ���� ���� ���
		// case 2. ���� �ϳ��� ���
		// case 3. ���� ���� ���ϰ��
		
		if(plants.isEmpty()) {
			System.out.println("�Ĺ��� �������� �ʽ��ϴ�. ���ο� �Ĺ��� �߰��ϼ���.");
		} else {
			
			for(Plant p : plants) {
				
			}
		}
		
		
	}
	
	// 3. ����ڰ� �Ĺ��� ���� Ű���带 �Է��� �� �ִ� ȭ���� ������ִ� ���
	
	private void findByKeyword() {
		System.out.println();
		// 1. ����ڰ� �Է��� Ű���尡 ���� ���ԵǾ��ִٸ� ���
		// 2. ����ڰ� �Է��� Ű���尡 Ÿ�Կ� ���ԵǾ��ִٸ� ���
		// 3. ����ڰ� �Է��� Ű���尡 ���� �Ǵ� Ÿ�Կ� ���ԵǾ��ִٸ� ��� - o
		// 4. ����ڰ� �Է��� Ű���尡 ����� Ÿ�Կ� �� �� ���ԵǾ��ִٸ� ���
		
		
		System.out.println("�Ĺ� �˻� �����Դϴ�.");
		System.out.println("�˻�� �Է����ּ���. > ");
		String keyword = sc.nextLine();
		
		
		
		
		List<Plant> searched = pc.findByKeyword(keyword);  // Plant ���� �ּҰ��� ���� �迭�� List�� ������ �ִ� �ּҰ��� �������� ��.
		
		if(searched.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("��ȸ ����� �� " + searched.size() + "�� �����մϴ�.");
			for(Plant p: searched) {
				System.out.println("========================");
				System.out.println("�̸� : " + p.getName() + ", ���� : " + p.getType());
			}
		}
	}
	

	
	
	
	private void deletePlant() {
		
		System.out.print("�Ĺ��� �̸��� �Է����ּ���. > ");
		String name = sc.nextLine();
		System.out.print("�Ĺ��� ������ �Է����ּ���. > ");
		String type = sc.nextLine();
		
		pc.deletePlant(name, type);
		
		
		int count = pc.deletePlant(name, type);
		
		if(count > 0) {
			System.out.println("���� �Ϸ�");
			System.out.println(name + "��(��) �� " + count + "�� �����߽��ϴ�.");
		} else {
			System.out.println("������ �����͸� ã�� ���߽��ϴ�.");
		}
		System.out.println();
	}
	
	
	// 5. Ư�� �Ĺ��� ������ ������ �� �ִ� ȭ���� ������ִ� ���
	private void updatePlant() {
		
		System.out.println();
		
		// 1. �̸� �޾Ƽ� �̸� ����
		// 2. Ÿ�� �޾Ƽ� Ÿ�� ����
		// 3. �̸�, Ÿ�� �޾Ƽ� �̸� ����
		// 4. �̸�, Ÿ�� �޾Ƽ� Ÿ�� ����
		// 5. �̸� �޾Ƽ� Ÿ�� ����
		// 6. Ÿ�� �޾Ƽ� �̸� ����
		// 7. �̸�, Ÿ�� �޾Ƽ� �̸�, Ÿ�� ���� -> o
		// ��� �پ��� ������ ���� �� �ִµ� �� �� � ����� ���� ������ �����ؾ� ��.
		
		// ����ڷκ��� �Ĺ��� �̸� �� Ÿ�� �Է¹ް� ��ġ�ϴ� �Ĺ� ã�Ƽ� ���ο� �Ĺ��� �̸� �� Ÿ������ �����ϴ� ���μ���
		
		System.out.println("�Ĺ� ���� ���� �����Դϴ�.");
		// 4���� ���� �Է¹޾ƾ� ��. (���� �� �˻��� ���� �̸�, Ÿ��. ������ ���� ���ο� �̸�, Ÿ��)
		System.out.println("�Ĺ� �̸� �˻� > ");
		String name = sc.nextLine();
		System.out.println("�Ĺ� Ÿ�� �˻� > ");
		String type = sc.nextLine();
		System.out.println("���ο� �Ĺ� �̸� > ");
		String newName = sc.nextLine();
		System.out.println("���ο� �Ĺ� Ÿ�� > ");
		String newType = sc.nextLine();
		
		// view�� �ϴ� �� �� ��
		boolean result = pc.updatePlant(name, type, newName, newType);
		
		if(result) {
			System.out.println("������ �Ϸ��߽��ϴ�.");
		} else {
			System.out.println("�ش� �Ĺ� �����ʹ� �������� �ʽ��ϴ�.");
			
		}
		
		
	}
	
	}
	
	

