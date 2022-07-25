package runner;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.Cat;
import animals.Dog;

public class Main {
	
	public static void main(String... args) {
		Dog d = new Dog("Fido", 2.4);
		Cat c = new Cat("MeowCat", 1.2);
		
		List<Animal> animals = new ArrayList<>();
		
		storeAnimal(d, animals);
		storeAnimal(c, animals);
		
		for(int count = 0; count < animals.size(); count++) {
			Animal animal = animals.get(count);
			walkAnimal(animal);
		}
	}
	public static void storeAnimal(Animal animal, List<Animal> animals) {
		animals.add(animal);
	}
	public static void walkAnimal(Animal animal) {
		animal.walk();
	}
}
