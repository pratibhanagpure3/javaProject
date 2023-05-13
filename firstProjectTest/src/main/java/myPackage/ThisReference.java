package myPackage;

public class ThisReference {
	int a;

	void show(int a) {
		this.a = a;
		// System.out.println(a);
	}

	void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisReference tf = new ThisReference();
		tf.show(2);
		// System.out.println(a);
		tf.display();
	}

}
