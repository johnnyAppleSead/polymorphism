package animals;

public abstract class Animal {
	protected String name;
	protected double walkSpeed;
	protected double runSpeedMultiplier;
	
	public Animal(String name, double walkSpeed) {
		this.name = name;
		this.walkSpeed = walkSpeed;
	}

	public String getName() {
		return name;
	}
	public double getWalkSpeed() {
		return walkSpeed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWalkSpeed(double walkSpeed) {
		this.walkSpeed = walkSpeed;
	}
	
	@Override
	public String toString() {
		return "Class: " + this.getClass() + " / Name: " + name + " / walkSpeed: " + walkSpeed;
	}
	
	public abstract void walk();
	
}
