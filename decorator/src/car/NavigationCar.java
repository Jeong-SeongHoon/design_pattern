package car;

public class NavigationCar extends OptionCar{

	public NavigationCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printFunc() {
		// TODO Auto-generated method stub
		super.printFunc();
		System.out.println("네비게이션 기능");
	}
	
	
}
