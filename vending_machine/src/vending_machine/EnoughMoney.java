package vending_machine;

public class EnoughMoney implements State {
	private VendingMachine vm;

	public EnoughMoney(VendingMachine vm) {
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
