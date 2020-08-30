package car;

public class OptionCar implements Car {
	
	Car car;
	
	
	
	public OptionCar(Car car) {
		super();
		this.car = car;
	}



	@Override
	public void printFunc() {
		// TODO Auto-generated method stub
		car.printFunc();
	}

}
