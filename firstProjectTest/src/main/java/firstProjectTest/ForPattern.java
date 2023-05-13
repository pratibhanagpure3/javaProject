package firstProjectTest;

public class ForPattern {

	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 && j == 5) {
					System.out.print("*");
				} else if (i == 2 && j > 3) {
					System.out.print("*");
				} else if (i == 3 && j > 2) {
					System.out.print("*");
				} else if (i == 4 && j > 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("............................");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
