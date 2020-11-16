import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
public class Homework11_16{
	public static void main(String[] args){
		/*(Addition quiz)
		Rewrite Listing 5.1 RepeatAdditionQuiz.java
		to alert the user if an answer is entered again.
		Hint: use an array list to store answers.

		Here is a sample run:
		What is 5 + 9? 12; Wrong answer. Try again.
		What is 5 + 9? 34; Wrong answer. Try again.
		What is 5 + 9? 12; You already entered 12; Wrong answer. Try again.
		What is 5 + 9? 14 You got it!*/
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> pastAnswers = new ArrayList<Integer>();

		runAdditionProblem(input, pastAnswers);
	}

	public static void runAdditionProblem(Scanner input, ArrayList<Integer> pastAnswers){
		int numberOne = (int)(Math.random() * 10);
		int numberTwo = (int)(Math.random() * 10);

		System.out.print("What is " + numberOne + " + " + numberTwo + "? ");
		int answer = input.nextInt();

		while(numberOne + numberTwo != answer){
			System.out.println("Wrong answer");
			if(!pastAnswers.contains(answer)){
				pastAnswers.add(answer);
			}
			else{
				System.out.println("You already guessed " + answer);
			}
			System.out.print("What is " + numberOne + " + " + numberTwo + "? ");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}
