package observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// subject (���� ��)
		Score score = new Score();
		
		// observer (���� �뺸 ����)
		Print ob1 = new Print();
		PrintMultiple ob2 = new PrintMultiple();
		
		// subject���� noti ���� observer���� ���
		score.attachObserver(ob1);
		score.attachObserver(ob2);
		
		// ������ �뺸 ������ score�� ����ϱ� ���� subject�� ������ �־�� ��
		ob1.setScore(score);
		ob2.setScore(score);
		
		// ����
		// ���� �� noti �Լ� ȣ��Ǹ�
		// ��ϵ� observer���� update() ȣ��
		// ���� observer�� update() ������ ���� ���� ���
		score.addScore(10);
		score.addScore(20);
		score.addScore(30);
	}

}
