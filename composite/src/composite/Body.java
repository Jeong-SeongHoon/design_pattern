package composite;

public class Body implements Component{
	private int price;
	
	public Body(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
