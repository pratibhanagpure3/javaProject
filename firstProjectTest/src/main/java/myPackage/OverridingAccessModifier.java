package myPackage;

public class OverridingAccessModifier {

	// overriding and access modifier

	void a1() {
		System.out.println("i m in m1");
	}

	public static void main(String[] args) {
		Override2 ov = new Override2();
		ov.a1();
		// OverridingAccessModifier ovm = new OverridingAccessModifier();
		// ovm.a1();

	}

}

class Override2 extends OverridingAccessModifier {
	public void a1() {
		// super.a1();
		System.out.println("i m in m2");
	}

}
