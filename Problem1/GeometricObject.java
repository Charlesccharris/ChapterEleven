import java.util.*;

public class GeometricObject{

/*	-----------------------------------
		  GeometricObject
	-----------------------------------
	-color: String
	-filled: boolean
	-dateCreated: java.util.Date
	-----------------------------------
	+GeometricObject()
	+GeometricObject(color: String,
	filled: boolean)
	+getColor(): String
	+setColor(color: String): void
	+isFilled(): boolean
	+setFilled(filled: boolean): void
	+getDateCreated(): java.util.Date
	+toString(): String
	-----------------------------------
*/
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject(){
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String newColor, boolean filled){
		dateCreated = new java.util.Date();
		this.color = newColor;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(Scanner input){
		System.out.print("Enter the color of the shape: ");
		String newColor = input.next();
		this.color = newColor;
	}

	public boolean isFilled(){
		return filled;
	}

	public void setFilled(Scanner input){
		System.out.print("Is the object filled or not(Y/N): ");
		char answer = input.next().charAt(0);
		if(answer == 'Y' || answer == 'y')
			this.filled = true;
		else
			this.filled = false;
	}

	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	public String toString(){
		return "Created on " + dateCreated + "\nColor: " + color +
		" Filled: " + filled + "\n";
	}
}
