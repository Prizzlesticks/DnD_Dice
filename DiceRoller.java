import java.util.Scanner;
import java.util.Random;

// Dice Rolling Program - designed to roll 2 dice of a user selected type - By RLPrill


public class DiceRoller {

	public static void main(String[] args) {

		Scanner sided = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String repeat = "y";
		String answer = "y";
		boolean correct = true;
		
		System.out.println("Welcome to the Grand Circus Digital Dice Roller!");

	 
			// give options for dice
			System.out.println("We'll be happy to help you roll 2 of the following," + '\n' + "4, 6, 8, 10, 12 or 20 sided dice.");
			while (repeat.equalsIgnoreCase("y")){
		while(correct) {
			// take user input
			System.out.println("Please enter the die you would like to roll:");
			int sides = sided.nextInt();
			
			if (sides != 4 && sides != 6 && sides != 8 && sides != 10 && sides !=12 && sides !=20) {
			correct = false;
			}
			
			else {
				System.out.println("You've entered an unaccepted number");
			} 
		
			// Invocation and Results
			int die1 = roll(sides);
			int die2 = roll(sides);

			// output results
			System.out.println("You rolled: " + "\nDie 1 is: " + die1 + "\nDie 2 is: " + die2);
		
			// add statement for 2/7&11/12
			// ask to roll again or enter new dice
			System.out.println("Would you like to try again? Yes to continue or any other entry to stop.");
			
			// Wait for user Entry
			 answer = sc.nextLine();
			while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n") ) {
				
				if (answer.equalsIgnoreCase("y"));
				
				else if (!answer.equalsIgnoreCase("n")); {
				System.out.println("Please enter a valid answer");
				answer = sc.next(); }
				
				if (answer.equalsIgnoreCase("n")) {
				break; }	
			
		
		System.out.println("Thank you for using the GC-DDR, Have a great day!"); 
		
		 
		}	
			
	}
		sc.close();
		sided.close();
		}
	}

	public static int roll(int sides) {
		
		// enter input into randomizer
		Random randomGen = new Random();

		int results = randomGen.nextInt(sides);

		return results + 1;
	}

}
