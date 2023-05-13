package firstProjectTest;

public class Test1 {
	int c;
	int d;

	Test1(int a, int b) {
		c = a;
		d = b;
	}

	public static void main(String[] args) {

		Test1 t = new Test1(2, 4);
		System.out.println(t.c + "  " + t.d);
	}

}
