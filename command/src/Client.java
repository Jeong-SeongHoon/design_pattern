

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		button.setOs(new Centos());
		button.press();
		
		button.setOs(new Ubuntu());
		button.press();
	}

}
