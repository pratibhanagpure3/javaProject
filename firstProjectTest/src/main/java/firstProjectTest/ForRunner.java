package firstProjectTest;

public class ForRunner {

	public static void main(String[] args) {
		// ForUse obj1 = new ForUse(10);
		// ForUse obj2 = new ForUse(5);
		ForUse obj3 = new ForUse(3);
		boolean ref = obj3.isPrime();
		System.out.println("isprime" + " " + ref);

		ForUse obj1 = new ForUse(10);
		int r = obj1.SumUpTon();
		System.out.println(r);

		ForUse obj2 = new ForUse(6);
		obj2.SumDivisor();
		// System.out.println(m);

		ForUse obj4 = new ForUse(5);
		int h = obj4.NoOfTringle();
	}

}
