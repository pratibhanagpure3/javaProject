package firstProjectTest;

import java.util.Scanner;

public class threenum {
	public static void main(String[]args) {
		int num1,num2,num3;
		System.out.println("enter three num");
		Scanner s =new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
	/*	if(num1>num2)
		{
			if(num1>num3)
			{
			System.out.println("max num:" +num1);
		}
		else{
			System.out.println("max num:" +num2);
		}
	}
		else{
			if(num2>num3){
			System.out.println("max num:" +num2);
			}
		else 
		{
			System.out.println("max num" +num3);
		}
		
		}
	}
}*/
		if(num1>num2 && num1>num3)
		{
			System.out.println("max num" +num1);
		}
		else if(num2>num3)
		{
			System.out.println("max num" +num2);
		}
		else 
		{
			System.out.println("max num" +num3);
		}
	}

}
