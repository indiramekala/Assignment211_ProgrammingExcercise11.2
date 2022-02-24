package test;

public class Staff extends Employee {

	private String title;

	public Staff(String name) {
		super(name);
	}

	// Override toString
	public String toString() {
		return "Class name is " + this.getClass() + " " + "Name is " + this.getName();

	}

}
