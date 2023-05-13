package firstProjectTest;

public class OverRideing {
	public static void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
		}

	}

	public static void print(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a * i);
		}
	}

	public static void main(String[] args) {
		print();
		print(4);

	}

}
