package observer;

import java.util.ArrayList;

public class Score extends Subject{
	private ArrayList<Integer> scores = new ArrayList<Integer>();
	
	public void addScore(int score) {
		scores.add(score);
		notifyToObservers();
	}
	public ArrayList<Integer> getScores() {
		return scores;
	}
}
