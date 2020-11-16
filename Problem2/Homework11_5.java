public class Homework11_5{
	public static void main(String[] args){
		/*(The Course class)
		Rewrite the Course class in Listing 10.6.
		Use an ArrayList to replace an array to store students.
		Draw the new UML diagram for the class.
		You should not change the original contract of the Course class
		(i.e., the definition of the constructors and methods should not be changed,
		but the private members may be changed.)*/
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudents("Peter Jones");
		course1.addStudents("Kim Smith");
		course1.addStudents("Anne Kennedy");

		course2.addStudents("Peter Jones");
		course2.addStudents("Steve Smith");

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		course1.printStudents();

		System.out.println();
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
	}
}
