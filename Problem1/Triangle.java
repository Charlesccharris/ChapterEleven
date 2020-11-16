import java.lang.Math;
import java.util.Scanner;

public class Triangle extends GeometricObject{
/*   	Design a class named Triangle that extends GeometricObject.
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
*/

/*	--------------------------------------
		       Triangle
	--------------------------------------
	-side1: double
	-side2: double
	-side3: double
	-area: double
	-perimeter: double
	--------------------------------------
	+Triangle()
	+getUserInputs(input: Scanner): void
	+getPerimeter(): void
	+getArea(): void
	+toString(): String
	--------------------------------------
*/

	private double side1 = 0;
	private double side2 = 0;
	private double side3 = 0;
	private double area = 0;
	private double perimeter = 0;

	public Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public void getUserInputs(Scanner input){
		System.out.print("Enter number for side one: ");
		this.side1 = input.nextDouble();
		System.out.print("Enter number for side two: ");
		this.side2 = input.nextDouble();
		System.out.print("Enter number for side three: ");
		this.side3 = input.nextDouble();
	}

	public void getPerimeter(){
		double newPerimeter = side1 + side2 + side3;
		this.perimeter = newPerimeter;
	}

	public void getArea(){
		double p = perimeter/2;
		double a = side1;
		double b = side2;
		double c = side3;

		double partOne = p - a;
		double partTwo = p - b;
		double partThree = p - c;
		double whole = p * partOne * partTwo * partThree;
		double newArea = Math.sqrt(whole);
		this.area = newArea;
	}

	public String toStringTwo(){
		String description = "Triangle: side1 = " + side1 + " side2 = "
		+ side2 + " side3 = " + side3 + "\nArea: " + this.area +
		"\nPerimeter: " + perimeter;
		return description;
	}
}
