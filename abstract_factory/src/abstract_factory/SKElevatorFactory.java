package abstract_factory;

public class SKElevatorFactory extends ElevatorFactory{
	private static ElevatorFactory factory;
	
	private SKElevatorFactory() {
		
	}
	
	public static ElevatorFactory getFactory() {
		if (factory == null) {
			factory = new SKElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new SKDoor();
	}

	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new SKMotor();
	}

}
