package firstProjectTest;

public class Recursion1 {
	// static int n = 5;

	public static void print(int n) {

		if (n == 0) {
			return;
		}
		System.out.println(n);

		print(n - 1);

		// System.out.println(n);
	}

	public static void main(String[] args) {
		// int n = 5;
		print(5);
		// System.out.println(n);

	}

}
