package homework.date0807.capHW;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework1 {

	
	private String name;
	private int price;
	private int calorie;
	private int gram;
	private int date;
	private boolean limit;
	int today = Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));

	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCalorie() {
		return calorie;
	}
	public int getGram() {
		return gram;
	}
	public int getDate() {
		return date;
	}
	public boolean getLimit() {
		return limit;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public void setGram(int gram) {
		this.gram = gram;
	}
	public void setDate(int date) {
		this.date = date;
	}

	public void dateCheck() {
		if(date < today) { 
			System.out.println(name + "�� �Һ������ �������� ��ø� �� �˴ϴ�.");
			} else { 
				System.out.println("�����մϴ�.");
			}
	}
	public void calCheck() {
			if(calorie >= 500) {
				System.out.println("������ ������ ���� ��ø� �� �˴ϴ�.");
			} else {
				System.out.println("��ŵ� �����ϴ�.");
			}
			
		}
	
	public String info() {
		String info = "��ǰ�� : " + name
					+ "\n���� : " + price
					+ "\n���� : " + calorie
					+ "\n���� : " + gram
					+ "\n������� : " + date;
				
		return info;
	
	}
}
