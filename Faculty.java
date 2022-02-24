package test;

public class Faculty extends Employee {

	private String officeHours;
	private String rank;

	public Faculty(String name) {
		super(name);
	}

	//// Override toString
	public String toString() {
		return "Class name is " + this.getClass() + " " + "Name is " + this.getName();

	}

}
