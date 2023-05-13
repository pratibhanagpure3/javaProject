package firstProjectTest;

class Student {
	String name;
	int age = 20;

	public void printInfo(String name) {
		System.out.println(this.name);
	}

	public void printInfo(int age) {
		System.out.println(this.age);
	}
}

public class OverLoading {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "aman";
		// obj.age = 20;
		obj.printInfo("");

	}

}
