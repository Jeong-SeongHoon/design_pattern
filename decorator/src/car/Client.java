package car;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car basicCar = new BasicCar();
		
		Car airbagCar = new AirBagCar(basicCar);
		Car absCar = new ABSCar(basicCar);
		Car navigationCar = new NavigationCar(basicCar);
		
		Car airbagAbsCar = new AirBagCar(new ABSCar(basicCar));
		// 생략
		
		Car fullOptionCar = new AirBagCar(new ABSCar(new NavigationCar(basicCar)));
		
		basicCar.printFunc();System.out.println();
		
		// 기능 출력
		airbagCar.printFunc();System.out.println();
		absCar.printFunc();System.out.println();
		navigationCar.printFunc();System.out.println();
		
		airbagAbsCar.printFunc();System.out.println();
		
		fullOptionCar.printFunc();System.out.println();
	}

}
