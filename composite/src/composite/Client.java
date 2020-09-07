package composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component keyboard = new KeyBoard(100);
		Component body = new Body(500);
		Component monitor = new Monitor(300);
		
		Computer computer = new Computer();
		computer.addDevice(keyboard);
		computer.addDevice(body);
		computer.addDevice(monitor);
		System.out.println(computer.getPrice());
	}

}
