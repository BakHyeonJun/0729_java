package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		
		
		// Properties : Map �迭�μ�, Key + Value ��Ʈ�� ������. ����� ���������� ���� ��ǥ������ ��޵Ǵ� ���.
		// �ܺ� ���Ͽ� ��/����� �ϱ� ���� �뵵
		// Ȯ���ڰ� properties�� ���Ϸ� ������� �̷����
		// �������� �ʴ� ��������
		// �ش� ���α׷��� �⺻������ ������ �� �������� ��� ����
		
		Properties prop = new Properties(); 
		
		// prop.put("Ű", new Fish()); -> ��ó�� put�� ����� ���ۿ� ���ٴ� ���� ��ǥ�� ������ ����
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		
		try {
			// ��½� - prop.store(new FileOutputStream("test.properties"), "�ڿ��� ���� ���� ���� ������ ��.");
			// �Է½�
			// prop.load(new FileInputStream("test.properties"));
			// System.out.println(prop.get("Map"));
			prop.storeToXML(new FileOutputStream("text.xml"), null);
			
			// XML���� �Է� loadFromXML(InputStream is);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
