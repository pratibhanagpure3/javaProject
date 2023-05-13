package myPackage;

//object initialize with method

public class InitializeWithMethod {
	String name;
	int age;

	void value(String n, int a) {
		name = n;
		age = a;
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		InitializeWithMethod iwm = new InitializeWithMethod();
		iwm.value("khush", 28);
	}

}
