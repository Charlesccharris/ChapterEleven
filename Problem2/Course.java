import java.util.ArrayList;

public class Course{
	private String courseName;
	private int numberOfStudents;
	private ArrayList<String> ourStudents = new ArrayList<String>();

	public Course(String newCourseName){
		this.courseName = newCourseName;
	}

	public void addStudents(String student){
		ourStudents.add(student);
		numberOfStudents++;
	}
/*
	public String[] getStudents(){
		String[] students = new String[100];
		for(int index = 0; index < ourStudents.size(); index++){
			students[index] = ourStudents.get(index);
		}
		return students;
	}
*/

	public int getNumberOfStudents(){
		return numberOfStudents;
	}

	public String getCourseName(){
		return courseName;
	}

	public void printStudents(){
		System.out.println("\n" + ourStudents.toString());
	}
}
