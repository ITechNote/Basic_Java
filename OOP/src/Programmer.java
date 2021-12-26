
public class Programmer extends Human {
	String skill;
	Programmer(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}

	@Override
	public String toString() {
		return super.toString() + "skill: " + this.skill;
	}
}
