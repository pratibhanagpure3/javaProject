package myPackage;

//this can be used to invoke current class method(implicitly)

public class ThisInvokeMethod {

	void display() {
		System.out.println("call through show method");
	}

	// if you don't use this keyword,compiler automatically adds this keyword while
	// invoking the method.

	void show() {
		display(); // this.display();
	}

	public static void main(String[] args) {
		ThisInvokeMethod tim = new ThisInvokeMethod();

		tim.show();
	}

}
