import java.util.Scanner;

public class Homework11_1{
	public static void main(String[] args){
		/*(The Triangle class)
		Design a class named Triangle that extends GeometricObject.
		The class contains:
		Three double data fields named side1, side2, and side3
		with default values 1.0 to denote three sides of the triangle.;

		A no-arg constructor that creates a default triangle.
		A constructor that creates a triangle with
		the specified side1, side2, and side3.;

		The accessor methods for all three data fields.;
		A method named getArea() that returns the area of this triangle.;
		A method named getPerimeter() that returns the perimeter of this triangle.;
		A method named toString() that returns a string description for the triangle.

		For the formula to compute the area of a triangle,
		see Programming Exercise 2.19.
		The toString() method is implemented as follows:
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;;

		Make the UML diagrams for the classes Triangle and GeometricObject in comments in the codes and implement the classes.
		Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled.
		The program should create a Triangle object with these sides and set the color and filled properties using the input.
		The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.*/

		Scanner input = new Scanner(System.in);

		String color;
		String description;

		Triangle triangle = new Triangle();

		triangle.setColor(input);
		triangle.setFilled(input);

		triangle.getUserInputs(input);
		triangle.getPerimeter();
		triangle.getArea();

		description = triangle.toString();
		description += triangle.toStringTwo();

		System.out.println(description);
	}
}
