package myPackage;

public abstract class OverridingAbstractMethod {

	abstract void display();

	void test() {
		System.out.println("1");
	}

	public static void main(String[] args) {
		OvAb ov = new OvAb();
		ov.test();

	}
}

class OvAb extends OverridingAbstractMethod {
	// we have to override abstract method of parent class in child concrete class
	void display() {

	}

	void test() {
		System.out.println("2");
	}

}
