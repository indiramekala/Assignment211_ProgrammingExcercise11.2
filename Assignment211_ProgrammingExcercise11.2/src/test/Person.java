/**COSC211 Sony Mekala
 * Assignment Programming Exercise 11.2
 */
package test;

public class Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Class name is " + this.getClass() + " " + "Name is " + this.getName();

	}

}
