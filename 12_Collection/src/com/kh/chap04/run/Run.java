package com.kh.chap04.run;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// HashMap
		// ǥ���� - Map ��ü�̸� = new HashMap();
		
		
		// ~ Map�� ����ִ� ��� ��ҵ鿡 ���������� �����ؾ� �Ѵٸ�?
		// for ��, ���� for ��, while �� �� ���� ���� �ݺ����� ��� �Ұ�.
		// addAll(Collection c) -> �� ��� �Ұ�.
		// Iterator -> �� ��� �Ұ�.
		
		// ~ ���߿� ä������ ��.
		
		// 1) keyset() ȣ���ϱ�
		
		// 1_1> Map�� ������ �ִ� Key�鸸 Set�� ��´�.
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishset);
		
		// 1_2> Set�� Iterator�� ���
		Iterator<String> itKey = fishSet.iterator();
		
		// 1_3> �ݺ��� ����ϱ�
		while(itKey.hasNext()) {
			String Key = itKey.next();
			System.out.println(key + "----------" + aquarium.get(key));
		} // ������ �ϳ� �׸� ���� ����� �ƴ�.
		
		
		// 2) entrySet()�� �̿��ϴ� ���
		
		// 2_1> Map�� ������ �ִ� Key-Value ��Ʈ�� Set�� ���
		Set<Entry<String, Fish>> entrySet = aquarium.entrySet();
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() + "::::::::::" + e.getValue());
		}
		
		
	}

}
