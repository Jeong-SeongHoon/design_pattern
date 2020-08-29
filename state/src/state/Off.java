package state;

public class Off implements State {
	private static Off off = new Off();
	
	public static Off getInstance() {
		return off;
	}
	
	@Override
	public void turnOn(Light light) {
		// TODO Auto-generated method stub
		System.out.println("²¨Áü->ÄÑÁü");
		light.setState(On.getInstance());
	}

	@Override
	public void turnOff(Light light) {
		// TODO Auto-generated method stub
		System.out.println("¾Æ¹«¹İÀÀ¾øÀ½");
	}

}
