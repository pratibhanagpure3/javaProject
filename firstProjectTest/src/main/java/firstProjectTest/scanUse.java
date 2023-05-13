package firstProjectTest;

import java.util.Scanner;

public class scanUse {

	public static void main(String[] args) {
		int number1, number2, ch;
		// System.out.println("enter two number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		number1 = sc.nextInt();
		System.out.println("enter number2");
		number2 = sc.nextInt();
		// System.out.println("add 1");
		// System.out.println("sub 2");
		// System.out.println("mul 3");
		// System.out.println("div 4");
		System.out.println("enter your choise");
		ch = sc.nextInt();
		/*
		 * if (ch == 1) { System.out.println("add" + " " + (number1 + number2)); } if
		 * (ch == 2) { System.out.println("sub" + " " + (number1 - number2)); } if (ch
		 * == 3) { System.out.println("mul" + " " + (number1 * number2)); } if (ch == 4)
		 * { System.out.println("div" + " " + (number1 / number2)); }
		 */
		switch (ch) {
		case 1:
			System.out.println("add" + " " + (number1 + number2));
		case 2:
			System.out.println("sub" + " " + (number1 - number2));
		default:
			System.out.println("invalid operation");
		}
	}
}
