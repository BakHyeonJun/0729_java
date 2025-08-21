package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

// Controller : ����ڰ� View�� ���� ��û���� ��
// ��û�� �޾� ó������ �� �ٽ� ó������� View�� ��ȯ����.

public class PlantController {

	
	private List<Plant> plants = new ArrayList();
	private PlantDao pd = new PlantDao();
	
	// �ʱ�ȭ���
	{
		plants.add(new Plant("�Ƚø���", "����"));
	}
	
	public void createPlant(String name, String type) {
		
		Plant plant = new Plant(name, type);
		
		// �Ĺ� ����ҿ� ���ο� �Ĺ��� �߰�
		// �ʵ�� ������ �ִ� List�� �ʵ�� ������ �ִ� Object[]�� ��ҷ� �߰�
		
		plants.add(plant);
		
		System.out.println("�����մϴ�. ���ο� �Ĺ��� �߰��Ǿ����ϴ�.");
		
	}
	
	public List<Plant> readAll() {
		return plants;
	}
	
	public int deletePlant(String name, String type) {
		// ����ڰ� �Է��� �Ĺ��̸� + �Ĺ������� ��ġ�ϴ� �ʵ尪�� ���� Plant ��ü�� �����Ϸ� ��
		// case 1. ������ �̸� �� ������ ���� �Ĺ��� �������� ���� ���
		// case 2. ������ �̸� �� ������ ���� �Ĺ��� �ϳ� ������ ���
		// case 3. ������ �̸� �� ������ ���� �Ĺ��� ���� �� ������ ���
		// ����/���� ���ο� ���� View���� ��ȯ���� �ٸ��� �����־�� ��.
		
		// �Ĺ� ������ ���� �� ���ŵ� ��ü�� ~
		
		
		
		// ��Ұ� ������ ������ �������� ������Ű�� ������ ������ ��ȯ��� ��.
		int count = 0;

		for(int i = 0; i < plants.size(); i++) {
			if(name.equals(plants.get(i).getName()) &&
			type.equals(plants.get(i).getType())) {
				
				plants.remove(plants.get(i));
				count++;
			}
		}
		
		return count;
		
		
	}

	// PlantView�κ��� �Ĺ� �˻� ��û�� ���� �� ȣ��Ǵ� �޼ҵ�
	public List<Plant> findByKeyword(String keyword) {
		
		// 1. Plant[] -> �׷��� �˻� ����� �� ���� ������ �� �� �����Ƿ� �� ĭ¥�� �迭������ �̸� Ư���ϴ� ���� �Ұ�
		// 2. List<Plant>
		List<Plant> searched = new ArrayList();
		
		// �Ĺ��� �̸� �Ǵ� Ÿ�Կ� ����ڰ� �Է��� Ű���尡 ���ԵǾ����� ��� ��� �����ͼ� ����ϵ��� �ϴ� ��
		// ��ȸ -> ����ڰ� �Է��� Ű���尡 ���Ե� Plant ��ü�� �ʵ尪�� Ȯ��
		// plants�� ��Ҹ� ���� ������ Ȯ���ϸ鼭 üũ
		
		// 1. plants�� ����� ������ŭ �ݺ�
		for(int i = 0; i < plants.size(); i++) {
			// 2. ��Ҹ� ������ ����
			Plant plant = plants.get(i);
			// 2_2. plant ��ü�� name �ʵ� Ȥ�� type �ʵ忡 ����ڰ� �Է��� keyword�� ���ԵǾ� �ִٸ�
			if(plant.getName().contains(keyword) || 
			plant.getType().contains(keyword)) {
				searched.add(plant);
			}
			
		}
		return searched;
		
	}
	
	public boolean updatePlant(String name, String type, String newName, String newType) { // �Ϲ������δ� public int�� ���� �˻������ ��ġ�ϴ� �͵��� ������ �ľ��ϰ� ��� �����ϴ� ���� �⺻���� ���ٹ��̰�����, ���⼭�� boolean Ÿ������ �����غ�.
		
		// ��û ó��
		
		
		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i);
			if(name.equals(p.getName()) &&
			type.equals(p.getType())) {
				// ��ġ�ϴ� �Ĺ��� �����ϴ� ���, ����ڰ� �Է��� �� �̸� �� �� Ÿ���� ����
				// plants.set(i, new Plant(newName, newType)); // set�� ù ��° ������ �ε��� ��ġ�� ��Ҹ� �� ��° ���ڷ� �����ϴ� �޼ҵ�. �� ����� �����ϳ�
				p.setName(newName);
				p.setType(newType); // �� ����� �� ������
		return true;		 		
			} 
			
			
			
		}
		return false;
				
	}
	
	public void outputFile() {
		pd.outputFile(plants);
	
	}
}
