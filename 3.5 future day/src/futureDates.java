/** Program:  Future Date
  * File:     futureDates.java 
  * Summary:  find future date of the week
  * Author:   Eric Roberts
  * Date:     June 27, 2016
**/
import java.util.Scanner;

public class futureDates {

	public static void main(String[] args) {
		// Start scanner for current day
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int currentDay = sc.nextInt();
		
		//number of days after current
		System.out.println("Enter the number of days elapsed today: ");
		int elapsedDay = sc.nextInt();
		
		//compute number of days
		System.out.println("Today is ");
		int futureDays = (currentDay + elapsedDay) % 7;
		
		switch (currentDay) {
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
		}
		
		System.out.println(" and the future day is ");
		switch (futureDays) {
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
		}
		
	}

}
