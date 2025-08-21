package homework.date0806.voHW;



public class Homework1 {
	
	public String name;
	public int price;
	public int calorie;
	public int gram;
	public int date;
	int today = 20250807;
	public void dateCheck() {
		if(date < today) {
			System.out.println(name + "의 소비기한이 지났으니 드시면 안 됩니다.");
			} else {
				System.out.println("안전합니다.");
			}
		
	}
	public void calCheck() {
		if(calorie >= 460) {
			System.out.println("열량이 높으니 많이 드시면 안 됩니다.");
		} else {
			System.out.println("드셔도 좋습니다.");
		}
		
	}

}
