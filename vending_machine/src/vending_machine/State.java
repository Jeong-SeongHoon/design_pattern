package vending_machine;

public interface State {
	public void insertCoin(int money);
	public void pressButton(int price);
	public void returnCoin();
}
