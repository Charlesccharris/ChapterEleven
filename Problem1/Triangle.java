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

/*	-----------------------
		Triangle
	-----------------------
	-side1: double
	-side2: double
	-side3: double
	-----------------------
	+Triangle()
	+getArea(): double
	+getPerimeter(): double
	+toString(area: double,
	perimeter: double): String
	-----------------------
}*/

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	Triangle(){

	}

	public double getArea(){
		double newArea = 1.5;

		return newArea;
	}

	public double getPerimeter(){
		double newPerimeter = 2.0;

		return newPerimeter;
	}

	public String toString(double area, double perimeter){
		String description = "Triangle with area: " + area + " and perimeter: " + perimeter;

		return description;
	}
}
