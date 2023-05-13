package firstProjectTest;

public class SumOneToTen {
	public static void main(String[] args) {

		int finalOutput = sumofNumber(6);
		int a = finalOutput + 10;
		System.out.println("final Output " + finalOutput);
		System.out.println(a);
	}

	private static int sumofNumber(int num) {
		int output = 0;
		for (int i = 1; i <= num; i++) {
			System.out.println("i ki value " + i);

			output = output + i;

			System.out.println("output ki vslue  " + output);
		}
		return output;

	}

}
