package homework.date0806.voHW;

public class Homework3 {

	public String title;
	public int playTime;
	public int price;
	public String develop;
	public String publish;
		public void timeCheck() {
		if(playTime >= 90) {
			System.out.println(title + "��(��) 90�ð� �̻� �÷����ϼ̽��ϴ�. ���� �ٿ����ô� �� ����?");
			} else {
				System.out.println(title + "��(��) 90�ð� �̸� �÷����ϼ̽��ϴ�. ���� �� ��ܺ�����.");
			}
		}
		public void priceCheck() {
			if(price >= 8000) {
				System.out.println(title + "�� 8000 �� �̻��� �����Դϴ�.");
				} else {
					System.out.println(title + "�� 8000 �� �̸��� �����Դϴ�.");
				}
	
	}
	
}
