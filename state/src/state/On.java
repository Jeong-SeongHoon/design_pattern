package state;

public class On implements State {
	private static On on = new On();
	
	public static On getInstance() {
		return on;
	}
	
	@Override
	public void turnOn(Light light) {
		// TODO Auto-generated method stub
		System.out.println("ÄÑÁü->sleep");
		light.setState(Sleep.getInstance());
	}

	@Override
	public void turnOff(Light light) {
		// TODO Auto-generated method stub
		System.out.println("ÄÑÁü->²¨Áü");
		light.setState(Off.getInstance());
	}

}
