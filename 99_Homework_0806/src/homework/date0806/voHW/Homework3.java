package homework.date0806.voHW;

public class Homework3 {

	public String title;
	public int playTime;
	public int price;
	public String develop;
	public String publish;
		public void timeCheck() {
		if(playTime >= 90) {
			System.out.println(title + "을(를) 90시간 이상 플레이하셨습니다. 조금 줄여보시는 건 어떨까요?");
			} else {
				System.out.println(title + "을(를) 90시간 미만 플레이하셨습니다. 조금 더 즐겨보세요.");
			}
		}
		public void priceCheck() {
			if(price >= 8000) {
				System.out.println(title + "은 8000 원 이상의 게임입니다.");
				} else {
					System.out.println(title + "은 8000 원 미만의 게임입니다.");
				}
	
	}
	
}
