package test;

public class Student extends Person {

	final String status1 = "FRSHMAN";
	final String status2 = "SOPHOMORE";
	final String status3 = "JUNIOR";
	final String status4 = "SENIOR";

	public Student(String name) {
		super(name);

	}

	// Override toString
	public String toString() {
		return "Class name is " + this.getClass() + " " + "Name is " + this.getName();
	}

}
