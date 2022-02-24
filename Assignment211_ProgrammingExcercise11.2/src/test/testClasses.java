package test;

public class testClasses {

	public static void main(String[] args) {
		Person pn = new Person("Steve");
		Student st = new Student("Len");
		Employee emp = new Employee("Sam");
		Faculty fy = new Faculty("James");
		Staff sf = new Staff("Maven");

		System.out.println(pn.toString());
		System.out.println(st.toString());
		System.out.println(emp.toString());
		System.out.println(fy.toString());
		System.out.println(sf.toString());

	}

}
