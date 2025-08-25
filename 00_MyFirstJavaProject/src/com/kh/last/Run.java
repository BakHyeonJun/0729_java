package com.kh.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

	
	/*
	 * 스트림의 주요 중간 연산
	 * 
	 * 1. filter() : 조건에 부합하는 요소만 필터링할 때
	 * 2. map() : 요소를 반환할 때
	 * 3. distinct() : 요소의 중복을 제거할 때
	 * 
	 * Stream의 주요 최종 연산
	 * 
	 * 1. collect() : 결과를 컬렉션으로 변환
	 * 2. forEach() : 모든 요소에 대한 작업 수행할 때
	 * 3. count() : 요소의 개수 반환할 때
	 * 4. reduce() : 요소를 결합하여 단일 결과 만들어낼 때
	 */
	
	
	public static void main(String[] args) {

		
		List<String> names = Arrays.asList("홍길동", "고길동", "짱구");
		for(String name : names) {
			System.out.println(name + "은(는) 못 말려");
		}
		
		// 아래와 같은 방식으로도 가능함.
		
		System.out.println("==========================");
		names.stream()
			 .map(name -> name + "은(는) 못 말려")
			 .forEach(System.out::println);
		
		// 스트림 - 컬렉션, 배열 등의 데이터를 선언적으로 처리해주는 API
		// for 문은 어떻게 반복할지를 구체적으로 밝히는 데 반해,
		// 함수형은 무엇을 할지 행위에 집중한다.
		// 파이프라이닝을 통해 여러 연산을 연결하는 것이 가능하다.
		
		System.out.println("==========================");
		
		// 60점 이상인 점수들의 평균을 구하고자 할 때
		
		int[] scores = {88, 50, 72, 90, 100, 20, 40, 88}; // 이러한 점수들이 존재한다고 가정할 때, 조건에 부합하는 데이터들을 추출하여 연산을 시행해야 함.
		int sum = 0;
		int count = 0;
		
		for(int score : scores) {
			if(score >= 60) {
				sum += score;
				count++;
			}
		}
		
		double average = (double) sum  / count;
		System.out.println(average);
		
		// 이 프로세스 역시 아래와 같이 처리 가능
		
		double streamAvg = Arrays.stream(scores)
								 .filter(score -> score >= 60)
								 .average()
								 .orElse(0.0);
		System.out.println(streamAvg);
		
		/*
		 * 메소드식별자(매개변수) {
		 * return 값;
		 * } 
		 * 
		 * print(int a){
		 * return a;
		 * }
		 * 
		 * 이상과 같이 생긴함수가 존재한다고 할 때 아래와 같이 대체 가능함.
		 * 
		 * (int a) -> {
		 * return a:
		 * }
		 * 
		 * (int a) -> return a:
		 * 
		 * (int a) -> a;
		 * 
		 * (a) -> a;
		 * 
		 * 매개변수가 하나뿐일 경우는 괄호도 생략 가능함.
		 * 
		 * a -> a;
		 */
		// 익명클래스 -> 선언과 동시에 객체를 생성하는 것
		SimpleCal adder = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
			
		};
		SimpleCal minuser = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a - b;
			}
		};
	System.out.println("5 + 3 = " + adder.cal(5, 3));
	System.out.println("5 - 3 = " + minuser.cal(5, 3));

	// map(), filter()
	
	// filter() -> 조건에 맞는 것만 필터링할 수 있음. if 문의 역할에 해당
	List<String> coffee = Arrays.asList("아메리카노", "카페라떼", "콜드브루", "에스프레소", "카푸치노");
	List<String> longNameCoffee = new ArrayList();
	
	for(String c : coffee) {
		if(c.length() == 5) {
			longNameCoffee.add(c);
		}
	}
	System.out.println(longNameCoffee);
	
	List<String> coffeeList = coffee.stream()
									.filter(c -> c.length() == 5)
									.collect(Collectors.toList());
	System.out.println(coffeeList);
	
	
	// map -> 스트림을 이용하여 데이터를 변환하는 용도
	List<Integer> nameLength = new ArrayList();
	for(String name : coffee) {
		nameLength.add(name.length());
	}
	System.out.println(nameLength);
	
	List<Integer> lengths = coffee.stream()
								  //.map(c -> c.length())
								  .map(String::length) // 이런 식으로도 대체 가능
								  .collect(Collectors.toList());
	System.out.println(lengths);
	coffee.stream().map(c -> c + "의 길이 : " + c.length())
				   //.forEach(l -> System.out.println(l));
				   .forEach(System.out::println); // 이런 식으로 대체도 가능
	
	System.out.println("======================");
	
	List<Person> people = Arrays.asList(
			new Person("홍길동", "한양", 15),
			new Person("고길동", "서울", 40),
			new Person("성춘향", "남원", 16),
			new Person("콩쥐", "한양", 16)
	);
		System.out.println("서울 사람 출력하기");
		System.out.println("기존 방식에 따르면");
		for(Person person : people) {
			if("서울".equals(person.getAddress())) {
				System.out.println(person);
			}
		}
		System.out.println("스트림 방식");
		people.stream().filter(person -> "서울".equals(person.getAddress()))
					   .forEach(System.out::println);
	
		// 이름과 주소 출력하기
		System.out.println("기존의 방식으로는");
		for(Person person : people) {
			System.out.println(person.getName() + "님은 " + person.getAddress() + "에 삽니다.");
		}
		
		System.out.println("스트림 방식으로는");
		people.stream().map(person -> person.getName() + "님은 " + person.getAddress() + "에 삽니다.")
					   .forEach(System.out::println);
		
	}
	
	// 함수형 인터페이스 선언
	@FunctionalInterface // 인터페이스 함수형이라고 적어두면 컴파일러가 그렇게 인식하게 됨.
	interface SimpleCal{
		int cal(int a, int b); // 하나의 추상메소드만 가지고 있어야 함.
	}
	
}
