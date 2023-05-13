package firstProjectTest;

import java.util.Scanner;

public class ArrayRevision3 {

	public static void main(String[] args) {
		System.out.println("take input");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		// for input
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("input search value");
		int x = sc.nextInt();
		// for output
		for (int i = 0; i < size; i++) {
			if (num[i] == x) {
				System.out.println(i);
			}
		}

	}

}
