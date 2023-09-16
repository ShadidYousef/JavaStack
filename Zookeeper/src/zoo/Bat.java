package zoo;

public class Bat extends Mammal{
	
	public Bat() {
		this.energy=300;
	}
	
	public void fly() {
		this.energy-=50;
		System.out.println("The Bat is Flying right now (-50 Energy)");
		System.out.println("Current Energy: " + this.energy + "\n***********");
	}
	public void eatHumans() {
		this.energy+=25;
		System.out.println("The Bat ate a Human (+25 Energy)");
		System.out.println("Current Energy: " + this.energy + "\n***********");
	}
	public void attackTown() {
		this.energy-=100;
		System.out.println("The Bat Destroyed a Human Town (-100 Energy)");
		System.out.println("Current Energy: " + this.energy + "\n***********");
	}
}
