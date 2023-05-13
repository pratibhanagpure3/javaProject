package firstProjectTest;

import java.util.Scanner;

public class ForScanSwitchCase {

	public static void main(String[] args) {
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1 add");
		System.out.println("2 sub");
		System.out.println("3 mul");
		System.out.println("4 divi");
		System.out.println("5 exit");
		try {
			while (num <= 5) {

				System.out.println("enter num1");
				num1 = scan.nextInt();
				System.out.println("enter num2");
				num2 = scan.nextInt();
				// System.out.println("1 add");
				// System.out.println("2 sub");
				// System.out.println("3 mul");
				// System.out.println("4 divi");
				// System.out.println("5 exit");
				num++;
				System.out.println("enter choice");

				// System.out.println("enter num to exit");
				num = scan.nextInt();
			}

			switch (num) {
			case 1:
				System.out.println("add" + " " + (num1 + num2));
				break;
			case 2:

				System.out.println("sub" + " " + (num1 - num2));
				break;
			case 3:
				System.out.println("mul" + " " + (num1 * num2));
				break;
			case 4:
				System.out.println("divi" + " " + (num1 / num2));
				break;
			case 5:
				System.out.println("exit");
				break;

			}
			if (num > 5) {
				System.out.println("exception");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
