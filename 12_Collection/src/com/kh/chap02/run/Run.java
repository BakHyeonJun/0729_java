package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import com.kh.chap02.model.vo.Plant;

public class Run {

	public static void main(String[] args) {

		/*
		 * �ڹ��� �÷����̶� : ��ǻ�Ϳ��� ���� ���� �����͸� �ٷ�� ���
		 * 
		 * Abstract Data Type(�߻��� �ڷ���) = Interface
		 * ���α׷��ֿ��� "�߻���"�̶�� ���� ��ü�� ���ٴ� �ǹ�. �߻�޼ҵ忡���� ������{}�� �������� ������, �߻� Ŭ������ �߻� �������̽������� ��ü ������ �Ұ����ϴ�.
		 * +
		 * Interface ���������δ� �ǹ̰� �����Ƿ� �̸� �������ִ� ����ü ��, Ŭ������ �ʿ��ϴ�.
		 * +
		 * �˰���(�޼ҵ�)�� �ʿ��ϴ�.
		 * 
		 * ��, �������̽�, Ŭ����, �޼ҵ带 ���ĳ��� ���� �÷���, �Ǵ� �÷��� �����ӿ�ũ��� �Ѵ�.
		 * 
		 * =====================
		 * 
		 * �迭�� �÷����� ������
		 * - �迭��
		 * 1. �迭�� ����Ϸ� �� �� �ݵ�� ũ�⸦ �Ҵ��ؾ� �ϸ�, �� �� ������ ũ��� ������ �Ұ�����.
		 * 2. �迭 �߰� ��ġ�� ���ο� ��Ҹ� �߰��ϰų� ������ �� �������� �о��ְų� ���� �ڵ带 ��� ��.
		 * 
		 * - �ݸ�, �÷�����
		 * 1. ũ���� ������ ����(ó�� ���� ũ�� �������� �ʾƵ� ����� �� ����. ���� ��Ұ� �߰��Ǹ鼭 ������ ũ�⸦ �Ѿ�� ��Ȳ�� �߻��ϸ� �˾Ƽ� Ȯ���)
		 * 2. �߰��� ���� �߰��ϰų� �����ϴ� ��쿡�� ������ ���� �о��ְų� ����ִ� ������ �̹� �����Ǿ� ����. ���� �׶��׋� �ʿ��� �޼ҵ���� ȣ���Ͽ� ����ϱ⸸ �ϸ� ��.
		 * 
		 * - �迭�� ��� �ϳ��� Ÿ���� �ڷ����� ����� �� ������, �÷����� ���� Ÿ���� �����͸� ������ �� ����(��, ���� Ÿ���� �����͵鸸 ��� ����� ����).
		 * 
		 * ����� �������� ������ ��Ȯ�� �������ְ�, ��ȸ�� �������� ���� �� ��� - �迭 ���
		 * �����͵��� �߰�, ����, ������ ���� �Ͼ�� ��� - �÷��� ���
		 * 
		 * �������� �÷����� ����
		 * 
		 * - List �迭 : �ٷ���� �ϴ� ��(Value)�� ������. ����� ���� ����(Index ����), �ߺ����� ����. -> LinkedList, ArrayList, Vector(���ó��� ���� ������ ����)
		 * 
		 * - Set �迭 : �ٷ���� �ϴ� ��(Value)�� ������. ����� ���� �������� ������, �ߺ��� ������ ����. -> HashSet, TreeSet...
		 * 
		 * - Map �迭 : Ű(Key)�� ��(Value)�� ��Ʈ�� ������. ����� ���� �������� ������ Ű�� �ߺ� �Ұ�. ���� �ߺ� ����. -> HashMap, TreeMap, MultiValueMap, Properties...
		 * 
		 * 
		 */
		
		// ArrayList ���� ���
		// 1. �⺻������ ȣ��� �����(�⺻ ũ��� 10ĭ) : ArrayList �ĺ��� = new ArrayList();
		// 2. ���ڷ� ������ ��������ŭ�� ũ�⸦ ���� ����Ʈ�� ����� : ArrayList �ĺ��� = new ArrayList(����);
		
		
		ArrayList plants = new ArrayList(3); // ũ�� 3ĭ¥���� ArrayList�� ����ڴٴ� �ǹ�
		
		System.out.println(plants);
		
		Plant [] p = new Plant[3];
		p[0] = new Plant("�����", "ȣ����");
		p[1] = new Plant("�����", "Ȳ���");
		p[2] = new Plant("�����", "ȣ����");
		System.out.println(Arrays.toString(p));
		
		
		// 1. ����ִ� List�� ��Ҹ� �߰��� ���� Add ��ɾ ����Ͽ� Add(E e)�� ���� ������� �߰���. 
		plants.add(new Plant("�����", "ȣ����"));
		plants.add(new Plant("�����", "Ȳ���"));
		plants.add(new Plant("�����Ĺ�", "������"));
		plants.add("�Ĺ� ��");
		System.out.println(plants);
		
		// ���� Objecct[]�� ũ�⸦ �Ѿ�� ��Ұ� �߰��� ���
		// Array.copyOf �޼ҵ带 �̿��Ͽ� ���� ����� �� ū �迭�� �Ҵ���
		// Object Ÿ������ ��Ҹ� �����ϱ� ������ ���� �ڷ����� ��Ҹ� �ϳ��� ����Ʈ�� ���� �� ����.
		System.out.println(plants.toString());
		
		// add �޼ҵ� ȣ��� �����ε��� ������ �޼ҵ带 ���
		// add(int index, E e) : List�� index�� ������ ��Ҹ� �߰�
		
		plants.add(0, "�Ĺ� ����~");
		plants.add(3, new Plant("�����Ĺ�", "ȫ�����"));
		
		
		// 2. ��Ҹ� �����ϴ� �޼ҵ�
		// set(int index, E e) : List�� index ��ġ�� ���� ���޵� ���(e)�� set ���ִ� �޼ҵ�
		plants.set(0, "����");
		
		System.out.println(plants);
		
		// 3. ��Ҹ� �����ϴ� ���
		// remove(int index) : List�� index ��ġ�� ��� ��Ҹ� �����ϴ� �޼ҵ�
		plants.remove(0); // �� ��쿡�� ���� �����ϴ� index ���� �ʰ��ϴ� ���� ���� ��� IndexOutOfBoundsException ������ �߻���.
		System.out.println(plants);
		String str = (String)plants.remove(4); // �׳� �̾Ƴ� ��� 4�� �ε����� "�Ĺ� ��"�� String �����̱� �ϳ� ��ü �ڷ�� Object�� �����ǰ� �־����Ƿ� �ڷ��� ����ġ�� ������ �߻���. ���� (String)�� ����־� �ٿ�ĳ������ ���־�� ��.
		
		Plant goldDragonCrown = (Plant)plants.remove(1); // �� ��쵵 ���������� �ٿ�ĳ������ �ʿ���.
		System.out.println(goldDragonCrown.getType() + "���� " + goldDragonCrown.getName() + "�� �����Ǿ����ϴ�.");
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		// 4. ����Ʈ�� ũ�⸦ ��ȯ�ޱ�
		// size() : ����Ʈ�� ����ִ� ����� ����
		System.out.println(plants.size());
		System.out.println("������ �ε��� : " + (plants.size() - 1));
		
		// 5. List�� �ش� index ��ġ�� ��� ��Ҹ� ��ȯ�޴� �޼ҵ�
		// get(int index) : E
		System.out.println(plants);
		Plant plant = (Plant)plants.get(0);
		System.out.println(plant);
		
		// 1�� �ε����� ��ġ�� �Ĺ��� �̸��� ������ �����ؼ� Ȱ���ϰ� ���� ���
		String hongkongTree = ((Plant)plants.get(1)).getName(); // ��Ӱ� �������� ��ҷ� ���� �̷� ������ �Է��ؾ� getName�� �۵��ϰ� ��.
		System.out.println(hongkongTree);
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("�Ĺ� ���� : " + ((Plant)plants.get(i)).getType());
		}
		
