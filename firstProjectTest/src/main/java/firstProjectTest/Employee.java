package firstProjectTest;

public class Employee extends PersonRun {
	private String title;
	private String employer;
	private char employeeGrade;
	private int salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return title + " # " + employer + " # " + employeeGrade + " # " + salary + " # " + super.getEmail() + " # "
				+ super.getName() + " # " + super.getPhonenumber();
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("khus");
		emp.setPhonenumber(3456778);
		emp.setEmail("electrical.pratibha");
		emp.setTitle("devloper");
		emp.setEmployer("pratibha");
		emp.setEmployeeGrade('a');
		emp.setSalary(45000);
		System.out.println(emp);
	}
}
