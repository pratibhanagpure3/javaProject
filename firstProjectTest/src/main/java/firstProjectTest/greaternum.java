package firstProjectTest;

import java.util.Scanner;

public class greaternum {
	public static void main(String[] arg) {

		int number;

		System.out.print("enter number");
		Scanner s = new Scanner(System.in); // console se / system se input lene ke liye System.in
		// s = , s me value set ho jayegi jo b likhe hai console me
		number = s.nextInt(); // s se (obj name se integer value nikalkr number variable name me set kr dega )
		System.out.print("value of number " + number);
		// System.out.print( number);

		if (number > 50) {
			System.out.print("number is greater than 50");
		} else {
			System.out.print("number is less than 50");
		}

	}
}
