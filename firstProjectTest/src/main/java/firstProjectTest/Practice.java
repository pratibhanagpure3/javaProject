package firstProjectTest;

import java.util.Scanner;

//import java.util.Scanner;

public class Practice{
	
	
	public static void main(String[] args) {
		int age;
		System.out.print("Enter Password:= ");
		Scanner obj=new Scanner(System.in);
		age=obj.nextInt();
		if(age>=17)
		{
			System.out.println("eligible for voting");
		}
	    else
		{
			System.out.print("not eligible for voting>....");
		}
	}	
}