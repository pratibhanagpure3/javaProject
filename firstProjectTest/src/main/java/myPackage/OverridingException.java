package myPackage;
//overriding and exception handling

public class OverridingException {

	int show() {
		System.out.println("1");
		return 0;
	}

	public static void main(String[] args) {
		xyz x = new xyz();
		x.show();

	}

}

class xyz extends OverridingException {

	// if parent class method doesn't throw any exception,child class method can
	// only throw unchecked exception
	int show() throws ArithmeticException {
		System.out.println("2");
		return 0;

	}
}
