package firstProjectTest;

//7.9.22
public class ForUse {
	private int i;

	public ForUse(int i) {
		this.i = i;
	}

	public boolean isPrime() {
		for (int j = 2; j <= i - 1; j++) {
			if (i % j == 0) {

				return false;
			}
		}
		return true;
	}

	public boolean isPrime(int number) {
		// int count = 0;
		boolean flagPrime = false;
		for (int j = 2; j < number; j++) {
			if (number % j != 0) {
				System.out.println(" prime num" + j);
				// count++;
				flagPrime = true;

			}
		}
		if (flagPrime) {
			return true;
		} else
			return false;
	}

	public int SumUpTon() {
		// int n = 0;
		int sum = 0;
		for (int j = 1; j <= i; j++) {

			// System.out.println(j);
			sum = sum + j;
		}
		return sum;
	}

	public int SumDivisor() {
		// int n = 0;
		int sum = 0;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				System.out.println(j);
				sum = j;
			}

		}
		return sum;

	}

	public int NoOfTringle() {
		int tri = 0;
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k + " ");
				tri = j;
			}
			System.out.println();
		}
		return tri;
	}
}