		// ���� for�� -> ���� ��ȸ�ϴ� �������� ��밡��
		// for(���� �޾��� ���� : ���������� ��ҿ� ������ �迭 �Ǵ� �÷���) {}
		for(Object p2 : plants) {
			System.out.println(p2.toString()); // �������ε� - ��Ÿ�ӽ� 
		}
		
		// 6. ����Ʈ �ڸ���
		// subList(int index1, int index2) : List
		// index1���� index2������ ��Ҹ� �����ؼ� ���ο� ����Ʈ�� ��ȯ�ϰ��� �� ���
		List sub = plants.subList(0, 1);
		System.out.println(sub);
		
		// 7. ����Ʈ�� ��Ҹ� ��â �߰��ϱ�
		// addAll(Collection c) : �ش� ����Ʈ�� �ٸ� �÷��ǿ� �ִ� ��ҵ��� ���� �߰����ִ� �޼ҵ�
		/*ArrayList l;
		LinkedList i;
		Vector v;
		HashSet h;
		TreeSet t;
		*/
		plants.addAll(sub);
		System.out.println(plants); // ����Ʈ�� ������ ��(Value)�� �ߺ��� �� ����.
		
		// 8. ����Ʈ�� ���� ��Ұ� �ִ��� ������ �Ǻ��ϴ� �޼ҵ�
		// isEmpty() : ����Ʈ�� ��Ұ� �������� �ʴ´ٸ� true / ��Ұ� �ϳ��� ������ false ������ ��.
		
		System.out.println(plants.isEmpty());
		plants.clear(); // ��Ҹ� ���� ���� ��ɾ�
		System.out.println(plants.isEmpty()); // ���� ���� �� ���°� �Ǿ����Ƿ� ������ true�� �ٲ�� ��.
	}

}
