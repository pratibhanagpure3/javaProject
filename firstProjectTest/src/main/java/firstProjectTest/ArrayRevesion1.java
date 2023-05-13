package firstProjectTest;

import java.util.Scanner;

public class ArrayRevesion1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		int[] array = new int[num];

		// for input
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}

		// for output
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
	}

}
