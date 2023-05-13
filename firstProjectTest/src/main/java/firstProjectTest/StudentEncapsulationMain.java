package firstProjectTest;

public class StudentEncapsulationMain {

	public static void main(String[] args) {

		StudentEncapsulation st = new StudentEncapsulation();

		st.setId(20);
		st.setName("test");

		System.out.println(st.getId());
		st.name = "bcd";

	}

}
