/** Program:  9.13 Location
  * File:     locationMain.java 
  * Summary:  return the location of the largest element
  * Author:   Eric Roberts
  * Date:     July 1, 2016
**/
import java.util.Scanner;

public class locationMain {

	public static void main(String[] args) {
		//user to enter rows and columns for the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		//array
		double[][] array = new double[rows][columns];
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextDouble();
			}
		}
		Location lg = largest(array);
		
		System.out.println("The location of the largest is " + lg.maxValue + " lg.row + lg.column");
		
	}

	private static Location largest(double[][] a) {
		
		return new Location(a);
	}
     

}
