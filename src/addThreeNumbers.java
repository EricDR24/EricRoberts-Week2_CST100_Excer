/**Program: 3.2 add three numbers
 * File: addThreeNumbers.java
 * Summary:adds three numbers and checks answer
 * Author: Eric Roberts
 * Date:6/27/16
 */

import java.util.Scanner;

public class addThreeNumbers {

	public static void main(String[] args) {
		// Generate random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		//Start Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		int answer = sc.nextInt();
		
		//Print answer
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
		System.out.println((number1 + number2 + number3 == answer));
		

	}

}
