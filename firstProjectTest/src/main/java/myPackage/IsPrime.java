package myPackage;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("take no");
		int a = sc.nextInt();
		// int b=sc.nextInt();
		// int c=sc.nextInt();
		if (a == 1 || a == 0) {
			System.out.println("is prime");
		} else if (a % 2 == 0 || a % 3 == 0) {
			System.out.println("not prime");

		} else {

			System.out.println("is prime");
		}
	}

}
