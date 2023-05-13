package myPackage;

public class InitializeWithReference {

	String name;
	int age;
//	System.out.println(name);

	public static void main(String[] args) {

		InitializeWithReference iwr = new InitializeWithReference();
		iwr.name = "khush";
		iwr.age = 29;
		System.out.println(iwr.name + " " + iwr.age);
	}

}
