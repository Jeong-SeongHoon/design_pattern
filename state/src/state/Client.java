package state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light = new Light();
		light.turnOff(); // 酒公馆览绝澜
		light.turnOn(); // 波咙->难咙
		light.turnOn(); // 难咙->sleep
		light.turnOn(); // sleep->难咙
		light.turnOff(); // 难咙->波咙
	}

}
