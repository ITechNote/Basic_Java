

public class Car {
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2022;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	void brake() {
		System.out.println("You stop on the brakes");
	}
	
	// Overrides java.lang.Object.toString() function
	@Override
	public String toString() {
		return "Your car:\n" + make + "\n" + model + "\n" + color + "\n" + year;
	}
}
