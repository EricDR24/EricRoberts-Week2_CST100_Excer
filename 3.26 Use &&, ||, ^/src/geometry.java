/** Program:  3.29 geometry
  * File:     geometry.java 
  * Summary:  determine if a circle is inside another circle
  * Author:   Eric Roberts
  * Date:     June 29, 2016
**/
import java.util.Scanner;

public class geometry {

	public static void main(String[] args) {
		//Start Scanner for circles
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		//print results
		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2))
			System.out.println("circle2 is inside circle1");
		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2)
			System.out.println("circle overlaps circle1");
		else
			System.out.println("circle does not overlap circle");
				
		

	}

}
