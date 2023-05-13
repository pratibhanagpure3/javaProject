package firstProjectTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class arraYList {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	arraYList(String name, int[] marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
		/*
		 * int maximum = 0;// Integer.MIN_VALUE for (int mark : marks) { if (mark >
		 * maximum) { maximum = mark; } } return maximum;
		 */
	}

	public int getMinimumMark() {
		return Collections.min(marks);
		/*
		 * int minimum = Integer.MAX_VALUE; for (int mark : marks) { if (mark < minimum)
		 * { minimum = mark; } } return minimum;
		 */
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

	public int addNewMark(int mark) {
		marks.add(mark);
		// int a = mark;
		return mark;
	}

	private int removeMarkAtIndex(int index) {
		marks.remove(index);
		return index;
	}

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96 };
		arraYList stud = new arraYList("khush", marks);

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

		System.out.println();
		System.out.println("to print name and marks of student class through stud object");
		System.out.println(stud);

		System.out.println();
		int addnum = stud.addNewMark(35);
		System.out.println(addnum);

		System.out.println();
		int rem = stud.removeMarkAtIndex(1);
		System.out.println(rem);
	}

}
