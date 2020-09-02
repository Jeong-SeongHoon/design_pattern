package abstract_factory;

public abstract class ElevatorFactory {
	public static ElevatorFactory createElevatorFactory(String id) {
		ElevatorFactory ef = null;
		if (id == "LG") {
			ef = LGElevatorFactory.getFactory();
		} else if (id == "SK") {
			ef = SKElevatorFactory.getFactory();
		}
		return ef;
	}
	
	public abstract Door createDoor();
	public abstract Motor createMotor();
}
