package firstProjectTest;

public class ForPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 && j > 0) {
					System.out.print("*");
				} else if (i == 2 && j == 1 || j == 5) {
					System.out.print("*");
				} else if (i == 3 && j == 1 || j == 5) {
					System.out.print("*");
				} else if (i == 4 && j > 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
