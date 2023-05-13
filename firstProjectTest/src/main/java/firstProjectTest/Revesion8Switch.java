package firstProjectTest;

public class Revesion8Switch {
	public static boolean isWeekDay(int day) {
		// int days = 7;
		switch (day) {
		case 0:
			// return ;
		case 6:
			return false;
		case 1:
			// return ;
		case 2:
			// return ;
		case 3:
			// return ;
		case 4:
			// return ;
		case 5:
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isWeekDay(3));

	}

}
