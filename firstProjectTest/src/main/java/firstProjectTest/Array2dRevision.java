package firstProjectTest;

import java.util.Scanner;

public class Array2dRevision {

	public static void main(String[] arg) {
		System.out.println("take input from user");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int colm = sc.nextInt();
		int[][] num = new int[rows][colm];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colm; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("input x value");
		int x = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colm; j++) {
				if (num[i][j] == x) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

}
