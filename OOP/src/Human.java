
public class Human {
	String name;
	int age;
	double height, weight;
	
	/* Overload Human */
	Human(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	void sleep() {
		System.out.println(this.name + " is sleeping");
	}
	
	// This override code is for Main function OOP_Super(); only
	// Overrides java.lang.Object.toString() function
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAge: " + this.age + "\n";
	}
	
	/* How to copy object */
	// You cannot copy a object by object1 = object2, that will make object1 and 2 point to the same memory address
	// So we can make a "copy" method to do this.
	// Write "human2.copy(human1);" in Main should work fine
	public void copy(Human x) {
		this.name = x.name;
		this.age = x.age;
		this.height = x.height;
		this.weight = x.weight;
	}
	// Or we can write copy like this, then write "Human human2 = new Human(human1);" should work fine
	Human(Human x){
		copy(x);
	}
	/* End how to copy object */
}
