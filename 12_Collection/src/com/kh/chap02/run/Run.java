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
		 * 자바의 컬렉션이란 : 컴퓨터에서 여러 개의 데이터를 다루는 방법
		 * 
		 * Abstract Data Type(추상적 자료형) = Interface
		 * 프로그래밍에서 "추상적"이라는 말은 실체가 없다는 의미. 추상메소드에서는 스코프{}가 존재하지 않으며, 추상 클래스와 추상 인터페이스에서는 객체 생성이 불가능하다.
		 * +
		 * Interface 독자적으로는 의미가 없으므로 이를 구현해주는 구현체 즉, 클래스가 필요하다.
		 * +
		 * 알고리즘(메소드)도 필요하다.
		 * 
		 * 즉, 인터페이스, 클래스, 메소드를 합쳐놓은 것을 컬렉션, 또는 컬렉션 프레임워크라고 한다.
		 * 
		 * =====================
		 * 
		 * 배열과 컬렉션의 차이점
		 * - 배열은
		 * 1. 배열을 사용하려 할 때 반드시 크기를 할당해야 하며, 한 번 지정된 크기는 변경이 불가능함.
		 * 2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어주거나 당기는 코드를 써야 함.
		 * 
		 * - 반면, 컬렉션은
		 * 1. 크기의 제약이 없음(처음 사용시 크기 지정하지 않아도 사용할 수 있음. 만약 요소가 추가되면서 기존의 크기를 넘어서는 상황이 발생하면 알아서 확장됨)
		 * 2. 중간에 값을 추가하거나 삭제하는 경우에도 기존의 값을 밀어주거나 당겨주는 로직이 이미 구현되어 있음. 따라서 그때그떄 필요한 메소드들을 호출하여 사용하기만 하면 됨.
		 * 
		 * - 배열의 경우 하나의 타입의 자료형만 사용할 수 있으나, 컬렉션은 여러 타입의 데이터를 관리할 수 있음(단, 같은 타입의 데이터들만 묶어서 사용이 가능).
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져있고, 조회의 목적으로 쓰려 할 경우 - 배열 사용
		 * 데이터들의 추가, 수정, 삭제가 많이 일어나는 경우 - 컬렉션 사용
		 * 
		 * 개념적인 컬렉션의 종류
		 * 
		 * - List 계열 : 다루고자 하는 값(Value)만 저장함. 저장시 순서 유지(Index 존재), 중복값도 허용됨. -> LinkedList, ArrayList, Vector(오늘날은 거의 쓰이지 않음)
		 * 
		 * - Set 계열 : 다루고자 하는 값(Value)만 저장함. 저장시 순서 유지되지 않으며, 중복값 허용되지 않음. -> HashSet, TreeSet...
		 * 
		 * - Map 계열 : 키(Key)와 값(Value)를 세트로 저장함. 저장시 순서 유지되지 않으며 키는 중복 불가. 값은 중복 허용됨. -> HashMap, TreeMap, MultiValueMap, Properties...
		 * 
		 * 
		 */
		
		// ArrayList 생성 방법
		// 1. 기본생성자 호출로 만들기(기본 크기는 10칸) : ArrayList 식별자 = new ArrayList();
		// 2. 인자로 전달한 정수값만큼의 크기를 가진 리스트로 만들기 : ArrayList 식별자 = new ArrayList(정수);
		
		
		ArrayList plants = new ArrayList(3); // 크기 3칸짜리인 ArrayList를 만들겠다는 의미
		
		System.out.println(plants);
		
		Plant [] p = new Plant[3];
		p[0] = new Plant("서양란", "호접란");
		p[1] = new Plant("동양란", "황룡관");
		p[2] = new Plant("서양란", "호접란");
		System.out.println(Arrays.toString(p));
		
		
		// 1. 비어있는 List에 요소를 추가할 때도 Add 명령어를 사용하여 Add(E e)와 같은 방식으로 추가함. 
		plants.add(new Plant("서양란", "호접란"));
		plants.add(new Plant("동양란", "황룡관"));
		plants.add(new Plant("관엽식물", "금전수"));
		plants.add("식물 끝");
		System.out.println(plants);
		
		// 기존 Objecct[]의 크기를 넘어서는 요소가 추가될 경우
		// Array.copyOf 메소드를 이용하여 깊은 복사로 더 큰 배열로 할당함
		// Object 타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트에 담을 수 있음.
		System.out.println(plants.toString());
		
		// add 메소드 호출시 오버로딩된 형태의 메소드를 사용
		// add(int index, E e) : List의 index에 전달한 요소를 추가
		
		plants.add(0, "식물 시작~");
		plants.add(3, new Plant("관엽식물", "홍콩야자"));
		
		
		// 2. 요소를 수정하는 메소드
		// set(int index, E e) : List의 index 위치에 값을 전달된 요소(e)로 set 해주는 메소드
		plants.set(0, "시작");
		
		System.out.println(plants);
		
		// 3. 요소를 삭제하는 경우
		// remove(int index) : List의 index 위치에 담긴 요소를 삭제하는 메소드
		plants.remove(0); // 이 경우에도 현재 존재하는 index 값을 초과하는 값을 넣을 경우 IndexOutOfBoundsException 에러가 발생함.
		System.out.println(plants);
		String str = (String)plants.remove(4); // 그냥 뽑아낼 경우 4번 인덱스의 "식물 끝"은 String 형태이긴 하나 전체 자료는 Object로 관리되고 있었으므로 자료형 불일치의 문제가 발생함. 따라서 (String)을 집어넣어 다운캐스팅을 해주어야 함.
		
		Plant goldDragonCrown = (Plant)plants.remove(1); // 이 경우도 마찬가지로 다운캐스팅이 필요함.
		System.out.println(goldDragonCrown.getType() + "류의 " + goldDragonCrown.getName() + "이 삭제되었습니다.");
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		// 4. 리스트의 크기를 반환받기
		// size() : 리스트에 담겨있는 요소의 개수
		System.out.println(plants.size());
		System.out.println("마지막 인덱스 : " + (plants.size() - 1));
		
		// 5. List의 해당 index 위치에 담긴 요소를 반환받는 메소드
		// get(int index) : E
		System.out.println(plants);
		Plant plant = (Plant)plants.get(0);
		System.out.println(plant);
		
		// 1번 인덱스에 위치한 식물의 이름을 변수로 대입해서 활용하고 싶을 경우
		String hongkongTree = ((Plant)plants.get(1)).getName(); // 상속과 다형성의 요소로 인해 이런 식으로 입력해야 getName이 작동하게 됨.
		System.out.println(hongkongTree);
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("식물 종류 : " + ((Plant)plants.get(i)).getType());
		}
		
		// 향상된 for문 -> 값을 조회하는 목적으로 사용가능
		// for(값을 받아줄 변수 : 순차적으로 요소에 접근할 배열 또는 컬렉션) {}
		for(Object p2 : plants) {
			System.out.println(p2.toString()); // 동적바인딩 - 런타임시 
		}
		
		// 6. 리스트 자르기
		// subList(int index1, int index2) : List
		// index1부터 index2까지의 요소를 추출해서 새로운 리스트를 반환하고자 할 경우
		List sub = plants.subList(0, 1);
		System.out.println(sub);
		
		// 7. 리스트에 요소를 왕창 추가하기
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
		/*ArrayList l;
		LinkedList i;
		Vector v;
		HashSet h;
		TreeSet t;
		*/
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값(Value)이 중복될 수 있음.
		
		// 8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
		// isEmpty() : 리스트에 요소가 존재하지 않는다면 true / 요소가 하나라도 있으면 false 판정을 함.
		
		System.out.println(plants.isEmpty());
		plants.clear(); // 요소를 전부 비우는 명령어
		System.out.println(plants.isEmpty()); // 이후 전부 빈 상태가 되었으므로 판정이 true로 바뀌게 됨.
	}

}
