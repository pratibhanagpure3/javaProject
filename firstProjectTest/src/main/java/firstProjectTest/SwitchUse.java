package firstProjectTest;

//7.9.22
public class SwitchUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// weekday();
		System.out.println(ReturnDay(2));
	}

	/*
	 * public static void weekday() { int ch = 7; switch (ch) { case 0:
	 * System.out.println("monday"); case 1: System.out.println("tuesday"); case 2:
	 * System.out.println("wednesday"); case 3: System.out.println("thrusday"); case
	 * 4: System.out.println("friday"); case 5: System.out.println("saterday"); case
	 * 6: System.out.println("sunday"); default: System.out.println("default");
	 * 
	 * } }
	 */
	public static String ReturnDay(int daynum) {
		String result = "";

		switch (daynum) {
		case 0:
			result = "sunday";
		case 1:
			result = "monday";
		case 2:
			result = "tuesday";
		}
		return result;
	}
}
