/** Program:  9.10 Quadratic Equations
  * File:     QuadraticEquations.java 
  * Summary:  Solve Quadratic Equations
  * Author:   Eric Roberts
  * Date:     July 1, 2016
**/
import java.util.Scanner;

public class quadraticEquationMain {

	public static void main(String[] args) {
		//Scanner for user inputs
		Scanner sc = new Scanner(System.in);
		
		//input values for a, b, c
		System.out.println("Enter values a, b, c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		double disc = qe.getDiscriminant();
		System.out.println("The equation has ");
		if (disc < 0)
			System.out.println("no real roots");
		else if (disc > 0) {
			System.out.println("Two roots " + qe.getRoot1() + " and " + qe.getRoot2());
		} else {
			System.out.println("one root " + (qe.getRoot1() > 0 ? qe.getRoot1() : qe.getRoot2()));
		}
	}
	
}