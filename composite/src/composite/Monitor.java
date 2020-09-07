package composite;

public class Monitor implements Component{
	private int price;
	
	public Monitor(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
