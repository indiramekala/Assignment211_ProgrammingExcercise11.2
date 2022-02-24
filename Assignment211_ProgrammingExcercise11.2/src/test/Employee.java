package test;

public class Employee extends Person {

	private String office;
	private int hours;

	private java.util.Calendar dateHired;

	public Employee(String name) {
		super(name);

	}

	// Override toString
	public String toString() {
		return "Class name is " + this.getClass() + " " + "Name is " + this.getName();

	}

}
