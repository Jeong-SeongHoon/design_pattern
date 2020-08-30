package coffee;

public class Americano extends DecorateCoffee{

	public Americano(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		super.make();
		System.out.println("¹°");
	}

	
}
