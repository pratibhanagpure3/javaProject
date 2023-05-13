package firstProjectTest;

public class WhileUse {
	private int i;

	public WhileUse(int i) {
		this.i = i;
	}

	public int player() {
		/*
		 * int j = 0; while (j <= i) { 10 digit tk ka sqar aur cube nikalne k liye use
		 * // for(int j=1;) System.out.println(j * j * j); j++; }
		 */
		int j = 0;
		while (j * j < i) {
			System.out.print(j * j + " ");
			j++;
		}
		return j * j;
		// return j;
	}

}
