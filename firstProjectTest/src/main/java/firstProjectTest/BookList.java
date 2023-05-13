package firstProjectTest;

public class BookList {

	public static void main(String[] args) {
		BookList1 maths = new BookList1();
		BookList1 scince = new BookList1();
		BookList1 english = new BookList1();

		// System.out.println(noOfCopy);
		maths.setNoOfCopy(100);
		maths.increaseNoOfCopy(50);
		maths.decreaseNoOfCopy(50);
		System.out.println(maths.getNoOfCopy());

		scince.setNoOfCopy(50);
		scince.increaseNoOfCopy(50);
		scince.decreaseNoOfCopy(50);
		System.out.println(scince.getNoOfCopy());

		english.setNoOfCopy(40);
		english.increaseNoOfCopy(50);
		english.decreaseNoOfCopy(100);
		System.out.println(english.getNoOfCopy());

	}

}
