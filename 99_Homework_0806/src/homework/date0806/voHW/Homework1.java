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
			System.out.println(name + "�� �Һ������ �������� ��ø� �� �˴ϴ�.");
			} else {
				System.out.println("�����մϴ�.");
			}
		
	}
	public void calCheck() {
		if(calorie >= 460) {
			System.out.println("������ ������ ���� ��ø� �� �˴ϴ�.");
		} else {
			System.out.println("��ŵ� �����ϴ�.");
		}
		
	}

}
