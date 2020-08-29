package state;

public class Light {
	private State state;

	public Light() {
		super();
		this.state = new Off();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void turnOn() {
		state.turnOn(this);
	}
	
	public void turnOff() {
		state.turnOff(this);
	}
	
}
