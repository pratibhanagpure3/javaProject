package firstProjectTest;

public class binumber {

	private int a;
	private int b;

	binumber(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int add() {
		// System.out.println(a + b);
		return a + b;
	}

	public int multiply() {
		// System.out.println(a * b);
		return a * b;
	}

	public void doublevalue() {
		this.a *= 2;
		this.b *= 2;

	}
}
