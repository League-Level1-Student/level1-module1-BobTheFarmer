package _06_duck;

public class Dog {
	String name;
	String favFood;
	Dog(String name, String favFood) {
		this.name = name;
		this.favFood = favFood;
	}
	
	void bark() {
		System.out.println(name + " barks");
	}
	void eat() {
		System.out.println(name + " eats " + favFood);
	}
}
