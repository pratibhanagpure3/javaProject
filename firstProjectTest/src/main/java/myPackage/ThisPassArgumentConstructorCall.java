package myPackage;

//this keyword can be used to pass as an argument in the construction call

class Test {
	Test(ThisPassArgumentConstructorCall tpacc) {
		System.out.println("i m in test class");
	}
}

public class ThisPassArgumentConstructorCall {

	void display() {
		Test t = new Test(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisPassArgumentConstructorCall tpacc = new ThisPassArgumentConstructorCall();
		tpacc.display();
	}

}
