package vending_machine;

public class Beverage {
	private int price;
	private int stock;
	
	public Beverage(int price, int stock) {
		super();
		this.price = price;
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
