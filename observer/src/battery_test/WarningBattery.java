package battery_test;

public class WarningBattery implements Observer{

	@Override
	public void upate(int amount) {
		// TODO Auto-generated method stub
		if (amount <= 10) {
			System.out.println("���! ���͸� �ܷ��� 10 ���� �Դϴ�.");
		}
	}

}
