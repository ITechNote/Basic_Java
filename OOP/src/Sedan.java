
public class Sedan extends Car{
	int height = 150;
	
	/* Method override sample */
	@Override
	void brake() {
		System.out.println("You stop on the brakes by Sedan class overrided");
	}
}
