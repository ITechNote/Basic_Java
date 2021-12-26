import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) {
		try {
//			Print_line();			/* 1. Print line/format in Java */
//			Scanner_input();		/* 2. User input scanner in Java */
//			Expression();			/* 3. How operators work */
//			GUI_intro();			/* 4. Basic GUI interface */
//			MATH_class();			/* 5. Learning how to use a Math class for calculate something easily */
//			STRING_class();			/* 6. Learning how to use some useful methods of String class */
//			RANDOM_class();			/* 7. Create some random int / boolean / double / gaussian... */
//			If_switch_statement();	/* 8. If and Switch statement */
//			Loop();					/* 9. For/While/Do while/Nested/For-each loops */			
			Array_list();			/* 10.How Array and Arraylist work in Java */
//			wrapper_class();		/* 11.The difference of Data and Object */
//			Method_overload();		/* 12.Method and overloaded methods sample */
//			Exception();			/* 13.Exception (try catch, finally) */
//			File_IO_sample();		/* 14.Learning how to use some useful methods of File and FileWriter, FileReader */
//			Audio_IO_sample();		/* 15.Learning how to use some useful methods to play audio file */
//			Java_Thread();			/* 16.Learning some thread method and create a new thread in java */
//			Multithread();			/* 17.Using multiple thread helps process maximum utilization of CPU */
		} 
		catch(Exception e) {} // Any other default error handing
	}
	
	/* Print line/format in Java */
	public static void Print_line() {
		/* print */
		System.out.println("Hello world!");
		System.out.print("How to type \" ?\n");
		System.out.println("\tthis is tab");
		/* End print */
		
		/* printf: print format string */
		// "%b" boolean, "%c" char, "%s" String, "%d" int, "%f" double
		
		// [basic]
		System.out.printf("This is a format string %s", "Test123");
		
		String operator = "Add";
		int x = 1;
		int y = 2;
		System.out.printf("%s : %d + %d = %d\n", operator, x, y, x+y);
		
		// [width]
		// minimum number of characters to be written as output
		System.out.printf("Output:%10s\n", "Test123");	// "Output:   Test123"
		System.out.printf("Output:%-10s\n", "Test123");	// "Output:Test123   "
		// [precision]
		// set number of digits of precision when outputting floating-point values
		System.out.printf("Output:%.2f\n", 3.1415926535);	// "Output:3.14"
		// [flags]
		// + : output sign of numeric value
		System.out.printf("Output:%+.2f\n", 3.1415926535);	// "Output:+3.14"
		System.out.printf("Output:%+.2f\n", -3.1415926535);	// "Output:-3.14"
		// 0 : do zero-padding to numeric values
		System.out.printf("Output:%20f\n", 3.1415926535);		// "Output:        3.1415926535"
		System.out.printf("Output:%020f\n", 3.1415926535);	// "Output:000000003.1415926535"
		// , : comma grouping separator if numbers > 1000
		System.out.printf("Output:%,f\n", 3333333.1415926535);	// "Output:3,333,333.141593"
		/* End printf */
	}
	
	/* User input scanner in Java */
	// Need "import java.util.Scanner;"
	public static void Scanner_input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?\n");
		String name = scan.nextLine();
		System.out.println("How old are you?\n");
		int age = scan.nextInt();
		scan.nextLine(); // integer scanner(nextInt) won't read "\n", so we need nextLine to read last line of "\n".
		System.out.println("What is your favorite music?\n");
		String music = scan.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + "years old");
		System.out.println("You like " + music);
		
		scan.close(); // scanner needs to close after used
	}

	/* How operators work */
	// expression = operands & operators
	// operands = values, variables, numbers, quantity
	// operators =  + - * / %...
	public static void Expression() {
		/* Basic operators + - * / %... */
		int knowledge = 10;
		
		knowledge += 1;
		float knowledge_ = (float) knowledge / 3;
		
		System.out.println(knowledge_);
		/* End basic operators */
		
		/* Logical operators (After learning if statement) &&(AND), ||(OR), !(NOT) */
		int temp = 25;
		if(temp > 30) {
			System.out.println("It is hot outside");
		}else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		}else {
			System.out.println("It is cold outside");
		}
		/* End logical operators */
	}

	/* Basic GUI interface */
	// Need "import javax.swing.JOptionPane;"
	public static void GUI_intro() {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " tall.");
	}
	
	/* Learning how to use a Math class for calculate something easily */
	public static void MATH_class() {
		double x = 3.14;
		double y = 10;
		
		double z = Math.max(x, y);
		z = Math.min(x, y);
		z = Math.abs(y);
		z = Math.sqrt(y);
		z = Math.round(x);
		z = Math.ceil(x);
		
		System.out.println("this is a test of Math class : " + z);
		
		// Hypotenuse counting by two side of triangle
		double a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter triangle side a:");
		a = scan.nextDouble();
		System.out.println("Enter triangle side b:");
		b = scan.nextDouble();
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("The hypotenuse is: " + c);
		
		scan.close(); // scanner needs to close after used
	}
	/* Learning how to use some useful methods of String class */
	public static void STRING_class() {
		String name = "Linen";
		
//		boolean result_equal = name.equals("linen");   // L and l is not the same
//		boolean result_equalI = name.equalsIgnoreCase("linen"); // L and l is same
//		int result_int = name.length(); // length of name
//		char result_char = name.charAt(0); // return a char of character at number (ex: 0 is "L")
//		int result_index = name.indexOf("n"); // return a number first time exist in the character (ex: "n" is 2)
//		boolean result_bool = name.isEmpty(); // return boolean if name is empty
//		String result_str = name.toUpperCase(); // return upper case / lower case(toLowerCase) of input string
//		String result_trim = name.trim(); // delete head and tail space of string (ex: "   Lin en " becomes "Lin en")
		String result_replace = name.replace('n', 'u'); // replace all character of string (replace only for char, not string)
		
		System.out.println(result_replace);
	}
	
	/* Create some random int / boolean / double / gaussian... */
	// Need "import java.util.Random;"
	public static void RANDOM_class() {
		Random rand = new Random();
		
//		int x = rand.nextInt(6) + 1; // 0~5 +1 becomes 1~6
//		double y = rand.nextDouble();
//		boolean z = rand.nextBoolean();
		double gau = rand.nextGaussian();
		
		System.out.println(gau);
	}
	
	/* if and switch statement */
	public static void If_switch_statement() {
		/* if statement */
		double height = 1.52; // m
		double weight = 52;  // kg
		double bmi = weight / Math.pow(height, 2);
		if(bmi < 18.5) {
			System.out.println("You are under weight!");
		}else if(bmi < 24) {
			System.out.println("You are standard weight!");
		}else {
			System.out.println("You are over weight!");
		}
		/* End if statement */
		
		/* switch statement */
		String day = "Friday";
		
		switch(day) {
		case "Monday":System.out.println("It is Monday!");
		break;
		case "Tuesday":System.out.println("It is Tuesday!");
		break;
		case "Wednesday":System.out.println("It is Wednesday!");
		break;
		case "Thursday":System.out.println("It is Thursday!");
		break;
		case "Friday":System.out.println("It is Friday!");
		break;
		case "Saturday":System.out.println("It is Saturday!");
		break;
		case "Sunday":System.out.println("It is Sunday!");
		break;
		default:System.out.println("That is not a day!");
		}
		/* End switch statement */
	}
	
	/* for/while/do while/nested/for-each loops */
	public static void Loop() {
		/* for loop */
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			// i++;
		}
		/* End for loop */
		
		/* for-each */
		/* normal array */
