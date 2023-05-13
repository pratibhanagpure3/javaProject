package firstProjectTest;

class pen {
	String color;
	String type = "bal";

	public void run() {
		System.out.println("writting something");
		System.out.println(type);
	}

	public void printColor() {
		System.out.println(this.color);
	}
}

public class Oops {

	public static void main(String[] args) {
		pen obj = new pen();
		obj.color = "red";
		obj.run();
		obj.printColor();
		pen obj2 = new pen();
		obj2.color = "black";
		obj2.printColor();

	}

}
