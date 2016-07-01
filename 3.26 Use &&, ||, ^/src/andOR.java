/** Program:  Use && || ^ operators
  * File:     andOR.java 
  * Summary:  determine if an integer is divisible
  * Author:   Eric Roberts
  * Date:     June 29, 2016
**/
import java.util.Scanner;

public class andOR {

	public static void main(String[] args) {
		//Scanner for integer
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = sc.nextInt();
		
		//display if int is divisible by 5 and 6
		System.out.println("Is " + integer + " divisible by 5 and 6? " + ((integer % 5 == 0) && (integer % 6 == 0)));
		System.out.println("Is " + integer + " divisible by 5 or 6? " + ((integer % 5 == 0) || (integer % 6 == 0)));
		System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + ((integer % 5 == 0) ^ (integer % 6 == 0)));

	}

}
