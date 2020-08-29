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
		System.out.println("������ �־� �ּ���.");
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("��ȯ �� �ݾ��� �����ϴ�.");
	}

	@Override
	public void insertCoin(int money) {
		// TODO Auto-generated method stub
		System.out.println(money + "���� �־����ϴ�.");
		MoneyBox mb = vm.getMoneyBox();
		mb.setMoney(mb.getMoney() + money);
		
		if (mb.getMoney() >= vm.getBeverage().getPrice()) {
			vm.setState(vm.getEnoughMoney());
		} else {
			vm.setState(vm.getNotEnoughMoney());
		}
		System.out.println("���� ���� �� �ݾ��� " + mb.getMoney() + "�� �Դϴ�.");
	}

}
