package zoo;

public class Mammal {
	public int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	public int displayEnergy() {
		System.out.println(getEnergy());
		return this.energy;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
