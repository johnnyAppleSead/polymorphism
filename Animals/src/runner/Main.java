package runner;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;

public class Main {
	
	public static void main(String... args) {
		Dog dog = new Dog("Fido", 2.4);
		Cat cat = new Cat("MeowCat", 1.2);
		Duck duck = new Duck("Quackers", .8);
		
		List<Animal> animals = new ArrayList<>();
		
		storeAnimal(dog, animals);
		storeAnimal(cat, animals);
		storeAnimal(duck, animals);
		
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
