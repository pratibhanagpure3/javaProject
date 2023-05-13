package firstProjectTest;

public class Variables1 {
	static int a = 1;

	public static void main(String[] args) {
		// by using class name
		System.out.println(Variables1.a);
		// directly
		System.out.println(a);
		// by using obj reference
		Variables1 vb = new Variables1();
		System.out.println(vb.a);
	}

}
