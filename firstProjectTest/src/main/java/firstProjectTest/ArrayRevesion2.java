package firstProjectTest;

public class ArrayRevesion2 {

	public static void main(String[] args) {

		int[] marks = new int[3];
		marks[0] = 99;
		marks[1] = 98;
		marks[2] = 97;
		System.out.println(marks[2]);
		System.out.println();
		System.out.println("..........................");

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("..............");
		int[] num = { 2, 4, 6, 8 };
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println(num[i]);
		}

	}

}
