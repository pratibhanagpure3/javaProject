package firstProjectTest;

import java.util.List;

public class StudentDetail {
	private int id;
	private String name;

	public StudentDetail(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "" + "id " + "name ";
	}

	public static void main(String[] args) {

		List<StudentDetail> detail = List.of(new StudentDetail(1, "adam"), new StudentDetail(100, "ranga"),
				new StudentDetail(3, "eve"));
		System.out.println(detail);
	}
}
