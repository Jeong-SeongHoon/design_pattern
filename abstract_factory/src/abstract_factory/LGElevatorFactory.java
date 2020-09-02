package abstract_factory;

public class LGElevatorFactory extends ElevatorFactory{
	
	private static ElevatorFactory factory;
	
	private LGElevatorFactory() {
		
	}
	
	public static ElevatorFactory getFactory() {
		if (factory == null) {
			factory = new LGElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new LGDoor();
	}

	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new LGMotor();
	}

}
