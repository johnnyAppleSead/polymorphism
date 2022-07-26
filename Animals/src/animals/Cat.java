package animals;

public class Cat extends Animal{	
	public Cat(String name, double walkSpeed) {
		super(name, walkSpeed, 4);
	}
	
	@Override
	public void walk() {
		String message = "The animal named " + this.getName() + " is walking at the speed of " + this.getWalkSpeed() + " and uses " + this.getLegCount() + " legs.";
		message += "This animal may be a little slower than others because a cat comes when it wants, not when it's called.";
		System.out.println(message);
	}
	
	@Override
	public Animal clone() {
		return new Cat(this.getName(), this.getWalkSpeed());
	}
}
