/** Program:  3.33 compare costs
  * File:     compareCost.java 
  * Summary:  compare the costs of two items.
  * Author:   Eric Roberts
  * Date:     June 29, 2016
**/
import java.util.Scanner;

public class compareCost {

	public static void main(String[] args) {
		//Start scanner for items
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1: ");
		double w1 = sc.nextDouble();
		double p1 = sc.nextDouble();
		System.out.println("Enter weight and price for package 2: ");
		double w2 = sc.nextDouble();
		double p2 = sc.nextDouble();
		
		//calculate best price
		if (p1 / w1 < p2 / w2)
			System.out.println("Package 1 has a better price.");
		else if (p1 / w1 > p2 / w2)
			System.out.println("Package 2 has a better price.");
		else
			System.out.println("Both packages have the same price.");
		
		

	}

}
