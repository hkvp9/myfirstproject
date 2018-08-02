/*Hannah Kelly
 * 7/23/18
 * if and else practice assignment.
 */

import java.util.Scanner;
public class Ifpracticehk {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Get ready for a quiz!");
		System.out.println("What is 2 + 6 ?");
		int x = keyboard.nextInt();
		
		if(x != 8) {
			System.out.println("I'm sorry, that is incorrect!" + "\n" + "The correct answer was 8.");
			
		}if(x == 8) {
			System.out.println("That is correct!");
		}
		
		//figured out i had to change the integer so that that correct responses would be dropped in.
		
		System.out.println("What is the sum of 6 and 6 when multiplied?");
		int y = keyboard.nextInt();
		if (y != 36) {
			System.out.println("I'm sorry, that was incorrect");
		}if(y == 36) {
			System.out.println("Great job! It is 36.");
		}
		
		System.out.println("What is the sum of 9 divided by 0?");
		int z = keyboard.nextInt();
		if(z != 0) {
			System.out.println("I'm sorry, that was incorrect");
		}if(z == 0) {
			System.out.println("That was correct!");
		}

	}		
}