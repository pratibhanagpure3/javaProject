package firstProjectTest;

public class revesion4Method {

	public static void sayHelloWorld(String str) {
		System.out.println(str);
		System.out.println();
	}

	public static void sayHelloWorld3(int time3) {
		for (int i = 1; i <= time3; i++) {// printed 3 times
			System.out.println("hello world");
		}
		System.out.println();
	}

	public static void printNum(int num) {
		for (int k = 1; k <= num; k++) {
			System.out.println(k * k);
		}
		System.out.println();
	}

	public static void sumOfNum(int a, int b) {
		System.out.println(a + b);
		System.out.println();
	}

	public static void multiplicationTable(int b) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(b * i);

		}
	}

	public static void main(String[] args) {
		sayHelloWorld("hello world");
		sayHelloWorld3(6);
		printNum(10);
		sumOfNum(3, 4);
		multiplicationTable(7);
		// System.out.println(b*i);
	}

}
