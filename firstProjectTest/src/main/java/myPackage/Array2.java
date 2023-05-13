package myPackage;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		// System.out.println(args.toString());

		// take an array as input from user and find the given value of x

		Scanner sc = new Scanner(System.in);
		System.out.println("take size from user");
		int size = sc.nextInt();

		int[] num = new int[size];

		// for input
		System.out.println("input value");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("input value of x");
		int x = sc.nextInt();
		// for output
		for (int i = 0; i < num.length; i++) {
			if (num[i] == x) {
				System.out.println(" x found at index" + "  " + i);
			}
		}
	}

}
