package firstProjectTest;

public class Thisnum {
	int num1;
	int num2;

	public Thisnum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Thisnum() {
		// TODO Auto-generated constructor stub
	}

	public int add() {
		int sum = num1 + num2;
		return sum;
	}

	public int multiply(int a) {
		int mul = a * 3;
		return mul;

	}

	public void setnum1AndNum2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void doublevalue() {
		this.num1 *= 2; /// this.num1 = num1*2
		this.num2 *= 3;
		// return num1,num2;
	}
	/*
	 * int dou=num1*num1; //return dou; int doub=num2*num2; return dou ; doub; 2
	 * value return nhi kr sakte
	 */

	// TODO Auto-generated method stub

	public int setnum1() {
		return num1;
	}

	public int getnum2() {
		return num2;
	}

}
