package myPackage;

public class ExceptionTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in try block we write risky code and in catch block we write handling code
		try {
			int a = 10;
			int b = 0;
			// try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("exception is accur");
		}
	}

}
