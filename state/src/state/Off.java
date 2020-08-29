package state;

public class Off implements State {
	private static Off off = new Off();
	
	public static Off getInstance() {
		return off;
	}
	
	@Override
	public void turnOn(Light light) {
		// TODO Auto-generated method stub
		System.out.println("����->����");
		light.setState(On.getInstance());
	}

	@Override
	public void turnOff(Light light) {
		// TODO Auto-generated method stub
		System.out.println("�ƹ���������");
	}

}
