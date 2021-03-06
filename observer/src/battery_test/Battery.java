package battery_test;

import java.util.ArrayList;

public class Battery implements Observable{
	private int amount;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Battery() {
		super();
		this.amount = 100;
		this.attachObserver(new PrintBattery());
		this.attachObserver(new WarningBattery());
	}

	public void consume(int consume) {
		this.amount -= consume;
		this.notifyObservers();
	}

	@Override
	public void attachObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void detachObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer: observers) {
			observer.upate(this.amount);
		}
	}

}
