import java.util.Scanner;
import Tools.Toolbox;

public class Main {

	public static void main(String[] args) {
//		OOP_Object();				/* 1. Simple object and Override sample */
//		OOP_Constructors();			/* 2. Constructors and Overload sample */
		OOP_Array();				/* 3. Array object */
//		OOP_Object_passing();		/* 4. Object passing sample */
//		OOP_Static();				/* 5. Static Keyword sample (class vs object) */
//		OOP_Inheritance();			/* 6. Inheritance and method override (Class extends) */
//		OOP_Super();				/* 7. Super Keyword (Class extends) */
//		OOP_Polymorphism();			/* 8. Polymorphism and Dynamic polymorphism */
//		Package_toolbox();			/* 9. How package use, how to import customize package */
//		Enum_Action();				/* 10.How enum works(https://www.bookstack.cn/read/java-se6/docs-ch11.md)*/
	}
	
	/* OOP - Simple object and Override sample */
	/* Use Car.java */
	public static void OOP_Object() {
		/* OOP - simple object sample */
		Car mycar1 = new Car();
		Car mycar2 = new Car();
		
		System.out.println(mycar1.model);
		
		mycar1.drive();
		mycar1.brake();
		
		mycar2.color = "Cyan";
		System.out.println(mycar1.color);
		System.out.println(mycar2.color);
		
		/* OOP - Override */
		System.out.println(mycar1.toString());
	}
	
	/* OOP - Constructors and Overload sample */
	/* Use Human.java */
	public static void OOP_Constructors() {
		/* OOP - Constructors */
		Human human1 = new Human("Lin", 20, 155.6, 48.4);
		/* OOP - Overload */
		Human human2 = new Human("Yang", 20);
		
		System.out.println(human1.name);
		human1.eat();
		human2.sleep();
	}
	
	/* OOP - Array object */
	/* Use Food.java */
	public static void OOP_Array() {
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("cake");
		Food food3 = new Food("hotdog");
		
		// Type 1
//		Food[] refrigerator = new Food[3];
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		// Type 2
		Food[] refrigerator = {food1, food2, food3};
		for(int i = 0;i < refrigerator.length; i++) {
			System.out.println(refrigerator[i].name);
		}
	}
	
	/* OOP - Object passing sample */
	/* Use Human.java, Classmates.java */
	public static void OOP_Object_passing() {
		Human human1 = new Human("Lin", 20, 155.6, 48.4);
		Human human2 = new Human("Yang", 20);
		
		Classmates mate = new Classmates();
		mate.studing(human1);
		mate.sleep(human2);
	}
	
	/* OOP - Static Keyword (class vs object) */
	/* Use Friend.java */
	/* The class "owns" the static member, not object! */
	public static void OOP_Static() {
		System.out.println(Friend.numberOfFriends); // Should be zero like me :)
		
		@SuppressWarnings("unused") // Ignore "unused" warnings
		Friend friend1 = new Friend("Yeh");
		@SuppressWarnings("unused")
		Friend friend2 = new Friend("Zen");
		
		System.out.println(Friend.numberOfFriends); // Should be two now
//		System.out.println(friend1.numberOfFriends);// The static field numberOfFriends should be accessed in a static way.
		Friend.displayFriends();                   	// Should be same, but easier to call
	}
	
	/* OOP - Inheritance and method override (Class extends) */
	/* Use Car.java, Sedan.java */
	public static void OOP_Inheritance() {
		Sedan sedan1 = new Sedan();
		
		sedan1.drive();		// original method from Car.java
		sedan1.brake();		// original method from Car.java override by Sedan.java
		System.out.println(sedan1.height); // original variable from Sedan.java
	}
	
	/* OOP - Super Keyword (Class extends) */
	/* Use Human.java, Hero.java */
	public static void OOP_Super() {
		Hero hero1 = new Hero("Batman", 42, "Money");
		Hero hero2 = new Hero("µa¥É", 28, "One punch");
		
		System.out.println(hero1.name);
		System.out.println(hero2.toString());
	}
	
	/* OOP - Polymorphism and Dynamic polymorphism */
	/* Use Human.java, Hero.java, programmer.java */
	/* import java.util.Scanner; */
	public static void OOP_Polymorphism() {
		Hero hero1 = new Hero("µa¥É", 28, "One punch");
		Programmer pg1 = new Programmer("Me", 25, "Solidity");
		
		// Polymorphism sample
		Human[] humans = {hero1, pg1};
		for(Human x:humans) {
			System.out.println(x.toString());
		}
		
		// Dynamic polymorphism sample
		// We don't need to new a subobject when initializing
		// but can decide latter
		Scanner scan = new Scanner(System.in);
		Human polyhuman;
		
		System.out.println("What's your name?");
		String name = scan.nextLine();
		System.out.println("How old are you?");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Who you are? (1=hero or 2=programmer)");
		String type = scan.nextLine();
		
		if(type == "1") {		// A hero
			System.out.println("What's your power?");
			String power = scan.nextLine();
			
			polyhuman = new Hero(name, age, power);
			System.out.println(polyhuman.toString());
		}
		else if(type == "2") {	// A programmer
			System.out.println("What's your skill?");
			String skill = scan.nextLine();
			
			polyhuman = new Programmer(name, age, skill);
			System.out.println(polyhuman.toString());
		}
		else {					// Just a normal human
			polyhuman = new Human(name, age);
			System.out.println(polyhuman.toString());
		}
		scan.close();
	}
	
	/* How package use, how to import customize package */
	/* import Tools.Toolbox; */
	/* Use Tools package create by ourselves */
	public static void Package_toolbox() {
		Toolbox newtool = new Toolbox();
		// do nothing
	}
	
	/* How enum works */
	public static void Enum_Action() {
		Action_enum ac = Action_enum.TURN_LEFT;
		System.out.println(ac.getTurn());
		
	}
}
