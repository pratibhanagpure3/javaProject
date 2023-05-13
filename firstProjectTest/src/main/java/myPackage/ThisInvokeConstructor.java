package myPackage;

//this() can be used to invoke current class constructor and we can achive constructor chaining also

public class ThisInvokeConstructor {

	ThisInvokeConstructor() {

		// this(7);
		System.out.println("non parameterised constructor");
	}

	ThisInvokeConstructor(int a) {
		this();
		System.out.println("parameterised constructor");
	}

	public static void main(String[] args) {

		ThisInvokeConstructor tic = new ThisInvokeConstructor(7);

	}

}
