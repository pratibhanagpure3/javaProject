package firstProjectTest;

import java.util.Scanner;

public class SWITCH {
	public static void main(String args[]) {
	/*	int day=7;
		switch(3) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
		case 4:
			System.out.println("thrusday");
		case 5:
			System.out.println("friday");
		case 6:
			System.out.println("saterday");
		defalt:
			System.out.println("none of this");
		}*/
		int day;
		System.out.println("enter any num:");
		Scanner s =new Scanner(System.in);
		day=s.nextInt();
		switch(day) {
		case 0:
			System.out.println("monday");
			break;
		case 1:
			System.out.println("tuesday");
		case 2:
			System.out.println("wed");
		case 3:
			System.out.println("thrus");
		case 4: 
			System.out.println("fri");
		case 5:
			System.out.println("sat");
		case 6:
			System.out.println("sun");
		default:
			System.out.println("none");
				
		}
	}

}
