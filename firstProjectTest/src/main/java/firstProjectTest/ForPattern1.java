package firstProjectTest;

public class ForPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println(".............................");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(".............................");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			for (int j = 5; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("................................");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
