package coffee;

public abstract class DecorateCoffee implements Coffee{
	private Coffee coffee;
	
	
	
	public DecorateCoffee(Coffee coffee) {
		super();
		this.coffee = coffee;
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		coffee.make();
	}
}
