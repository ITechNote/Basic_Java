
public class Hero extends Human {
	String power;
	
	Hero(String name, int age, String power){
		super(name, age);
		this.power = power;
	}
	
	// super override from Human.java
	@Override
	public String toString() {
		return super.toString() + "power: " + this.power + "\n";
	}
}
