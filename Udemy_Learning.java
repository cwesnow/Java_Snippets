// Several Files are pasted into this one, but they are short snippets covering basic principals. 

// Main Class
import java.util.Scanner;

public class Application {

	private static java.util.Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

    // List of Lessons - Another way to handle this menu is using a loop, like this...
    // String[] lessons = { "Hellow World", "Variables", "Strings", etc... };
    // for(String s in lessons) { System.out.println(s); }
    
		System.out.println("Tutorial Menu:");
		//System.out.println("[1] Hello World");		  // 5 - Udemy Lesson#
		//System.out.println("[2] Variables");			  // 6
		//System.out.println("[3] Strings");			    // 7
		//System.out.println("[4] While Loops");		  // 8
		//System.out.println("[5] For Loops");			  // 9
		//System.out.println("[6] If Logic");			    //10
		//System.out.println("[7] User Input");			  //11
		//System.out.println("[8] Do, While Loops");	//12
		//System.out.println("[9] Switch");				    //13
		//System.out.println("[10] Arrays");			    //14
		//System.out.println("[11] More Arrays");		  //15
		//System.out.println("[12] Multi- Arrays");		//16
		
    // Scanner class can throw Errors, always Test before committing to it
		String choice = sc.next();
		
    // This could be a bunch of if statements, but switches tend to be easier to read for this task.
		switch(choice){
		
		case "1":
			Lesson_1.HelloWorld();
			Lesson_1.HelloWorld("user");
			break;
		case "2":
			Lesson_2.variables();
			break;
		case "3":
			Lesson_3.strings();
			break;
		case "4":
			Lesson_4.loopWhile();
			break;
		case "5":
			Lesson_5.loopFor();
			break;
		case "6":
			Lesson_6.theIf();
			break;
		case "7":
			Lesson_7.getInput();
			break;
		case "8":
			Lesson_8.loopDoWhile();
			break;
		case "9":
			Lesson_9.theSwitch();
			break;
		case "10":
			Lesson10.theArray();
			break;
		case "11":
			Lesson11.theArray2();
			break;
		case "12":
			Lesson12.multiArray();
			break;
      
			default:
			System.out.println("default");
			break;
		}
		
		System.out.println("The end");
	}
}

// Lesson 1 - Print to the console, and display a variable with it
public class Lesson_1 {

  // Prints Hello World to the Console
	static void HelloWorld() {
		System.out.println("Hello World");
	}
  
  // Prints Hello {name} to the Console
	static void HelloWorld(String name) {
		System.out.println("Hello " + name);
	}
}

// Lesson 2 - Types of Variables
public class Lesson_2 {

	static void variables() {

		System.out.println(
      "byte (number, 1 byte) \n" +
      "short (number, 2 bytes) \n" +
      "int (number, 4 bytes) \n" +
      "long (number, 8 bytes) \n" +
      "float (float number, 4 bytes) \n" +
      "double (float number, 8 bytes) \n" +
      "char (a character, 2 bytes) \n" +
      "boolean (true or false, 1 byte)"
      );
      
		// String Variable is actually an Array
		/*
		 * char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' }; String
		 * helloString = new String(helloArray);
		 * System.out.println(helloString);
		 */
		System.out.println("String is an array of chars");
	}
}

// Lesson 3 - String practice, final variables
public class Lesson_3 {

	static void strings(){
		
		final String hi = "Hello";
		final String name1 = "Grokk";
		final String name2 = "Vayxoi";
		final String BLANK = " ";
		final int age = 22;
		final double money = 11.23;
		
		System.out.println(hi + BLANK + name1 + ".");
		System.out.println(hi + BLANK + name2 + ".");
		System.out.println(
				"We are only " + age + " years old with $" + money + " left over after last night.");
	}
}

// Lesson 4 - While Loop
public class Lesson_4 {

	static void loopWhile() {

		int cans = 12;

		System.out.println("Fresh 12 pack, help yourself!");
		while (cans > 0) {
			cans--;
			System.out.println("Chug one down, only " + cans + " left!");
		}
	}
}

// Lesson 5 - For Loop
public class Lesson_5 {

	static void loopFor() {

		for (int i = 0; i < 5; i++) {
			System.out.printf("The value of i is: %d%n", i);
		}
	}
}

// Lesson 6 - IF decisions
public class Lesson_6 {

	static void theIf() {

		int num = 1;
		System.out.println("I think your number is 1 . . .");

		if (num == 1)
			// True
			System.out.println("Correct, my number is 1.");
		else
			// False
			System.out.println("Incorrect, my number is not 1.");

    // Greeting based on Time Example
		num = java.util.Calendar.HOUR_OF_DAY;
		num += 5; // Local Time adjust
		if (num > 24)
			num = num - 24;

		if (num > 18 && num < 22)
			System.out.println("Good evening");
		else if (num > 6 && num < 12)
			System.out.println("Good morning");
		else if (num > 22 || num < 6)
			System.out.println("Good night");
		else
			System.out.println("Good day");
	}
}

