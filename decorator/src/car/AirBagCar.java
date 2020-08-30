package car;

public class AirBagCar extends OptionCar{

	public AirBagCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printFunc() {
		// TODO Auto-generated method stub
		super.printFunc();
		System.out.println("에어백 기능");
	}
	
	
}
