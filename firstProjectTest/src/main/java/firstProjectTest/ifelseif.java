package firstProjectTest;

import java.util.Scanner;

public class ifelseif {
	static int marks;

	public static void main(String[] arg) {
		// ifelseif obj = new ifelseif ();
		// int number;
		System.out.print("enter value");
		Scanner s = new Scanner(System.in);
		marks = s.nextInt();
		if (marks > 50) {
			System.out.print("number is greater than 50");
		}

		else {
			System.out.print("number is less than 50");
		}
	}
}