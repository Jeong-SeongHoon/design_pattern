package observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// subject (변경 됨)
		Score score = new Score();
		
		// observer (변경 통보 받음)
		Print ob1 = new Print();
		PrintMultiple ob2 = new PrintMultiple();
		
		// subject에서 noti 해줄 observer들을 등록
		score.attachObserver(ob1);
		score.attachObserver(ob2);
		
		// 변경을 통보 받으면 score를 출력하기 위해 subject를 가지고 있어야 함
		ob1.setScore(score);
		ob2.setScore(score);
		
		// 변경
		// 변경 후 noti 함수 호출되면
		// 등록된 observer들의 update() 호출
		// 이후 observer의 update() 로직에 따라 내용 출력
		score.addScore(10);
		score.addScore(20);
		score.addScore(30);
	}

}
