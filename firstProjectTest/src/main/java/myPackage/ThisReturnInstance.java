package myPackage;

//this keyword can be used to return the current class instance from the method

public class ThisReturnInstance {

	ThisReturnInstance m1() {
		System.out.println("i m in m1");
		return this;
		// System.out.println("i m in m1");
	}

	public static void main(String[] args) {

		ThisReturnInstance tri = new ThisReturnInstance();
		tri.m1();
		System.out.println("i m return from m1");
	}

}
