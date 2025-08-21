package com.kh.variable;

public class Casting {
	
	/*
	 * Type Casting(�ڷ��� ��ȯ) : �ڷ����� �ٲٴ� ����. �ڹٿ��� ���� �߿��� ���� �ϳ��� ����� �ϸ� �ٷ� "�ڷ���"�̴�.
	 * �ſ� �߿��ϸ� ���� ���� ����ñ��� �ؾ������ ū�ϳ���, �ڹٿ��� ���� ó���ϴ� ��Ģ��.
	 * 
	 *  1. =(���� ������)�� �������� �º�/�캯�� ���� �ڷ����̾�� ��.
	 *  -> ���� �ڷ����� �ش��ϴ� ���� ������ �� ����.
	 *  -> �ڷ����� �ٸ� ���, ���� ������ �ٲ㼭 �����ؾ� �Ѵ�.
	 *  
	 *  2. ���� �ڷ����鳢���� ������ �����ϴ�.
	 *  -> �ڷ����� �ٸ����� �ұ��ϰ� ������ �ϰ�ʹٸ�, ���� ���� ������ �ٲ㼭("����ȯ") �����ϰ� ���� �� ������ �����ؾ� �Ѵ�.
	 *  
	 *  3. ������ ����� ���� ������ �ڷ����̾�� �Ѵ�.
	 *  
	 *  [ǥ����] (�ٲٰ� ���� �ڷ���) �� - ���·� ���� ��
	 *  ����ȯ������(cast������)
	 *  
	 *  ����ȯ�� ����
	 *  
	 *  1. �ڵ�����ȯ(Promotion) : �ڵ����� ����ȯ�� �����.
	 *  
	 *  ���� ũ���� �ڷ������� ū ũ���� �ڷ������� ��ȯ�ϴ� ���� �ڵ����� �̷����
	 *  
	 *  2. ��������ȯ(Type Casting) : �ڵ�����ȯ�� �̷������ ���� ��� ������.
	 *  
	 *  
	 *  
	 */
	
	public void autoCasting() {
		
			
		// System.out.println("�� ������ �ܼ�â�� ����غ����� �ǽ� ����!");
		
		//1. int(����, 4Byte) -> double(�Ǽ�, 8Byte)
		//���� ����� ���ÿ� �ʱ�ȭ
		
		int intNum = 148;
		System.out.println(intNum);
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		// 2. int(����, 4Byte) -> long(8Byte, ����)
		
		int bigInteger = 21904;
		long smallLong = bigInteger;
		System.out.println(smallLong);
		
		// 3. long(����, 8Byte) -> float(�Ǽ�, 4Byte) - ū ����� ���� ������� ����ȯ�Կ��� �ұ��ϰ� ���������� �ڵ����� ����. �ٸ�, �ſ� ū ���̶� 4Byte�� �����ϱ� ���� ������ ������� ������ ���� ��µ� ���ɼ��� ����.
		// ���� - 4byte float ���� long������ ǥ���� �� �ִ� ���� ������ �� �б� ����
		
		long longNumber = 21905L;
		// int num = longNumber; - ������ ���� �� ����
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		long longNumber2 = 2147483648L;
		float floatNumber2 = longNumber2;
		System.out.println(floatNumber2);
		
		// 4. char(2Byte) -> int(4Byte)
		
		char ch = 'o';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		char ch2 = 74;
		System.out.println(ch2);
		
		// ---------------------------
		
		System.out.println('3');
		System.out.println((char)3);
		System.out.println((char)'3' + (char)3); 		// ������� 54�� ������ ���� : char �������� �ƹ��� ��δ��� + ������ �õ��ϴ� ���� ������ �ľ��ϰ� �ȴ�.
		
		// ����, byte �Ǵ� short�� ���� ����
		
		byte byteNum = (byte)148; 
		System.out.println(byteNum);
		byte b2 = 126;
		byte b3 = 3; 
		System.out.println(b2 + b3); // byte ������ �����Ͽ������� �ұ��ϰ�, ���� ������ġ�� ���� ó���ϴ� ũ�Ⱑ int ���� �������� 4Byte �̹Ƿ� ������� Byte���� �Ѱ踦 �Ѿ�� 129�� ���� �� ����.
		
		
	}
	
	

}
