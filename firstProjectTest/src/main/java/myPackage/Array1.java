package myPackage;

public class Array1 {

	public static void main(String[] args) {

//definig array type 1

		int[] marks = new int[3];
		// store marks
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 99;
		// marks[3] = 87;
		System.out.println("print one marks");
		System.out.println(marks[1]);
		System.out.println();
		// if i want to print all marks of the list,i have to use for loop
		System.out.println("print all marks");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// defining array type 2

		int[] num = { 97, 95, 98 };
		System.out.println("print num" + "  " + num[2]);

		for (int i = 0; i < num.length; i++) {
			System.out.println("print all num" + "  " + num[i]);
		}
	}

}
