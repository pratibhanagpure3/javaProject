package firstProjectTest;

//7.9.22
public class Ifpuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle1();
		puzzle2();
		puzzle3();
		puzzle4();
	}

	static void puzzle1() {
		int k = 30;
		if (k > 30) {
			System.out.println(1);
		} else if (k > 35) {
			System.out.println(2);
		} else if (k > 20) {
			System.out.println(3);
		}
		if (k < 30) {
			System.out.println(4);
		}
	}

	static void puzzle2() {
		int m = 40;
		if (m > 30) {
			System.out.println("true");
		}
		if (m < 50) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	static void puzzle3() {
		int i = 9;
		if (i > 5) {
			if (i > 10) {
				System.out.println("i<10");
			} else {
				System.out.println("not true");
			}
		} else {
			System.out.println("all false");
		}
	}

	static void puzzle4() {
		int num = 30;
		if (num < 35) {
			num++;
			System.out.println(num);
		}
		num++;
		System.out.println(num);
	}
}
