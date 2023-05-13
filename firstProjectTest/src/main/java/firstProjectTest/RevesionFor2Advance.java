package firstProjectTest;

public class RevesionFor2Advance {

	public static void main(String[] args) {

		for (int i = 1, j = 2; i <= 10; i++, j++) {
			System.out.println(j * i);
		}
		System.out.println();
		int i = 0;
		for (; i <= 7; i++) {
			System.out.println(i);
		}
		System.out.println();
		int k = 0;
		int j = 0;
		for (k = 1, j = 1; k <= 10; k++, j--)
			;
		System.out.println(j);
	}

}
