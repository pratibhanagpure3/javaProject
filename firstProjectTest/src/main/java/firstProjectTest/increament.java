package firstProjectTest;

import java.util.Scanner;

public class increament {
	
	public static void main(String[] arg) {
	
	//	int a=10;
	//	System.out.println(++a + a++);
	//	System.out.println(--a + --a);
		int a[]=new int[5];
		System.out.println("enter array element");
		Scanner s=new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("array element" );
		for(int b : a)
		{
			System.out.println(b+" ");
			
		}
		
		
	}

}
