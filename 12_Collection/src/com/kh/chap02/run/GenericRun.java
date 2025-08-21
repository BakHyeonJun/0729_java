package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {

		/*
		 * 제네릭
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할 수 있는 기능
		 * -> 명시적으로는 <Integer>, <Plant>와 같이 표현
		 * -> 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수도 있음.
		 * 
		 * 별도의 제네릭 없이 컬렉션 객체 생성(E == Object)
		 * 1. 다룰 요소의 타입을 제한할 ㅅㅇ
		 * 
		 */
		
		
		ArrayList plants = new ArrayList();
		plants.add(new Plant("관엽식물", "산세베리아"));
		plants.add(new Plant());
		plants.add(new Plant("관엽식물", "폴리샤스"));
		/*plants.add(1); //
		plants.add(1.1); */
		// 이 두 경우와 같은 기본자료형 값들이 Object로 추가되는 것이 가능한가? -> 기본자료형을 참조자료형으로 포장해주는 것을 Wrapper class라고 함.(빠졌을 때 수업 한 부분)
		
		/*Plant p  = plants.get[0];
		
		for(Plant plant : plants) {
			System.out.println(plant);*/
		}
		
		
		
		
	}


