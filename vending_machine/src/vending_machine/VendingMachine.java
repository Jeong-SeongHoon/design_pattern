package vending_machine;

public class VendingMachine {
	private State state;
	private State noMoney;
	private State notEnoughMoney;
	private State enoughMoney;
	private State soldOut;
	
	private MoneyBox mb;
	private Beverage beverage;
	
	public VendingMachine(int price, int stock) {
		noMoney = new NoMoney(this);
		notEnoughMoney = new NotEnoughMoney(this);
		enoughMoney = new EnoughMoney(this);
		soldOut = new SoldOut(this);
		
		mb = new MoneyBox();
		beverage = new Beverage(price, stock);
		
		if (beverage.getStock() > 0) {
			setState(noMoney);
		} else {
			setState(soldOut);
		}
	}
	
	public void insertMoney(int money) {
		state.insertCoin(money);
	}
	public void pressButton() {
		int price = beverage.getPrice();
		state.pressButton(price);
	}
	public void returnMoney() {
		state.returnCoin();
	}
	
	public State getNoMoney() {
		return noMoney;
	}
	public State getNotEnoughMoney() {
		return notEnoughMoney;
	}
	public State getEnoughMoney() {
		return enoughMoney;
	}
	public State getSoldOut() {
		return soldOut;
	}
	public MoneyBox getMoneyBox() {
		return mb;
	}
	public Beverage getBeverage() {
		return beverage;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
}
