package state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light = new Light();
		light.turnOff(); // �ƹ���������
		light.turnOn(); // ����->����
		light.turnOn(); // ����->sleep
		light.turnOn(); // sleep->����
		light.turnOff(); // ����->����
	}

}
