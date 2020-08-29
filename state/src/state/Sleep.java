package state;

public class Sleep implements State {
	private static Sleep sleep = new Sleep();
	
	public static Sleep getInstance() {
		return sleep;
	}
	
	@Override
	public void turnOn(Light light) {
		// TODO Auto-generated method stub
		System.out.println("sleep->ÄÑÁü");
		light.setState(On.getInstance());
	}

	@Override
	public void turnOff(Light light) {
		// TODO Auto-generated method stub
		System.out.println("sleep->²¨Áü");
		light.setState(Off.getInstance());
	}

}
