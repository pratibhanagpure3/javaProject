package myPackage;

//this keyword used to pass as an argument in the method call

public class ThisPassArgument {

	// here is thisPassArgument passed as an parameter
	void setValue(ThisPassArgument tpa) {
		System.out.println("setValue");
	}

	void display() {

		setValue(this);// here is (this) passed as an argument
		System.out.println("display Value");
	}

	public static void main(String[] args) {

		ThisPassArgument tpa = new ThisPassArgument();
		// tpa.setValue(2);
		tpa.display();
	}

}
