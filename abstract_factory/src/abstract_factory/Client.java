package abstract_factory;

public class Client {
	public static void main(String[] args) {
		ElevatorFactory factory = null;
		
		factory = ElevatorFactory.createElevatorFactory("LG");
		factory.createDoor().open();
		factory.createMotor().move();
		
		factory = ElevatorFactory.createElevatorFactory("SK");
		factory.createDoor().open();
		factory.createMotor().move();
	}
}
