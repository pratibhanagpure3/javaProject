package firstProjectTest;

//date 5.9.22
public class Thisrunner {

	public static void main(String[] args) {
		Thisnum ref = new Thisnum(6, 7);
		// int r = ref.add(); esa bhi kr skte h
		System.out.println(ref.add());
		System.out.println(ref.multiply(8));
		ref.doublevalue();
		ref.setnum1AndNum2(2, 3);
		// System.out.print(ref.doublevalue());
		Thisnum ref2 = new Thisnum(6, 7);
		Thisnum ref3 = new Thisnum();
		System.out.println("*******************");

		System.out.println("ref1 num1 " + ref.setnum1());
		System.out.println("ref1 num2 " + ref.getnum2());
		System.out.println("*******************");

		System.out.println("ref2 num1 " + ref2.setnum1());
		System.out.println("ref2 num2 " + ref2.getnum2());
		System.out.println("*******************");

		System.out.println("ref3 num1 " + ref3.setnum1());
		System.out.println("ref3 num2 " + ref3.getnum2());

	}

}
