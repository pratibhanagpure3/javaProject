package firstProjectTest;

public class PersonRun {
	private String name;
	private String email;
	private int phonenumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String toString() {
		return name + " # " + email + " # " + phonenumber;
	}

	public static void main(String[] args) {
		PersonRun run = new PersonRun();
		run.setName("khus");
		run.setEmail("elecrical.pratibha");
		run.setPhonenumber(45677888);
		System.out.println(run);

	}

}
