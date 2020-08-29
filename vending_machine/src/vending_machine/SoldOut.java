package vending_machine;

public class SoldOut implements State {
	private VendingMachine vm;
	
	public SoldOut(VendingMachine vm) {
		super();
		this.vm = vm;
	}

	@Override
	public void pressButton(int price) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertCoin(int money) {
		// TODO Auto-generated method stub
		
	}

}
