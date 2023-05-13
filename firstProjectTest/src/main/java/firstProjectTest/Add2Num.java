package firstProjectTest;

import java.util.Scanner;

public class Add2Num {
	// int a = 0;
	// int b = 0;

	public int sum(int c, int d) {

		return c + d;
	}

	public int mul(int j, int k) {
		return j * k;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two num");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Add2Num obj = new Add2Num();
		// int add = obj.sum(a, b);
		// System.out.println("sum " + add);
		// int m = obj.mul(a, b);
		System.out.println(obj.mul(a, b));
	}

}
