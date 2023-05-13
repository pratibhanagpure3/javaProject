package firstProjectTest;

public class StringRunner {

	public static void main(String[] args) {

		String[] dayOfWeek = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

		System.out.println("7 days");
		System.out.println("***********");
		System.out.println();
		for (String days : dayOfWeek) {
			System.out.println(days);
		}
		System.out.println();
		System.out.println("********");
		System.out.println();
		System.out.println("days with their length");
		System.out.println();

		for (String days : dayOfWeek) {
			System.out.println(days);
			int len = days.length();
			System.out.println((len));
		}
		System.out.println();
		System.out.println("*********");
		System.out.println();
		System.out.println("maximum length of day");
		System.out.println();

		/*
		 * int max = 0; String day = null; int len = 0;
		 * 
		 * for (String days : dayOfWeek) {
		 * 
		 * len = days.length();
		 * 
		 * if (len > max) { day = days; max = len;
		 * 
		 * } System.out.println(day + " number-" + max);
		 * 
		 * 
		 * }
		 */

		String maxNum = "";
		for (String day : dayOfWeek) {
			if (day.length() > maxNum.length()) {
				maxNum = day;
			}
		}
		System.out.println(maxNum);

		System.out.println();
		System.out.println("days in reverse");
		System.out.println();
		for (int i = dayOfWeek.length - 1; i >= 0; i--) {
			System.out.println(dayOfWeek[i]);
		}
	}
}
