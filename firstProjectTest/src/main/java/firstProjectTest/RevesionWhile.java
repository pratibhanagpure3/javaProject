package firstProjectTest;

public class RevesionWhile {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i <= 10) {
			// System.out.println(i);
			// i++;
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

		int j = 0;
		while (j * j < 30) {
			System.out.println(j * j);
			j++;
		}
	}

}
