package vending_machine;

public class NoMoney implements State {
	private VendingMachine vm;
	
	public NoMoney(VendingMachine vm) {
		super();
		this.vm = vm;
	}

	@Override
	public void pressButton(int price) {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어 주세요.");
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("반환 할 금액이 없습니다.");
	}

	@Override
	public void insertCoin(int money) {
		// TODO Auto-generated method stub
		System.out.println(money + "원을 넣었습니다.");
		MoneyBox mb = vm.getMoneyBox();
		mb.setMoney(mb.getMoney() + money);
		
		if (mb.getMoney() >= vm.getBeverage().getPrice()) {
			vm.setState(vm.getEnoughMoney());
		} else {
			vm.setState(vm.getNotEnoughMoney());
		}
		System.out.println("현재 투입 된 금액은 " + mb.getMoney() + "원 입니다.");
	}

}
