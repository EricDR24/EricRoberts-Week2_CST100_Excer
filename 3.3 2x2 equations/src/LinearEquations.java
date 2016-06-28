/** Program:  2x2LinearEquations
  * File:     2x2LinearEquations.java 
  * Summary:  Solves two Linear equations
  * Author:   Eric Roberts
  * Date:     June 27, 2016
**/
import java.util.Scanner;

     public class LinearEquations {

	public static void main(String[] args) {

	//Start Scanner for a,b,c,d,e,f
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a,b,c,d,e,f: ");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double d = sc.nextDouble();
	double e = sc.nextDouble();
	double f = sc.nextDouble();

	//if-else statement.
	if (a * d - b * c == 0){
          System.out.println("The equation has no solution."); 
         } else {
	    double x = ((e * d) - (b * f) / (a * d) - (b * c));
	    double y = ((a * f) - (e * c) / (a * d) - (b * c));
		System.out.println("x is " + x + " y is " + y);
           }





   }

}