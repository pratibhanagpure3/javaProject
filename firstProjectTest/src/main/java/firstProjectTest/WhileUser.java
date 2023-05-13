package firstProjectTest;

import java.util.Scanner;

//use repetedly ask for the input 

public class WhileUser {
	public static void main(String[] args) {
		int num = 0;
		do { // isse diff digit ka nikal skte h
			System.out.println("enter number");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			// do { isse sirf ek no ek hi bar square nikal sakte h
			System.out.println(num * num);
			num++;
		} while (num >= 0);

	}

}
