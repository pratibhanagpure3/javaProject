package firstProjectTest;

public class student {
	static int[] marks;
	String name;

	public student(String name, int[] marks) {
		this.marks = marks;
		this.name = name;
	}

	public static int getNumberOfMarks() {
		int num = 0;
		for (int i : marks) {
			System.out.println(i);
			num = i;
		}
		return num;
	}

	public static int numberMarks() {
		System.out.println(marks.length);
		return 0;
	}
}