// Lesson 7 - Scanner, Getting User Input
import java.util.Scanner;

public class Lesson_7 {

	// Prevents a resource leak?
	private static Scanner scanner;

	static void getInput() {

		// Output the prompt
		System.out.println("Enter your name: ");

    // Get Input
		scanner = new Scanner(System.in);
		String name = scanner.next();

		// Show what was entered.
		System.out.println("Hello " + name + ".");
	}
}

// Lesson 8 - Do While Loop, with input
import java.util.Scanner;

public class Lesson_8 {

	private static Scanner scanner;

	static void loopDoWhile() {
		scanner = new Scanner(System.in);

		int value = 0;
		do {
			System.out.println("Guess my number: between 0 and 100");
			value = scanner.nextInt();
		} while (value != 0);

		System.out.println("You got it!! It was 0.");
	}
}

// Lesson 9 - Switch
import java.util.Scanner;

public class Lesson_9 {

	private static Scanner sc;

	static void theSwitch() {

		sc = new Scanner(System.in);
		int num = 1;

		while (num > 0) {
			System.out.println("Enter power level: 1,2,3,4 or 0 to exit");

			num = sc.nextInt();

			switch (num) {
			case 0:
				System.out.println("System Auto-Pilot Engaged");
				break;
			case 1:
				System.out.println("No power");
				break;
			case 2:
				System.out.println("Low power");
				break;
			case 3:
				System.out.println("Medium power");
				break;
			case 4:
				System.out.println("High power");
				break;
			default:
				System.out.println("Invalid Command");
				break;
			}
		}
	}
}

// Lesson 10 - Arrays
public class Lesson10 {

	static void theArray() {
		System.out.println("Lesson 10: Arrays");

		System.out.println("Created an array called numbers. \n int[] numbers");
		int[] numbers = { 1, 2, 3 };
		String[] fruit = new String[3];

		fruit[0] = "Apple";
		fruit[1] = "Pear";
		fruit[2] = "Zuchini";

		for (int x = 0; x < numbers.length; x++) {
			System.out.println(numbers[x] + " " + fruit[x]);
		}
	}
}

// Lesson 11 - Arrays again, String.join() and for(each : collection)
public class Lesson11 {

	static void theArray2() {
		String[] sentence = new String[5];
		sentence[0] = "HAPPY";
		sentence[1] = "NEW";
		sentence[2] = "YEARS";
		sentence[3] = " ";
		sentence[4] = "!";

		System.out.println(String.join(sentence[3], sentence[0], sentence[1], sentence[2], sentence[4]));

		String[] cars = { "Mustang", "Raptor", "Pinto" };

		for (String car : cars) {
			System.out.println(car);
		}

		String NULL = null;
		System.out.println("Strings initialize as " + NULL);

		String[] sentence2 = new String[1];
		System.out.println("String Arrays initialize as " + sentence2[0]);
	}
}

// Lesson 12 - Multi-Dimensional Arrays
import java.util.Scanner;

public class Lesson12 {

	private static Scanner sc;

	static void multiArray() {
		boolean gameover = false;
		sc = new Scanner(System.in);
		System.out.println("Multi-Dimensional Array");

		int[][] map = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		while (gameover == false) {

			for (int y = 0; y < 3; y++) {
				System.out.println("-------");
				System.out.print("|");
				for (int x = 0; x < 3; x++) {
					System.out.print(map[y][x]);
					if (x == 2)
						System.out.println("|");
					else
						System.out.print("|");
				}
			}
			System.out.println("-------");

			boolean isValid = false;
			do {
				System.out.println("Place token where?");
				int x = -1 + sc.nextInt();
				if (x < 0 || x > 8 || map[x / 3][x % 3] == 0)
					System.out.println("Invalid");
				else
					map[x / 3][x % 3] = 0;
				isValid = true;
			} while (isValid == false);

			// Straight Across & Down WIns
			for (int x = 0; x < 3; x++) {
				if (map[0][x] == 0 && map[1][x] == 0 && map[2][x] == 0)
					gameover = true;
				if (map[x][0] == 0 && map[x][1] == 0 && map[x][2] == 0)
					gameover = true;
			}

			// Diagonal Wins, if middle is marked - check the corners for a win
			if (map[1][1] == 0){
				if (map[0][0] == 0 && map[2][2] == 0)
					gameover = true;				
			} else
				if (map[0][2] == 0 && map[2][0] == 0)
				gameover = true;
		}
		System.out.println("Congratulations!");
	}
}

// Lesson 13
