package myPackage;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 17; i++) {
			if (i == 2 || i == 3) {
				System.out.println(i);
			} else if (i % 2 != 0 && i % 3 != 0) {
				System.out.println(i);
			}
		}
	}

}
