package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// �ſ� * 40 �߿���.
	// ������ ? �޸�(RAM) ������ DATE(VALUE)���� �����ϴ� ����.
	// ������ Ư¡ - 1. ������ �ĺ��ڸ� ����. 2. ������ ���ο� ���� �����ؼ� ����� �� ����. 3. �ڷ����� ������ �ִ�. 4.
	// ���������� ��� �޸��� Stack ������ �ö󰣴�.
	// 5. �ϳ��� ������������ �ϳ��� ���� ���Ե� �� �ִ�.
	// 6. �ʱ�ȭ�� �ؾ߸� ����� �����ϴ�. 7. �ʱ�ȭ�� �� ���� �����ϴ�. 8. �ڷ����� ũ�Ⱑ �������ִ�. 9.�ڷ��������� ��ȯ��
	// �����ϴ�. 10. ����� Scope �ȿ����� ����� �����ϴ�. 11. �������� ���굵 �����ϴ�.

	/*
	 * �迭(Array) : �ϳ��� �迭�� ���� ���� ���� ���� �� ����. ��, "���� �ڷ����� ����"�� ���� �� ����. ����
	 * ����(homogeneous collection)�̶�� ��. �ڹٶ�� ��� ��ü�� ����� ������ �ڷᱸ�� - �����͸� ��� ������
	 * ���ΰ�?
	 * 
	 * 
	 * 
	 */

	public void method1() {
		// ������ ���� 3���� �����ϰ� �ʱ�ȭ�� �����ϰ��� �Ѵ�.

		/*
		 * int num1 = 1; int num2 = 153; int num3 = 3; int num4 = 51; int num5 = 9;
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5;
		 * 
		 * for(int i = 1; i <=5; i++) { sum += numi? }
		 * 
		 * System.out.println(sum);
		 */

		// �迭

		// 1. �迭 ���� - 1) �ڷ��� �迭�ĺ���[] 2) �ڷ���[] �迭�ĺ���; -> 2�� ����� ����� ��(�ַ�)

		// ���� ����
		// ex) int num;

		// �迭 ����
		// ex) int[] nums;

		// 2. �迭 �Ҵ�(�̰� ���־�� ����� �� ����) - �迭�� �� ���� ���� ���� �迭�� ũ�⸦ �����ִ� ����. (������ ������ŭ ����
		// �� ������ �Ҵ��.)
		// ǥ���� - nums = new int[3]; -> ���� �� �Ҵ��� ��
		// int[] nums = new int[3]; -> ����� ���ÿ� �Ҵ絵 ����
		// �迭�� String�� ���� ���� �ڷ���(ũ�Ⱑ ���������� ����)�̴�. - �ּҰ��� �߿�

		int[] nums = new int[3];

		// 3. �迭�� �� �ε����� �� ����
		// ǥ���� - �迭�ĺ���[�ε���] = ��;

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

		// �迭�� ���� - �ݺ� �۾��� �����ϰ� ��.

	}

	public void methodA() {
		// �迭�� �����غ���.

		// 1. �迭���� �� �Ҵ�
		int[] integers = new int[3];
		double[] doubles = new double[2];

		// �迭�ĺ���.length : �迭�� ũ��(����) -> ����
		System.out.println(integers.length);
		System.out.println(doubles.length);

		int i;
		// System.out.println(i); - �ʱ�ȭ�� �������� ������ ����� �� ����
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]);
		integers[0] = 1;

		// �⺻�ڷ������� ���� ������ ���� ���� �ٷ� ������, �����ڷ������� ���� ������ �ּҰ��� ����
		// ����, A���ǰ�, B������. C������, �繫��

		/*
		 *
		 * KH������������������ = new String[5]; System.out.println("������ �ּ� : KH������������������");
		 * KH������������������[0] = "����" ; KH������������������[1] = "A������"; KH������������������[2] = "B������";
		 * KH������������������[3] = "C������"; KH������������������[4] = "�繫��";
		 * 
		 * // C ������ ��� System.out.println(KH������������������[0]);
		 * System.out.println(KH������������������[1]); System.out.println(KH������������������[2]);
		 * System.out.println(KH������������������[3]); System.out.println(KH������������������[4]);
		 * System.out.println("-----�ݺ���-----");
		 * 
		 * for (int index = 0; index < 5; index++) {
		 * System.out.println(KH������������������[index]); }
		 */

		int num1 = 3;
		int num2 = 3;
		System.out.println(num1 == num2); // true ���� ������ ���� - ���� ���� ���� ���̹Ƿ�

		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2); // false ���� ������ ���� - �ּҰ��� ���Ƿ� ���� �ٸ� �ּҰ��̹Ƿ�.
		// ���� ������ ���ڿ� == ���ڿ� ������ ���� �񱳰� �Ұ����� ��. - ���ڿ�.equals("���� ���ڿ�"); ���°� ���̴� ����

		// �ؽ��ڵ� : �ּҰ��� 10����(int����)�� ��Ÿ�� ��
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());

	}

	public void numPick() {
		// ���� ������ ver 0.2
		// int �� �迭�� �����ϰ� 9ĭ�� �Ҵ��غ���. (0~296 ���� ������)

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
		// �ߺ� �����Ϸ��� 1. �ߺ��Ǵ� �κ��� �ϳ��� ���� 2. �ߺ����� �ʴ� �κ��� ������ ó���Ѵ�.
		for (int i = 0; i < 9; i++) {
			picks[i] = (int) (Math.random() * 296) + 1;

		}
		System.out.println(Arrays.toString(picks));

	}

	public void methodB() {
		// 5���� ��Ҹ� ���� �� �ִ� String�� �迭�� ���� �� �Ҵ��Ͻÿ�.

		String[] members = new String[5];

		members[0] = "ä����";
		members[1] = "������";
		members[2] = "������";
		members[3] = "���ؿ�";
		members[4] = "��ä��";
		// members[5] = "�̽¿�";
		for (int i = 0; i < 5; i++) {
			System.out.println(members[i]);
		}

		// �Ҵ�� ������ ���� �ڷḦ �迭�� �Է��Ͽ��� ���, �����
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at com.kh.array.Array.methodB(Array.java:176) at
		 * com.kh.run.Run.main(Run.java:13)
		 */
		// �̷��� ���� �޽����� �߰� �ȴ�.

	}

	public void methodC() {
		// ����ڿ��� �� ���� ������ �Է¹޾Ƽ� �Է¹��� ���� �� �ִ밪 ���ϱ�
		// �迭�� ������ ���� ���� - 1. �� �� �̻��� ���� �ڷ����� ���� �ٷ� ��. 2.�ٷ� ���� ������ ��Ȯ�ϰ� ������ ���� ��.

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.println("�� ���� ������ �Է¹ްڽ��ϴ�.");
		System.out.print("����1 : ");
		nums[0] = sc.nextInt();
		// System.out.println("ù ��° �Էµ� ���� �� : " + nums[0]);
		System.out.print("����2 : ");
		nums[1] = sc.nextInt();
		System.out.print("����3 : ");
		nums[2] = sc.nextInt();

		if (nums[0] >= nums[1] && nums[0] >= nums[2]) {
			System.out.print("���� ū ������ " + nums[0] + "�Դϴ�");
		} else if (nums[1] >= nums[0] && nums[1] >= nums[2]) {
			System.out.print("���� ū ������ " + nums[1] + "�Դϴ�");
		} else {
			System.out.print("���� ū ������ " + nums[2] + "�Դϴ�");
		}
		System.out.println("");

		System.out.println("�� ���� ������ �Է¹ްڽ��ϴ�.");
		for (int i = 0; i < nums.length; i++) { // Ȯ�强�� ������ ���ؼ��� ��� �ؾ� �ұ�? length ��ɾ Ȱ���Ѵ�.
			System.out.print("����" + (i + 1) + ": ");
			nums[i] = sc.nextInt();
			System.out.println((i + 1) + "��° �Է��Ͻ� ���� : " + nums[i]);
		}
		if (nums[0] >= nums[1] && nums[0] >= nums[2]) {
			System.out.print("���� ū ������ " + nums[0] + "�Դϴ�");
		} else if (nums[1] >= nums[0] && nums[1] >= nums[2]) {
			System.out.print("���� ū ������ " + nums[1] + "�Դϴ�");
		} else {
			System.out.print("���� ū ������ " + nums[2] + "�Դϴ�");
		}
		/*
		 * int max = nums[0]; if(max < nums[1]) { max = nums[1]; } if(max < nums[2]) {
		 * max = nums[2]; }
		 */
		// �׷��� �ߺ��Ǵ� �κ��� �ʹ� �����Ƿ� �迭�� �̿��� ���� �� �ִ�.

		System.out.println("");
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println("�Է��Ͻ� ���� �� ���� ū ���� " + max + "�Դϴ�.");

	}

	public void methodD() {

		/*
		 * �� �� �Ҵ���� �迭�� ũ�⸦ ������ �� ����.
		 * 
		 * 
		 */

		String[] nameSpells = new String[3];
		nameSpells[0] = "��";
		nameSpells[1] = "��";
		nameSpells[2] = "��";
		System.out.println(Arrays.toString(nameSpells));
		nameSpells[2] = "��";
		System.out.println(Arrays.toString(nameSpells));
		System.out.println(nameSpells.hashCode());

		nameSpells = new String[4];
		nameSpells[3] = "��";
		System.out.println(Arrays.toString(nameSpells));
		System.out.println(nameSpells.hashCode());

		/*
		 * ������ ���� ������ �迭�� ���� �ð��� ������ GC(Garbage Collector)�� �˾Ƽ� �������ش� - �ڵ� �޸� ����.
		 * 
		 * ���� �迭�ĺ��ڿ� �Ҵ縸 ���Ӱ� �Ѵٸ� ������ �����ϰ� �ִ� ������ ����� ���ο� �迭�� �����Ѵ�. �׷��� �� �ڵ� ����� ���� �ٸ�
		 * ������� ������ �Ǵ� ��.
		 */
		// null : �ƹ��͵� �������� ������ �ǹ��ϴ� ��
		// �����ڷ������� null �̶�� ���� ���µ� �ּҰ��� �����ϴ°� �׷��� ������

		nameSpells = null; // �̷��� �ϸ� ���� �������� �ּҰ��� ������� �� �ִ�.
		System.out.println(nameSpells);
		nameSpells[0] = "����ȫ";
		// ����Ű�� �ִ� ����� null�̹Ƿ�(�ּҰ� �����Ƿ�) ������ �߻�.
	}

	public void methodE() {
		// �׷��� ���� �迭�� ���, �ַ� ��� ���°�?

		/*
		 * int[] arr = new int[3]; arr[0] = 10; arr[1] = 20; arr[2] = 30;
		 * System.out.println(Arrays.toString(arr)); ��������δ� �̷��� ���� �ʴ´�.
		 */

		/*
		 * ������ �迭 ����� ���ÿ� ��Ҹ� �����ؼ� ����Ѵ�. int[] arr = new int[] {1, 2, 3};
		 * System.out.println(Arrays.toString(arr)); ������ �̷��Ե� �� �� ��
		 */

		int[] arr = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr));
		// ���� ������ ���

	}

	/*
	 * �迭 ���� - 1. ���� ����(�̰� �� �߿�) 2. ���� ����
	 * 
	 */
	public void methodF() {
		int[] origins = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(origins));

		// 1. ���� ����� �迭�� ���� - ������ �ּҰ��� �纻�� �����ϴ� ��. ó������ �Ʒ��� ����.
		int[] copies = origins;
		System.out.println(Arrays.toString(copies));
		origins[2] = 46;
		System.out.println(Arrays.toString(origins));
		System.out.println(Arrays.toString(copies));
		// ���� ������ ���븸 �����ص� �纻�� ������ ����ǰ� ��.
		System.out.println(origins.hashCode());
		System.out.println(copies.hashCode());

	}

	public void methodG() {

		// 2. ���� ���� - ������ �迭���� ���� ���� �����Ͱ� �߰��� �ʿ��ϰ� �Ǿ��� ��� �� ū ���ο� �迭 ����鼭 �� �Űܳ��� �� �ַ�
		// ����. ó������ �Ʒ��� ����.
		int[] origins = { 1, 2, 3, 4, 5 };
		int[] copies = new int[6];

		/*
		 * copies[0] = origins[0]; copies[1] = origins[1]; copies[2] = origins[2];
		 * copies[3] = origins[3]; copies[4] = origins[4]; ���� �̰ͺ��� �Ʒ��� ����� ����.
		 */

		for (int i = 0; i < origins.length; i++) {
			copies[i] = origins[i];
		}
		copies[5] = 2116;
		System.out.println(Arrays.toString(origins));
		System.out.println(Arrays.toString(copies));
		
		// ������ ����Ű��
		// �� ��ü�� �̵��ϰ��� �� ��� ��Ʈ + ��/�Ʒ�
		// �� ��ü�� �����ϰ��� �� ��� ��Ʈ�� ��Ʈ + ��/�Ʒ�
		// �� ��ü�� ������� �� ��� ��Ʈ�� + d
		// ���� �ּ�ȭ�ϰ��� �� ��� ��Ʈ�� + /
		// �ڵ带 �������� ����ϰ� �����ϰ��� �� ��� ��Ʈ�� ����Ʈ + f
		
		
		// ���� ���� ó����� 2
		
		int[] copies2 = new int[10];
		
		System.arraycopy(origins, 0, copies2, 0, 5);
		System.out.println(Arrays.toString(copies2));
		System.arraycopy(copies, 1, copies2, 5, 5);
		System.out.println(Arrays.toString(copies2));
		
		/*
		 * ���̹������� - ù ���ڰ� �빮���� �͵� - Ŭ����, �������̽�
		 * System ��ɾ��� ù ���ڰ� �빮�ڶ�� ������ System�� Ŭ������ �з��ȴٴ� ���� �� �� �ִ�. Arrays ���� ��������.
		 * 
		 * System.arraycopy(���� �迭 �ĺ���, �����迭���� ���縦 ������ �ε���, ���纻 �迭 �ĺ���, ���纻 ��Ť������� ���簡 ���۵� �ε���, ������ ����); - �̷��� ���·� ���־�� ��.
		 */
		
		// �Ʒ� ����� ũ�⸦ �ø� �迭�� ���� �����µ� Ưȭ�� ���.
		int[] copies3 = Arrays.copyOf(origins,  15);
		System.out.println(Arrays.toString(copies3));
		
		//
		int[] copies4 = origins.clone();
		System.out.println(Arrays.toString(copies4));
		

	}
	
		
}
