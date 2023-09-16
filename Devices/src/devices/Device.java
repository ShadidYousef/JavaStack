package devices;

public class Device {
	public int battery;
	
	public Device() {
		this.battery = 100;
	}
	public void getBattery() {
		System.out.println("Current Battery: " + this.battery);
	}
}
