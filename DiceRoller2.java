import java.util.Random;
import java.util.Scanner;

public class DiceRoller2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String repeat = "y";
		int choice = 0;
		int temp = 0;
		int sides = 0;
		int qty = 0;
		int i = 0;

		System.out.println("Greetings, Lets use the DnD Dice to determine our fate!");
		
		while(repeat.equalsIgnoreCase("y")) {    
				do {
				System.out.println("Please select one of the following Sided Dice: \n "
				+ "1) 4 \t 2) 6 \t 3) 8 \t 4) 10 \t 5) 12 \t 6) 20");
				
				while (!scan.hasNextInt())	{
					System.out.println("Please Enter a number 1-6");
					scan.next();
				
				} 
				temp = scan.nextInt();
				
				} while (temp < 1 || temp > 6);
				choice = temp;
							
			switch(choice) {
				case 1: sides=4;
				break;
				case 2: sides=6;
				break;
				case 3: sides=8;
				break;
				case 4: sides=10;
				break;
				case 5: sides=12;
				break;
				case 6: sides=20;
				break;
			}
			
			System.out.println("How many dice would you like to roll of this kind?");
			qty = scan.nextInt();	
				
				while (i < qty) {
					int die = roll(sides);
					System.out.println("You rolled a: " + die);
					i++;
				}
				i =0;
				sides = 0;
			System.out.println("Would you like to make another roll?");
			System.out.println("Please enter (1) for YES or (2) for NO");
			
			int go =scan.nextInt();
			
			while (go > 2 || go < 1) {
				System.out.println("Please enter 1 or 2");
				go = scan.nextInt();
			}
			
			switch(go) {
			case 1: repeat="y";
			break;
			case 2: repeat="n";
			break;
			}
		}
		System.out.println("Thank you for choosing our Digital Dice roller \nRemember us for your next game session");
		scan.close();
	}
	
	public static int roll(int sides) {
		
		// enter input into randomizer
		Random randomGen = new Random();

		int results = randomGen.nextInt(sides);

		return results + 1;
	}
}
