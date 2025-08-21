package homework.date0806.voHW;

public class Homework4 {

	public String title;
	public String writer;
	public double score;
	public String recent;
	public String next;
		public void scoreCheck() {
		if(score >= 9.8) {
			System.out.println(title + "은(는) 평점 9.8 이상의 웹툰입니다.");
			} else if(score >=0 && score <9.8){
				System.out.println(title + "은 평점 9.8 미만의 웹툰입니다.");
			} else {System.out.println("입력된 점수가 유효하지 않습니다.");
			}
		}
		
	
}
