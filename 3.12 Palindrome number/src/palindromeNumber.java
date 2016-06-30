/** Program:  Palindrome Number
  * File:     palindromeNumber.java 
  * Summary:  determines if a three-digit integer is a palindrome
  * Author:   Eric Roberts
  * Date:     June 27, 2016
**/
import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		//Scanner for palindrome
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three-digit integer: ");
		int threeDigitNumber = sc.nextInt();
		
		//palindrome
		int firstNumber = (int)(threeDigitNumber / 100);
		int remainder = threeDigitNumber % 100;
		int thirdNumber = (int)(remainder % 10);
		
		//print result
		System.out.println(threeDigitNumber + ((firstNumber == thirdNumber) ? " is a " : " is not a ") + "palindrome");
		

	}

}
