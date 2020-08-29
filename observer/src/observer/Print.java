package observer;

public class Print implements Observer {
	private Score score;
	@Override
	public void update() {
		// TODO Auto-generated method stub
		for (int s: score.getScores()) {
			System.out.println(s);
		}
	}

	public void setScore (Score score) {
		this.score = score;
	}
}
