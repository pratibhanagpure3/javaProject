package firstProjectTest;

//12.9.22
import java.math.BigDecimal;

public class studentArrAy {
	private String name;
	private int[] marks;

	studentArrAy(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximum = 0;// Integer.MIN_VALUE
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverage() {
		int sum = getSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number));// it works only three decimal value,,if get decimal
																	// value in rounding mode than its gives you integer
																	// output.
		// return new BigDecimal (sum/number); get the vaule in integer form bcz we are
		// calculating int sum/number
	}

	public String toString() {
		return name + marks;
	}

	public int addNewMark(int c) {
		// marks.add(mark);
		return 35;
	}

	public static void main(String[] args) {
		int[] marks = { 99, 98, 97, 96 };
		studentArrAy stud = new studentArrAy("khush", marks);

		System.out.println();
		int number = stud.getNumberOfMarks();
		System.out.println("numberOfMarks" + " " + (number));

		System.out.println();
		int sumMark = stud.getSumOfMarks();
		System.out.println("sumOfMarks" + " " + (sumMark));

		System.out.println();
		int maximumMark = stud.getMaximumMark();
		System.out.println("maximumMark" + " " + (maximumMark));

		System.out.println();
		int minimum = stud.getMinimumMark();
		System.out.println("minimumMarks" + " " + (minimum));

		System.out.println();
		BigDecimal average = stud.getAverage();
		System.out.println("average" + " " + (average));

		/*
		 * int add = stud.addNewMark(); System.out.println(marks + "" + (add));
		 */
	}

	public int removeMarksAtIndex(int i) {

		return 35;
	}

}
