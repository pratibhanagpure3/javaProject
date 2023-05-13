package firstProjectTest;

public class studentRunner {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96 };

		student st1 = new student("khush", marks);
		int number = student.getNumberOfMarks();
		System.out.println(number);

		int mark = student.numberMarks();
		System.out.println(mark);
	}

}
