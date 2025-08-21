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
			System.out.println(name + "의 소비기한이 지났으니 드시면 안 됩니다.");
			} else { 
				System.out.println("안전합니다.");
			}
	}
	public void calCheck() {
			if(calorie >= 500) {
				System.out.println("열량이 높으니 많이 드시면 안 됩니다.");
			} else {
				System.out.println("드셔도 좋습니다.");
			}
			
		}
	
	public String info() {
		String info = "상품명 : " + name
					+ "\n가격 : " + price
					+ "\n열량 : " + calorie
					+ "\n무게 : " + gram
					+ "\n유통기한 : " + date;
				
		return info;
	
	}
}
