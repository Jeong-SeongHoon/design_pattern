package composite;

import java.util.ArrayList;

public class Computer implements Component{
	private int price;
	private ArrayList<Component> device = new ArrayList<Component>();
	
	public void addDevice(Component device) {
		this.device.add(device);
	}
	
	public Computer() {
		// TODO Auto-generated constructor stub
		this.price=0;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		for (Component device: this.device) {
			this.price+=device.getPrice();
		}
		return this.price;
	}

}
