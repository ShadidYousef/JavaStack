package zoo;

public class Gorilla extends Mammal {
	
	
	public void throwSomething() {
		this.energy-=5;
		System.out.println("The Gorilla Threw an object (+5 Energy)");
		System.out.println("Current Energy: " + this.energy + "\n***********");
	}
	public void eatBananas() {
		this.energy+=10;
		System.out.println("The Gorilla ate a banana (+10 Energy)");
		System.out.println("Current Energy: " + this.energy + "\n***********");
	}
	public void climb() {
		this.energy-=10;
		System.out.println("The Gorilla climbed a tree and is now tired (-10 Energy)");
		System.out.println("Current Energy: " + this.energy + "\n***********");
	}
}
