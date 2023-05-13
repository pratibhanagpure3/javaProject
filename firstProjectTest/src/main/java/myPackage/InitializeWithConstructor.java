package myPackage;

public class InitializeWithConstructor {

	String name;
	int age;

	public InitializeWithConstructor(String s, int i) {
		name = s;
		age = i;
	}

	public static void main(String[] args) {
		InitializeWithConstructor iwc = new InitializeWithConstructor("khus", 29);
		System.out.println(iwc.name + " " + iwc.age);
	}

}
