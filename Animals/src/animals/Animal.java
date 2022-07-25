package animals;

public abstract class Animal implements Comparable<Animal>{
	protected String name;
	protected double walkSpeed;
	protected int legCount;
	
	public Animal(String name, double walkSpeed, int legCount) {
		this.name = name;
		this.walkSpeed = walkSpeed;
		this.legCount = legCount;
	}

	public String getName() {
		return name;
	}
	public double getWalkSpeed() {
		return walkSpeed;
	}
	public int getLegCount() {
		return legCount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWalkSpeed(double walkSpeed) {
		this.walkSpeed = walkSpeed;
	}
	public void setLegCount(int legCount) {
		if(legCount < this.legCount) {
			this.legCount = legCount;
		}
	}
	
	@Override
	public String toString() {
		return "Class: " + this.getClass() + " / Name: " + this.getName() + " / walkSpeed: " + this.getWalkSpeed() + " / legCount: " + this.getLegCount();
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Animal animal = (Animal) obj;
			
			boolean isSameClass = animal.getClass() == this.getClass();
			boolean hasSameName = animal.getName() == this.getName();
			
			return isSameClass && hasSameName;
		}catch(Exception e) {
			return false;
		}
		
	}
	
	@Override
	public int compareTo(Animal animal) {
		if(this.getWalkSpeed() > animal.getWalkSpeed()) {
			return 1;
		}else if(this.getWalkSpeed() < animal.getWalkSpeed()) {
			return -1;
		}
		return 0;
	}
	
	public abstract void walk();
	
}
