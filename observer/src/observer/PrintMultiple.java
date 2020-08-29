package observer;

public class PrintMultiple implements Observer {
	private Score score;
	@Override
	public void update() {
		// TODO Auto-generated method stub
		for (int s: score.getScores()) {
			System.out.println(s*2);
		}
	}

	public void setScore (Score score) {
		this.score = score;
	}

}
