package firstProjectTest;

public class test {
	static int page;

	public static void main(String[] args) {
		test maths = new test();
		test scince = new test();
		scince.book();
		maths.book();
		maths.page = 100;
		scince.page = 50;
		System.out.println(page);
		/*
		 * test st = new test (); st.show(); } void show() {
		 * System.out.println("hello");
		 */

	}

	void book() {
		// int page = 45;
		// int copy = 30;
		// System.out.println(page);
	}
}
