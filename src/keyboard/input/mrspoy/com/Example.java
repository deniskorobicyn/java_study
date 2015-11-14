package keyboard.input.mrspoy.com;
import java.util.Scanner;

class Example {
	private Scanner keyboard;

	private void ageInFiveYears(){
		System.out.print("Hello. What is your name?");
		String name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you? ");
		int age = keyboard.nextInt();

		System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
	}

	private void askingQuestions() {
		int age;
		String height;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + " tall and " + weight + " heavy." );
	}

	private void bmiCalculator(){
		final float inches_in_meter = 39.37f;
		final float pounds_in_kg = 2.20462262f;
		final float feet_in_meter = 3.2808399f;
		System.out.print("Your height (feet only): ");
		float height = keyboard.nextFloat() / feet_in_meter;

		System.out.print("Your height (inches only): ");
		height += keyboard.nextFloat() / inches_in_meter;

		System.out.print("Your weight in pounds: ");
		float weight = keyboard.nextFloat() / pounds_in_kg;

		System.out.println("Your BMI is " + weight / (height * height));
	}

	private void dumbCalculator(){
		System.out.print("What is your first number?");
		float a = keyboard.nextFloat();

		System.out.print("What is your second number?");
		float b = keyboard.nextFloat();

		System.out.print("What is your third number?");
		float c = keyboard.nextFloat();

		String result = String.format("%.1f", ((a + b + c) / 2.0));
		System.out.println("( " + a + " + " + b + " + " + c + " ) / 2 = " + result);
	}

	private void forgetfulMachine() {
		System.out.print("Give me a word! ");
		keyboard.next();

		System.out.print("Give me a second word! ");
		keyboard.next();

		System.out.print("Give me a number! ");
		keyboard.nextInt();

		System.out.print("Give me a second number! ");
		keyboard.nextInt();

		System.out.println("Done! Formating you drive... ");
		System.out.println("HA-HA! NVM.. ");
	}

	private void moreUserInputOfData(){
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.print("First name: ");
		String first_name = keyboard.next();

		System.out.print("Last name: ");
		String last_name = keyboard.next();

		int grade;
		do{
			System.out.print("Grade (9-12): ");
			grade = keyboard.nextInt();
		}while(grade > 12 || grade < 9);

		System.out.print("Student ID: ");
		int id = keyboard.nextInt();

		System.out.print("Login: ");
		String login = keyboard.next();

		float gpa;
		do{
			System.out.print("GPA (0.0-4.0): ");
			gpa = keyboard.nextFloat();
		}while(gpa < 0.0 || gpa > 4.0);
		class Person {
			private String _first_name;
			private String _last_name;
			private int _id;
			private int _grade;
			private String _login;
			private float _gpa;

			Person(int id, String first_name, String last_name, int grade, String login, float gpa){
				_id = id;
				_first_name = first_name;
				_last_name = last_name;
				_grade = grade;
				_login = login;
				_gpa = gpa;
			}

			void printFormated(){
				System.out.println("Your information: ");
				System.out.println("     Login: " + _login);
				System.out.println("     ID:    " + _id);
				System.out.println("     Name:  " + _last_name + ", " + _first_name);
				System.out.println("     Gpa:   " + _gpa);
				System.out.println("     Grade: " + _grade);
			}
		};

		Person p = new Person(id, first_name, last_name, grade, login, gpa);

		p.printFormated();

	}

	private void nameAgeAndSalary() {
		System.out.print("Hello.  What is your name?");
		String name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you?");
		int age = keyboard.nextInt();

		System.out.print("So you're " + age + ", eh?  That's not old at all!");
		System.out.print("How much do you make, " + name + "?");
		int money = keyboard.nextInt();

		System.out.print(money + "! I hope that's per hour and not per year! LOL!");
	}

	public void run(){
		keyboard = new Scanner(System.in);

		bmiCalculator();
		dumbCalculator();
		askingQuestions();

		forgetfulMachine();

		nameAgeAndSalary();

		moreUserInputOfData();

		ageInFiveYears();

		keyboard.close();
	}
}
