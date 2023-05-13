package myPackage;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take no of rows");
		int row = sc.nextInt();
		System.out.println("take no of col");
		int col = sc.nextInt();

		int[][] num = new int[row][col];

		// for input
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		System.out.println("take value of x");
		int x = sc.nextInt();

//for output
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (num[i][j] == x) {
					// System.out.print(num[i][j] + " ");
					System.out.print(" index found value of x" + " " + i + " " + j);
				}
			}
			System.out.println();
		}
	}

}
