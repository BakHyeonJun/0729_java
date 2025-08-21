package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		
		
		// Properties : Map 계열로서, Key + Value 세트로 저장함. 상속의 문제점으로 가장 대표적으로 언급되는 사례.
		// 외부 파일에 입/출력을 하기 위한 용도
		// 확장자가 properties인 파일로 입출력이 이루어짐
		// 변경하지 않는 설정정보
		// 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		
		Properties prop = new Properties(); 
		
		// prop.put("키", new Fish()); -> 이처럼 put이 노출될 수밖에 없다는 점이 대표적 문제로 꼽힘
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		
		try {
			// 출력시 - prop.store(new FileOutputStream("test.properties"), "뒤에는 적고 싶은 내용 적으면 됨.");
			// 입력시
			// prop.load(new FileInputStream("test.properties"));
			// System.out.println(prop.get("Map"));
			prop.storeToXML(new FileOutputStream("text.xml"), null);
			
			// XML에서 입력 loadFromXML(InputStream is);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
