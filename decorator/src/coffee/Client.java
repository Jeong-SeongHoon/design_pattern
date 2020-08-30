package coffee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee latte = new Latte(new Espresso());
		latte.make();
	}

}
