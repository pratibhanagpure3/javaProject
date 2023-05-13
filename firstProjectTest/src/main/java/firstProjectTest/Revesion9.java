package firstProjectTest;

public class Revesion9 {
	// int b=0;
	public static void isPrime(int a) {
		// int b = 0;
		if (a == 2) {
			System.out.println("2 is a prime num");
		} else if (a == 3) {
			System.out.println("3 is a prime num");
		} else if (a == 5) {
			System.out.println("5 is a prime num");
		} else if (a == 7) {
			System.out.println("7 is a prime num");
		} else if (a == 11) {
			System.out.println("11 is a prime num");
		} else {
			System.out.println("not prime num");
		}

	}

	public static void isPrimeArry(int[] b) {
		int c[] = { 2, 3, 5, 7, 11 };
		if (b == c) {
			System.out.println("is a prime num");
		}
	}

	public static boolean primeFor(int num) {
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				// System.out.println("false");
				return false;
			}
		}
		return true;
	}

	// public static void IsPrime3(int ) {
	// int
	// }

	public static void main(String[] args) {
		// System.out.println(isPrime(4));

		// Revesion9 obj =new Revesion9();
		boolean var = primeFor(8);
		System.out.println(var);

	}

}
