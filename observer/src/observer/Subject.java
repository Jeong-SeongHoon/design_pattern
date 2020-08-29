package observer;

import java.util.ArrayList;

public abstract class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void attachObserver(Observer observer) {
		this.observers.add(observer);
	}
	public void detachObserver(Observer observer) {
		this.observers.remove(observer);
	}
	public void notifyToObservers() {
		for (Observer observer:observers) {
			observer.update();
		}
	}
}
