package firstProjectTest;

//8.9.22
public class SumOfDiviser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisor();

	}

	public static void divisor() {
		int n = 6;
		int coutOfNonDevide = 0;
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				coutOfNonDevide++;

				sum = sum + i;
				// System.out.println(sum);
			}
			// System.out.println(sum);
		}
		System.out.println("total count of devisor" + coutOfNonDevide);
		System.out.println(sum);
	}
}
