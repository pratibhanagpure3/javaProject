package firstProjectTest;

public class Revesion10for {

	public static void main(String[] args) {

		int output = 0;

		for (int i = 1; i <= 10; i++) {

			output = output + i;
			System.out.println("final value " + output);
		}
		System.out.println("output ki value " + output);

		int sum = 0;
		int num = 8;
		for (int k = 1; k <= num - 1; k++) {
			if (num % k == 0) {
				System.out.println(k);
				sum = sum + k;
			}
			// sum = sum + k;
			// System.out.println(sum);
		}
		System.out.println(sum);

		for (int j = 0; j <= 5; j++) {
			System.out.println();
			for (int l = 1; l <= 5; l++) {
				System.out.print(l);
				// System.out.print();
			}
			// System.out.println();
		}
	}

}
