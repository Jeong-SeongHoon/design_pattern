package coffee;

public class Latte extends DecorateCoffee{

	public Latte(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		super.make();
		System.out.println("¿ìÀ¯");
	}

	
}
