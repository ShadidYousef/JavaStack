package devices;

public class Phone extends Device {
	
	public void call() {
		this.battery-=5;
		System.out.println("You just had a phone call (Battery -5%)");
		System.out.printf("Current Battery: %s\n**********\n", this.battery);
	}
	public void playGame() {
		this.battery-=20;
		System.out.println("You just played a game (Battery -20%)");
		System.out.printf("Current Battery: %s\n**********\n", this.battery);
	}
	public void charge() {
		if(this.battery + 50 > 100) {
			this.battery = 100;
			System.out.println("Phone Charged!");
			System.out.println("Your Battery is full! (Battery 100%)\n**********");
		}
		else {
			this.battery+=50;
			System.out.println("Phone Charged! (Battery +50%)");
			System.out.printf("Current Battery: %s\n**********\n", this.battery);
		}
		
	}
}
