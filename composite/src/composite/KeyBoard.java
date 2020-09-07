package composite;

public class KeyBoard implements Component{
	private int price;
	
	public KeyBoard(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
