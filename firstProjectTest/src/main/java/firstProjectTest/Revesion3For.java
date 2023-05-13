package firstProjectTest;

public class Revesion3For {

	public static void main(String[] args) {
		// int n = 6;
		System.out.println("print 6 table");
		for (int i = 1; i <= 10; i++) {

			System.out.print(6 * i + " ");
			System.out.printf("%d * %d = %d", 6, i, 6 * i).println();
		}

		System.out.println();
		System.out.println("print num 1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.println("print num 1 to 10 -" + "   " + i);
		}

		System.out.println();
		System.out.println("print num 10 to 1");
		for (int i = 10; i >= 1; i--) {
			System.out.println("num 10 to 1 -" + "   " + i);
		}

		System.out.println();
		System.out.println("print even numm square up to 10");
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println("square" + "  " + i * i);
		}

		System.out.println();
		System.out.println("print 1 to 10 numm square ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("even" + "  " + i * i);
		}

		System.out.println();
		System.out.println("print alternate even num");
		for (int i = 10; i >= 1; i = i - 2) {
			System.out.println("alternate even num" + "  " + i);
		}

		System.out.println();
		System.out.println("print alternate odd num ");
		for (int i = 9; i >= 1; i = i - 2) {
			System.out.println("alternate odd num" + "  " + i);
		}

		System.out.println();
		System.out.println("print 10 even numm square");
		for (int i = 0; i <= 10; i++) {
			System.out.println(2 * i * 2 * i);
		}

		System.out.println();
		System.out.println("print 10 odd numm square");
		for (int i = 1; i <= 10; i++) {
			System.out.println((2 * i - 1) * (2 * i - 1));
		}

		System.out.println();
		System.out.println("print even numm cube");
		for (int i = 0; i <= 10; i++) {
			System.out.println(2 * i * 2 * i * 2 * i);
		}
	}

}
