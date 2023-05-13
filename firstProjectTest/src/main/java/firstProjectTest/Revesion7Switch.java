package firstProjectTest;

public class Revesion7Switch {
	public static String switchRunner(int day) {
		String result = "";
		switch (day) {
		case 0:
			result = "sunday";
		case 1:
			result = "monday";
			break;
		case 2:
			result = "tuesday";
			break;
		case 3:
			result = "wednesday";
			break;
		case 4:
			result = "thursday";
			break;
		case 5:
			result = "friday";
			break;
		case 6:
			result = "saturday";
			break;
		default:
			result = "invalid";
		}
		return result;
	}

	public static String switchRunner2(int day1) {
		switch (day1) {
		case 0:
			return "sunday";
		case 1:
			return "monday";
		case 2:
			return "tuesday";
		case 3:
			return "wednesday";
		case 4:
			return "thurday";
		case 5:
			return "friday";
		case 6:
			return "saturday";
		}
		return "invalid day";
	}

	public static void main(String[] args) {
		System.out.println(switchRunner(2));
		System.out.println(switchRunner2(7));
	}

}
