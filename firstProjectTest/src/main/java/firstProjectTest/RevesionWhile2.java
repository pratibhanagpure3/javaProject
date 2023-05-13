package firstProjectTest;

public class RevesionWhile2 {

	private int num;

	public RevesionWhile2(int num) {
		this.num = num;
	}

	// int i = 0;

	public void printSquare() {
		int i = 0;
		while (i * i < num) {
			System.out.print("square " + i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCube() {
		int i = 0;
		while (i * i * i < num) {
			System.out.print("cube " + i * i * i + " ");
			i++;
		}
		System.out.println();
	}

}
