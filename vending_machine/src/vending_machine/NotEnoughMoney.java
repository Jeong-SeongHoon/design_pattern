package vending_machine;

public class NotEnoughMoney implements State {
	private VendingMachine vm;

	public NotEnoughMoney(VendingMachine vm) {
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
