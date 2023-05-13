package firstProjectTest;

public class BookList1 {
	private int noOfCopy;

	void setNoOfCopy(int noOfCopy) {
		if (noOfCopy > 0) // value limit set krne ke liye
			this.noOfCopy = noOfCopy;
	}

	int getNoOfCopy() {
		return this.noOfCopy;
	}

	public void increaseNoOfCopy(int howMuch) {
		// this.noOfCopy = this.noOfCopy + howMuch;
		this.noOfCopy += howMuch;
	}

	public void decreaseNoOfCopy(int howMuch) {
		setNoOfCopy(-howMuch);// this.noOfCopy - howMuch b likh sakte h
	}

}
