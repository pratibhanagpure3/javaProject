package firstProjectTest;

public class birunner {

	public static void main(String[] args) {
		binumber num = new binumber(2, 3);
		// binumber multiply = new binumber(8, 3);
		System.out.println(num.add());
		System.out.println(num.multiply());
		num.doublevalue();
		System.out.println(num.getA());
		System.out.println(num.getB());
	}

}
