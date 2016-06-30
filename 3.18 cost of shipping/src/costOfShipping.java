/** Program:  Paper, Rock, Scissors
  * File:     game.java 
  * Summary:  plays Paper, Rock, Scissors game
  * Author:   Eric Roberts
  * Date:     June 28, 2016
**/
import java.util.Scanner;

public class costOfShipping {

	public static void main(String[] args){
		//Scanner for weight of the package
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight of the package: ");
		double weight = sc.nextDouble();
		
		//compute cost
		if (weight > 50)
			System.out.println("The package cannot be shipped.");
		else {
			double cost;
			if (weight > 0 && weight <= 1)
				cost = 3.5;
			else if (weight <= 3)
				cost = 5.5;
			else if (weight <= 10)
				cost = 8.5;
			else
			    cost = 10.5;
			System.out.println("The cost to ship the package is $" + cost * weight);
				
			
		}
	}
	
}
