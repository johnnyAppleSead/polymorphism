package animals;

public class Cat extends Animal{
	public Cat(String name, double walkSpeed) {
		super(name, walkSpeed);
	}
	
	@Override
	public void walk() {
		System.out.println("The animal " + this.name + " is walking at the speed of " + this.walkSpeed);
	}
}
