package homework.date0806.voHW;

public class Homework4 {

	public String title;
	public String writer;
	public double score;
	public String recent;
	public String next;
		public void scoreCheck() {
		if(score >= 9.8) {
			System.out.println(title + "��(��) ���� 9.8 �̻��� �����Դϴ�.");
			} else if(score >=0 && score <9.8){
				System.out.println(title + "�� ���� 9.8 �̸��� �����Դϴ�.");
			} else {System.out.println("�Էµ� ������ ��ȿ���� �ʽ��ϴ�.");
			}
		}
		
	
}
