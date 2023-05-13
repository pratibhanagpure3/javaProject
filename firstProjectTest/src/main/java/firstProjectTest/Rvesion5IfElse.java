package firstProjectTest;

import java.util.Scanner;

public class Rvesion5IfElse {
	public static void main(String[] arg) {
		System.out.println("addition 1");
		System.out.println("substraction 2");
		System.out.println("multiplication 3");
		System.out.println("divide 4");
		System.out.println("exit 5");
		System.out.println();

		int num1, num2, ch = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter num 1");
		num1 = input.nextInt();
		System.out.println("enter num 2");
		num2 = input.nextInt();

		System.out.println("enter choise");
		ch = input.nextInt();

		nastedIfElse(num1, num2, ch);
		switchCase(num1, num2, ch);
	}

	private static void nastedIfElse(int num1, int num2, int ch) {
		if (ch == 1) {
			System.out.println("add " + (num1 + num2));
		} else if (ch == 2) {
			System.out.println("sub " + (num1 - num2));
		} else if (ch == 3) {
			System.out.println("divi " + (num1 / num2));
		} else if (ch == 4) {
			System.out.println("mul " + (num1 * num2));
		} else {
			System.out.println("invalid opration");
		}
	}

	private static void switchCase(int num1, int num2, int ch) {
		switch (5) {
		case 1:
			System.out.println("add " + (num1 + num2));
			break;
		case 2:
			System.out.println("sub " + (num1 - num2));
			break;
		case 3:
			System.out.println("div " + (num1 / num2));
			break;
		case 4:
			System.out.println("mul " + (num1 * num2));
			break;
		default:
			System.out.println("invalid");
		}
	}

}
