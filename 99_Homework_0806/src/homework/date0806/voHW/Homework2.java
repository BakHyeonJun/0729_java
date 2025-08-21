package homework.date0806.voHW;

public class Homework2 {

	public String title;
	public String writer;
	public String lyricist;
	public String singer;
	public int minute;
	public int second;
	public void lengthCheck() {
		if(minute >= 4) {
			System.out.println(title + "은(는) 4분 이상의 연주시간을 가진 노래입니다.");
			} else {
				System.out.println("4분 미만의 연주시간을 가진 노래입니다.");
			}
		
	}
	
		
	
	
	
}
