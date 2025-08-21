package com.kh.chap04.run;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// HashMap
		// 표현법 - Map 객체이름 = new HashMap();
		
		
		// ~ Map에 들어있는 모든 요소들에 순차적으로 접근해야 한다면?
		// for 문, 향상된 for 문, while 문 등 여태 나온 반복문들 사용 불가.
		// addAll(Collection c) -> 도 사용 불가.
		// Iterator -> 도 사용 불가.
		
		// ~ 나중에 채워넣을 것.
		
		// 1) keyset() 호출하기
		
		// 1_1> Map이 가지고 있는 Key들만 Set에 담는다.
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishset);
		
		// 1_2> Set을 Iterator에 담기
		Iterator<String> itKey = fishSet.iterator();
		
		// 1_3> 반복문 사용하기
		while(itKey.hasNext()) {
			String Key = itKey.next();
			System.out.println(key + "----------" + aquarium.get(key));
		} // 가능은 하나 그리 좋은 방법은 아님.
		
		
		// 2) entrySet()을 이용하는 방법
		
		// 2_1> Map이 가지고 있는 Key-Value 세트를 Set에 담기
		Set<Entry<String, Fish>> entrySet = aquarium.entrySet();
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() + "::::::::::" + e.getValue());
		}
		
		
	}

}
