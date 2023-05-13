package firstProjectTest;

//6.9.22
public class AndOperater {
	static int a = 18;

	// int b = 34;
	public static void main(String[] args) {
		System.out.println(a > 20 && a < 20);
		System.out.println(a > 20 & a < 20);
		System.out.println(a > 3 & a++ > 5);
		System.out.println(a > 2 & ++a > 18);
	}
}