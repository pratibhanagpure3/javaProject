package myPackage;

public class OverridingException2 {

	void test() throws RuntimeException {
		System.out.println("1");
	}

	public static void main(String[] args) {
		Run x = new Run();
		x.test();

	}
}
//if parent class method throws exception,child class method can throw only same,subclass exception 

class Run extends OverridingException2 {
	void test() throws RuntimeException {
		System.out.println("2");
	}
}
