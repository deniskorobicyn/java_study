package condition.statment.mrspoy.com;

import java.util.GregorianCalendar;
import java.util.Scanner;

class Example {

	private Scanner keyboard;

	private void elseAndIf(){
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
			System.out.println( "We should take the cars." );
		else if ( cars < people )
			System.out.println( "We should not take the cars." );
		else
			System.out.println( "We can't decide." );

		if ( buses > cars )
			System.out.println( "That's too many buses." );
		else if ( buses < cars )
			System.out.println( "Maybe we could take the buses." );
		else
			System.out.println( "We still can't decide." );

		if ( people > buses )
			System.out.println( "All right, let's just take the buses." );
		else
			System.out.println( "Fine, let's stay home then." );

	}

	private String getWeekDay( int weekday )
	{
		switch (weekday) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
		case 0:
			return "Saturday";
		default:
			return "error";
		}

	}

	private void howOldAreYou() {
		// TODO Auto-generated method stub
		System.out.print("Hey, what's your name? ");
		String name = keyboard.next();

		System.out.print("Ok, " + name +", how old are you? ");
		int age = keyboard.nextInt();

		if(age >= 25)
			System.out.println("You can do anything that's legal, " + name);
		else
			if(age >= 18)
				System.out.println("You can't rent a car, " + name);
			else
				if(age >= 16)
					System.out.println("You can't vote, " + name);
				else
					System.out.println("You can't drive, " + name);
		System.out.println();
	}

	void run() {
		keyboard = new Scanner(System.in);

		whatIf();
		elseAndIf();
		howOldAreYou();
		weekDays();

		keyboard.close();
	}

	private void weekDays(){
		System.out.println( "Weekday 1: " + getWeekDay(1) );
		System.out.println( "Weekday 2: " + getWeekDay(2) );
		System.out.println( "Weekday 3: " + getWeekDay(3) );
		System.out.println( "Weekday 4: " + getWeekDay(4) );
		System.out.println( "Weekday 5: " + getWeekDay(5) );
		System.out.println( "Weekday 6: " + getWeekDay(6) );
		System.out.println( "Weekday 7: " + getWeekDay(7) );
		System.out.println( "Weekday 0: " + getWeekDay(0) );
		System.out.println();
		System.out.println( "Weekday 43: " + getWeekDay(43) );
		System.out.println( "Weekday 17: " + getWeekDay(17) );
		System.out.println( "Weekday -1: " + getWeekDay(-1) );

		GregorianCalendar cal = new GregorianCalendar();
		int dow = cal.get(GregorianCalendar.DAY_OF_WEEK);

		System.out.println( "\nToday is a " + getWeekDay(dow) + "!" );
	}

	private void whatIf(){
		int people = 20;
		int cats = 20;
		int dogs = 15;

		if ( people < cats )
			System.out.println( "Too many cats!  The world is doomed!" );

		if ( people > cats )
			System.out.println( "Not many cats!  The world is saved!" );

		if ( people < dogs )
			System.out.println( "The world is drooled on!" );

		if ( people > dogs )
			System.out.println( "The world is dry!" );

		dogs += 5;

		if ( people >= dogs )
			System.out.println( "People are greater than or equal to dogs." );

		if ( people <= dogs )
			System.out.println( "People are less than or equal to dogs." );

		if ( people == dogs )
			System.out.println( "People are dogs." );

		System.out.println();
	}



}