//		String[] animals = {"cat", "dog", "rat", "bird"};		
		/* array list */
		ArrayList<String> animals = new ArrayList<String>();	
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i: animals) {
			System.out.println(i);
		}
		/* End for-each */
		
		/* while loop */
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scan.nextLine();
		}
		/* End while loop */
		
		/* do while */
		do {
			System.out.println("Enter your name: ");
			name = scan.nextLine();
		} while(name.isBlank());
		/* End do while */
		
		/* nested loops (a loop inside of a loop) */
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter numbers of rows: ");
		rows = scan.nextInt();
		System.out.println("Enter numbers of columns: ");
		columns = scan.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scan.next();
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
		/* End nested loops */
		
		scan.close();
	}
	
	/* How Array and Arraylist work in Java */
	// ArrayList need "import java.util.ArrayList;"
	public static void Array_list() {
		/* 1D array */
		String car = "BMW";
		
		// type 1
		String[] cars = {"Camaro", "Tesla", "Corvette", "Mustang"};
		cars[0] = car;
		
		// type 2
		String[] cars2 = new String[3];
		cars2[0] = "Camaro";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		
		for(int i = 0; i < cars2.length; i++) {		
			System.out.println(cars2[i]);
		}
		/* End 1D array */
		
		/* 2D array */
		// type 1
		String[][] cars_2D = {
				{"Camaro", "Corvette", "Silverado"},
				{"Mustang", "Ranger", "F-150"},
				{"Ferrari", "Lambo", "Tesla"}
		};
		cars_2D[0][0] = car; // Only for let cars_2D be used
		
		// type 2
		String[][] cars2_2D = new String[3][3];
		
		cars2_2D[0][0] = "Camaro";
		cars2_2D[0][1] = "Corvette";
		cars2_2D[0][2] = "Silverado";
		cars2_2D[1][0] = "Mustang";
		cars2_2D[1][1] = "Ranger";
		cars2_2D[1][2] = "F-150";
		cars2_2D[2][0] = "Ferrari";
		cars2_2D[2][1] = "Lambo";
		cars2_2D[2][2] = "Tesla";
		
		for(int i = 0; i < cars2_2D.length; i++) {
			System.out.println();
			for(int j = 0; j < cars2_2D[i].length; j++) {
				System.out.print(cars2_2D[i][j]);
			}
		}
		/* End 2D array */
		
		/* Array list */
		ArrayList<String> cars_AL = new ArrayList<String>();
		
		cars_AL.add("Camaro");
		cars_AL.add("Lambo");
		cars_AL.add("Tesla");
		
		cars_AL.set(0, "BMW");
		cars_AL.remove(2);
		
		for(int i = 0; i < cars_AL.size(); i++) {
			System.out.println(cars_AL.get(i));
		}
		cars_AL.clear();
		/* End Array list */
		
		/* Array list 2D */
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		bakeryList.add("tomatoes");
		bakeryList.add("zucchini");
		bakeryList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		bakeryList.add("soda");
		bakeryList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(2).get(1)); // Should be "coffee" 
		/* End Array list 2D */
	}
	
	/* The difference of Data and Object */
	public static void wrapper_class() {
		/*¡@primitive	|¡@wrapper
		*---------------+---------------
		* boolean		| Boolean
		* char			| Character
		* int			| Integer
		* double		| Double
		* X				| String
		*/
		
		// autoboxing?
		// unboxing?
		
		Boolean a = true;
		Character b = '$';
		Integer c = 123;
		Double d = 3.14;
		String e = "Linen";
		
		// only if the "data" is an object can do these function
		a.booleanValue();
		b.charValue();
		c.byteValue();
		d.byteValue();
		e.charAt(4);
	}
	
	/* Method and overloaded methods*/
	public static void Method_overload() {
		hello_method("Linen", 25);						// Method sample
		System.out.println(add(24, 25));				// overload sample with (int, int)
		System.out.println(add(24, 25, 87));			// overload sample with (int, int, int)
		System.out.println(add(24, 25, 87, "Meow"));	// overload sample with (int, int, int, String)
	}
	static void hello_method(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old.");
	}
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static int add(int a, int b, int c, String d) {
		System.out.print(d + ", ");
		return a + b + c;
	}
	/* End Method_overload */
	
	// Keywords
	public static void keywords() {
		// Keyword: final ¡÷ variable cannot be change after initialize
		final double pi = 3.1415926;
		System.out.println(pi);
	}
	
	/* Exception (try catch, finally) */
	/* import java.util.InputMismatchException; */
	public static void Exception() {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter a number to divide: ");
			int x = scan.nextInt();
			System.out.println("Enter a number to divide by: ");
			int y = scan.nextInt();
			
			int z = x/y;
			
			System.out.println("result: " + z);
			scan.close();
		} 
		
		catch(ArithmeticException e) {		// This catch Error e are from Console that Failed last time
			System.out.println("Can't divide by zero.");
		} catch(InputMismatchException e) {	// This catch Error e are from Console that Failed last time
			System.out.println("Please enter a number.");
		} catch(Exception e) {				// This is a all exception, will control all kinds of error
			System.out.println("Sonething went wrong");
		}
		
		finally {
			System.out.println("This is the finally block"); // Always do finally after try catch
		}
	}
	
	/* Learning how to use some useful methods of File, FileWriter, FileReader */
	/* import java.io.File; import java.io.FileWriter; import java.io.FileReader; */
	public static void File_IO_sample() {
		/* File */
//		String file_path = "Test.txt";
		String file_path = "poem.txt";
		File file = new File(file_path); // import java.io.File;
		
		if(file.exists()) {
			System.out.println("That file path exists");
			
			// return path of "file"
			System.out.println(file.getPath());
			// return absolute path of "file"
			System.out.println(file.getAbsolutePath());
			// if "file" is a file return true, is document or others return false
			System.out.println(file.isFile());
			
			// This will delete "file" (dangerous function!)
			file.delete();
		} else {
			System.out.println("That file path doesn't exists");
		}
		
		/* FileWriter */
		/* When using FileWriter, we need try catch to protect program */
		file_path = "poem.txt";
		try {
			FileWriter writer = new FileWriter(file_path); // import java.io.FileWriter;
			writer.write("Roses are red \nViolets are blue\n"); // writing file
			writer.append("\n-----------------------------\nA poem wrote by myself."); // add after last line
			writer.close();
			
			System.out.println("<<Write successed!>>\n");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		/* FileReader */
		/* When using FileReader, we need try catch to protect program */
		file_path = "poem.txt";
		try {
			FileReader reader = new FileReader(file_path); // import java.io.FileReader;
			int data = reader.read();
			
			// read() will return an int value which contains the byte value
			// When read() returns -1, means there is no more data to be read
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
			System.out.println("\n<<Read successed!>>\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/* Learning how to use some useful methods to play audio file */
	/* .wav file only in this sample  */
	/* import javax.sound.sampled.*; import java.io.File; */
	public static void Audio_IO_sample() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		String file_path = "Doria.wav";
		File file = new File(file_path);
		
		AudioInputStream stream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(stream);
		
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, "
					+ "Q = quit, + = +5 second, - = -5 second");
			
			response = scan.next();
			response = response.toUpperCase();			
			
			switch(response) {
			case("P"):clip.start();
			break;
			case("S"):clip.stop();
			break;
			case("R"): clip.setMicrosecondPosition(0);
			break;
			case("+"): 
				int time = (int)clip.getMicrosecondPosition();
			System.out.println(time);
				clip.setMicrosecondPosition(time + 5000000);
			break;
			case("-"):
				time = (int)clip.getMicrosecondPosition();
				clip.setMicrosecondPosition(time - 5000000);
			break;
			case("Q"):break;
			default: System.out.println("Not a valid response");
			}
		}
		
		System.out.println("Bye~");
		clip.close();
		scan.close();
	}

	/* Learning some thread method and create a new thread in java */
	/* Use Mythread.java to override some Thread method */
	public static void Java_Thread() throws InterruptedException {
		System.out.println("numbers of thread: " + Thread.activeCount());				// We have 1 thread now
		System.out.println("thread name: " + Thread.currentThread().getName());			// Current thread is main
		Thread.currentThread().setName("MAIN");											// Change current thread from main to MAIN
		
		System.out.println("priority: " + Thread.currentThread().getPriority());		// Get priority of thread
		Thread.currentThread().setPriority(1);											// Set priority from 10(Highest) to 1(Lowest)
		
		System.out.println("thread is alive: " + Thread.currentThread().isAlive());		// Check if our thread is alive
		Thread.sleep(1000);																// Thread sleep 1 second
		
		MyThread thread2 = new MyThread();												// Create new thread from Mythread.java

		System.out.println("thread 2 name: " + thread2.getName());						// Return Thread-0
		System.out.println("thread 2 priority: " + thread2.getPriority());				// Return 1, because we set thread priority as 1 before
		thread2.setPriority(5);															// Set thread2 priority as 5
		System.out.println("thread 1 priority: " + Thread.currentThread().getPriority()	// Catch two threads priority
				+ ", thread 2 priority: " + thread2.getPriority());
		System.out.println("numbers of thread: " + Thread.activeCount());				// We have 2 thread now
		System.out.println("thread 2 is daemon thread: " + thread2.isDaemon());			// Not a deamon thread
		thread2.setDaemon(true);														// Now it is!
		
		System.out.println("thread 2 is alive: " + thread2.isAlive());					// Return false, because it havn't start yet
		thread2.start();																// Start our new thread
		System.out.println("thread 2 is alive: " + thread2.isAlive());					// Return true
	}
	
	/* Using multiple thread helps process maximum utilization of CPU */
	/* Use Mythread.java, Runnable_interface.java */
	public static void Multithread() throws InterruptedException {
		// Create thread type 1 by using Mythread.java
		// Create a subclass of Thread use MyThread.java
		MyThread thread1 = new MyThread();
		
		// Create thread type 2 by using Runnable_interface.java
		// Implement an interface and pass instance as an argument to Thread
		Runnable_interface runnable = new Runnable_interface();
		Thread thread2 = new Thread(runnable);
		
		/* Deamon thread have the worst priority then any other user thread,
		*  If all user thread have finished their jobs,
		*  Java won't wait deamon thread and close the process*/
//		thread1.setDaemon(true); // Default is false (means user thread)
//		thread2.setDaemon(true);
		
		thread1.start();
		thread2.start();
		
		thread1.join(3000); // do the next line after 3 seconds from thread.start()
		thread1.run();
		System.out.println("Testing");
		thread1.join(); 	// do the next line after thread1 finish working
		thread1.run();
		thread2.join();		// a thread create by type 2 can't detect join() function
		thread2.run();
	}
}




