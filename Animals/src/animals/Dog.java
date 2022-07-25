package animals;

public class Dog extends Animal{
	
	public Dog(String name, double walkSpeed) {
		super(name, walkSpeed, 4);
	}
	
	@Override
	public void walk() {
		String message = "The animal named " + this.getName() + " is walking at the speed of " + this.getWalkSpeed() + " and uses " + this.getLegCount() + " legs.";
		System.out.println(message);
	}
	
	@Override
	public Animal clone() {
		return new Dog(this.getName(), this.getWalkSpeed());
	}
	
}
