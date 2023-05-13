package firstProjectTest;

import java.util.Scanner;

public class RevesionDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("enter number");
			num = scan.nextInt();
			System.out.println("cube " + num * num * num);
			// num++;
		} while (num >= 0);
		System.out.println("thank you! have fun");
	}

}
