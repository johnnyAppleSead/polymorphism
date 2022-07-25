package animals;

public class Duck extends Animal{	
	public Duck(String name, double walkSpeed) {
		super(name, walkSpeed, 2);
	}
	
	@Override
	public void walk() {
		String message = "The animal named " + this.getName() + " is walking at the speed of " + this.getWalkSpeed() + " and uses " + this.getLegCount() + " legs.";
		message += " This animal is slower due to it having a lower quantity of legs.";
		System.out.println(message);
	}
	
	@Override
	public Animal clone() {
		return new Duck(this.getName(), this.getWalkSpeed());
	}
}
