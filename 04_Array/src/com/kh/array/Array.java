package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// 매우 * 40 중요함.
	// 변수란 ? 메모리(RAM) 공간에 DATE(VALUE)값을 저장하는 공간.
	// 변수의 특징 - 1. 고유한 식별자를 가짐. 2. 공간에 새로운 값을 대입해서 사용할 수 있음. 3. 자료형이 정해져 있다. 4.
	// 지역변수의 경우 메모리의 Stack 영역에 올라간다.
	// 5. 하나의 변수공간에는 하나의 값만 대입될 수 있다.
	// 6. 초기화를 해야만 사용이 가능하다. 7. 초기화는 한 번만 가능하다. 8. 자료형은 크기가 정해져있다. 9.자료형끼리의 변환이
	// 가능하다. 10. 선언된 Scope 안에서만 사용이 가능하다. 11. 변수끼리 연산도 가능하다.

	/*
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음. 단, "같은 자료형의 값들"만 담을 수 있음. 동종
	 * 모음(homogeneous collection)이라고도 함. 자바라는 언어 자체에 내장된 유일한 자료구조 - 데이터를 어떻게 저장할
	 * 것인가?
	 * 
	 * 
	 * 
	 */

	public void method1() {
		// 임의의 정수 3개를 선언하고 초기화를 진행하고자 한다.

		/*
		 * int num1 = 1; int num2 = 153; int num3 = 3; int num4 = 51; int num5 = 9;
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5;
		 * 
		 * for(int i = 1; i <=5; i++) { sum += numi? }
		 * 
		 * System.out.println(sum);
		 */

		// 배열

		// 1. 배열 선언 - 1) 자료형 배열식별자[] 2) 자료형[] 배열식별자; -> 2번 방법을 사용할 것(주류)

		// 변수 선언
		// ex) int num;

		// 배열 선언
		// ex) int[] nums;

		// 2. 배열 할당(이걸 해주어야 사용할 수 있음) - 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정. (지정한 개수만큼 값이
		// 들어갈 공간이 할당됨.)
		// 표현법 - nums = new int[3]; -> 선언 후 할당할 때
		// int[] nums = new int[3]; -> 선언과 동시에 할당도 가능
		// 배열도 String과 같은 참조 자료형(크기가 정해져있지 않음)이다. - 주소값이 중요

		int[] nums = new int[3];

		// 3. 배열의 각 인덱스에 값 대입
		// 표현법 - 배열식별자[인덱스] = 값;

		nums[0] = 1;
		nums[1] = 153;
		nums[2] = 3;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {

			sum = sum + nums[i];
		}

		System.out.println(sum);

		// 배열의 장점 - 반복 작업을 가능하게 함.

	}

	public void methodA() {
		// 배열을 공부해보자.

		// 1. 배열선언 및 할당
		int[] integers = new int[3];
		double[] doubles = new double[2];

		// 배열식별자.length : 배열의 크기(길이) -> 정수
		System.out.println(integers.length);
		System.out.println(doubles.length);

		int i;
		// System.out.println(i); - 초기화를 진행하지 않으면 사용할 수 없음
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]);
		integers[0] = 1;

		// 기본자료형들은 변수 공간에 실제 값을 바로 담지만, 참조자료형들은 변수 공간에 주소값을 담음
		// 인포, A강의강, B강의장. C강의장, 사무실

		/*
		 *
		 * KH정보교육원종로지원 = new String[5]; System.out.println("종로점 주소 : KH정보교육원종로지원");
		 * KH정보교육원종로지원[0] = "인포" ; KH정보교육원종로지원[1] = "A강의장"; KH정보교육원종로지원[2] = "B강의장";
		 * KH정보교육원종로지원[3] = "C강의장"; KH정보교육원종로지원[4] = "사무실";
		 * 
		 * // C 강의장 출력 System.out.println(KH정보교육원종로지원[0]);
		 * System.out.println(KH정보교육원종로지원[1]); System.out.println(KH정보교육원종로지원[2]);
		 * System.out.println(KH정보교육원종로지원[3]); System.out.println(KH정보교육원종로지원[4]);
		 * System.out.println("-----반복문-----");
		 * 
		 * for (int index = 0; index < 5; index++) {
		 * System.out.println(KH정보교육원종로지원[index]); }
		 */

		int num1 = 3;
		int num2 = 3;
		System.out.println(num1 == num2); // true 값이 나오는 이유 - 변수 둘이 같은 값이므로

		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2); // false 값이 나오는 이유 - 주소값이 담기므로 서로 다른 주소값이므로.
		// 같은 이유로 문자열 == 문자열 형식의 동등 비교가 불가능한 것. - 문자열.equals("비교할 문자열"); 형태가 쓰이는 이유

		// 해시코드 : 주소값을 10진수(int형태)로 나타낸 것
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());

	}

	public void numPick() {
		// 난수 생성기 ver 0.2
		// int 형 배열을 설정하고 9칸을 할당해보자. (0~296 범위 내에서)

		int[] picks = new int[9]; // 0~8
		/*
		 * picks[0] = (int)(Math.random() * 296) + 1;
		 *
		 * picks[1] = (int)(Math.random() * 296) + 1; picks[2] = (int)(Math.random() *
		 * 296) + 1; picks[3] = (int)(Math.random() * 296) + 1; picks[4] =
		 * (int)(Math.random() * 296) + 1; picks[5] = (int)(Math.random() * 296) + 1;
		 * picks[6] = (int)(Math.random() * 296) + 1; picks[7] = (int)(Math.random() *
		 * 296) + 1; picks[8] = (int)(Math.random() * 296) + 1;
		 */
		// 중복 제거하려면 1. 중복되는 부분을 하나로 빼고 2. 중복되지 않는 부분은 변수로 처리한다.
		for (int i = 0; i < 9; i++) {
			picks[i] = (int) (Math.random() * 296) + 1;

		}
		System.out.println(Arrays.toString(picks));

	}

	public void methodB() {
		// 5개의 요소를 담을 수 있는 String형 배열을 선언 및 할당하시오.

		String[] members = new String[5];

		members[0] = "채정민";
		members[1] = "강현성";
		members[2] = "선승제";
		members[3] = "안준영";
		members[4] = "박채형";
		// members[5] = "이승욱";
		for (int i = 0; i < 5; i++) {
			System.out.println(members[i]);
		}

		// 할당된 수보다 많은 자료를 배열에 입력하였을 경우, 실행시
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at com.kh.array.Array.methodB(Array.java:176) at
		 * com.kh.run.Run.main(Run.java:13)
		 */
		// 이러한 에러 메시지가 뜨게 된다.

	}

	public void methodC() {
		// 사용자에게 세 개의 정수를 입력받아서 입력받은 정수 중 최대값 구하기
		// 배열을 선택할 때의 기준 - 1. 두 개 이상의 같은 자료형의 값을 다룰 것. 2.다룰 값의 개수가 명확하게 정해져 있을 것.

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.println("세 개의 정수를 입력받겠습니다.");
		System.out.print("정수1 : ");
		nums[0] = sc.nextInt();
		// System.out.println("첫 번째 입력된 정수 값 : " + nums[0]);
		System.out.print("정수2 : ");
		nums[1] = sc.nextInt();
		System.out.print("정수3 : ");
		nums[2] = sc.nextInt();

		if (nums[0] >= nums[1] && nums[0] >= nums[2]) {
			System.out.print("가장 큰 정수는 " + nums[0] + "입니다");
		} else if (nums[1] >= nums[0] && nums[1] >= nums[2]) {
			System.out.print("가장 큰 정수는 " + nums[1] + "입니다");
		} else {
			System.out.print("가장 큰 정수는 " + nums[2] + "입니다");
		}
		System.out.println("");

		System.out.println("세 개의 정수를 입력받겠습니다.");
		for (int i = 0; i < nums.length; i++) { // 확장성의 개선을 위해서는 어떻게 해야 할까? length 명령어를 활용한다.
			System.out.print("정수" + (i + 1) + ": ");
			nums[i] = sc.nextInt();
			System.out.println((i + 1) + "번째 입력하신 정수 : " + nums[i]);
		}
		if (nums[0] >= nums[1] && nums[0] >= nums[2]) {
			System.out.print("가장 큰 정수는 " + nums[0] + "입니다");
		} else if (nums[1] >= nums[0] && nums[1] >= nums[2]) {
			System.out.print("가장 큰 정수는 " + nums[1] + "입니다");
		} else {
			System.out.print("가장 큰 정수는 " + nums[2] + "입니다");
		}
		/*
		 * int max = nums[0]; if(max < nums[1]) { max = nums[1]; } if(max < nums[2]) {
		 * max = nums[2]; }
		 */
		// 그러나 중복되는 부분이 너무 많으므로 배열을 이용해 줄일 수 있다.

		System.out.println("");
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println("입력하신 수들 중 가장 큰 값은 " + max + "입니다.");

	}

	public void methodD() {

		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없다.
		 * 
		 * 
		 */

		String[] nameSpells = new String[3];
		nameSpells[0] = "박";
		nameSpells[1] = "현";
		nameSpells[2] = "준";
		System.out.println(Arrays.toString(nameSpells));
		nameSpells[2] = "서";
		System.out.println(Arrays.toString(nameSpells));
		System.out.println(nameSpells.hashCode());

		nameSpells = new String[4];
		nameSpells[3] = "굿";
		System.out.println(Arrays.toString(nameSpells));
		System.out.println(nameSpells.hashCode());

		/*
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 GC(Garbage Collector)가 알아서 삭제해준다 - 자동 메모리 관리.
		 * 
		 * 기존 배열식별자에 할당만 새롭게 한다면 기존에 참조하고 있던 연결이 끊기고 새로운 배열을 참조한다. 그래서 위 코드 실행시 서로 다른
		 * 결과값이 나오게 되는 것.
		 */
		// null : 아무것도 존재하지 않음을 의미하는 값
		// 참조자료형에는 null 이라는 값이 들어가는데 주소값이 존재하는가 그렇지 않은가

		nameSpells = null; // 이렇게 하면 현재 연결중인 주소값을 끊어버릴 수 있다.
		System.out.println(nameSpells);
		nameSpells[0] = "동길홍";
		// 가리키고 있는 대상이 null이므로(주소가 없으므로) 에러가 발생.
	}

	public void methodE() {
		// 그래서 과연 배열은 어디에, 주로 어떻게 쓰는가?

		/*
		 * int[] arr = new int[3]; arr[0] = 10; arr[1] = 20; arr[2] = 30;
		 * System.out.println(Arrays.toString(arr)); 통상적으로는 이렇게 쓰지 않는다.
		 */

		/*
		 * 보통은 배열 선언과 동시에 요소를 대입해서 사용한다. int[] arr = new int[] {1, 2, 3};
		 * System.out.println(Arrays.toString(arr)); 심지어 이렇게도 잘 안 씀
		 */

		int[] arr = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr));
		// 가장 간편한 방법

	}

	/*
	 * 배열 복사 - 1. 얕은 복사(이게 더 중요) 2. 깊은 복사
	 * 
	 */
	public void methodF() {
		int[] origins = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(origins));

		// 1. 얕은 복사로 배열을 복사 - 원본의 주소값을 사본에 대입하는 것. 처리법은 아래와 같음.
		int[] copies = origins;
		System.out.println(Arrays.toString(copies));
		origins[2] = 46;
		System.out.println(Arrays.toString(origins));
		System.out.println(Arrays.toString(copies));
		// 따라서 원본의 내용만 변경해도 사본의 내용이 변경되게 됨.
		System.out.println(origins.hashCode());
		System.out.println(copies.hashCode());

	}

	public void methodG() {

		// 2. 깊은 복사 - 기존의 배열보다 많은 양의 데이터가 추가로 필요하게 되었을 경우 더 큰 새로운 배열 만들면서 값 옮겨넣을 때 주로
		// 적용. 처리법은 아래와 같음.
		int[] origins = { 1, 2, 3, 4, 5 };
		int[] copies = new int[6];

		/*
		 * copies[0] = origins[0]; copies[1] = origins[1]; copies[2] = origins[2];
		 * copies[3] = origins[3]; copies[4] = origins[4]; 역시 이것보단 아래의 방법이 나음.
		 */

		for (int i = 0; i < origins.length; i++) {
			copies[i] = origins[i];
		}
		copies[5] = 2116;
		System.out.println(Arrays.toString(origins));
		System.out.println(Arrays.toString(copies));
		
		// 유용한 단축키들
		// 행 전체를 이동하고자 할 경우 알트 + 위/아래
		// 행 전체를 복사하고자 할 경우 컨트롤 알트 + 위/아래
		// 행 전체를 지우고자 할 경우 컨트롤 + d
		// 행을 주석화하고자 할 경우 컨트롤 + /
		// 코드를 계층별로 깔끔하게 정리하고자 할 경우 컨트롤 쉬프트 + f
		
		
		// 깊은 복사 처리방식 2
		
		int[] copies2 = new int[10];
		
		System.arraycopy(origins, 0, copies2, 0, 5);
		System.out.println(Arrays.toString(copies2));
		System.arraycopy(copies, 1, copies2, 5, 5);
		System.out.println(Arrays.toString(copies2));
		
		/*
		 * 네이밍컨벤션 - 첫 글자가 대문자인 것들 - 클래스, 인터페이스
		 * System 명령어의 첫 글자가 대문자라는 점에서 System은 클래스로 분류된다는 것을 알 수 있다. Arrays 역시 마찬가지.
		 * 
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스, 복사본 배열 식별자, 복사본 배ㅕㅇㄹ에서 복사가 시작될 인덱스, 복사할 개수); - 이러한 형태로 써주어야 함.
		 */
		
		// 아래 방법은 크기를 늘린 배열을 새로 만들어내는데 특화된 방법.
		int[] copies3 = Arrays.copyOf(origins,  15);
		System.out.println(Arrays.toString(copies3));
		
		//
		int[] copies4 = origins.clone();
		System.out.println(Arrays.toString(copies4));
		

	}
	
		
}
