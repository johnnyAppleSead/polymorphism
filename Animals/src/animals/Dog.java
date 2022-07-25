package animals;

public class Dog extends Animal{
	public Dog(String name, double walkSpeed) {
		super(name, walkSpeed);
	}
	
	@Override
	public void walk() {
		System.out.println("The animal " + this.name + " naturally walks at the speed of " + this.walkSpeed);
	}
	
}
