/** Program:  account
  * File:     account.java 
  * Summary:  create a class for Account
  * Author:   Eric Roberts
  * Date:     June 30, 2016
**/

public class account {

	public static void main(String[] args) {
		//create account
		AccountClass account = new AccountClass(1122, 20000);
		
		
		//deposit
		account.deposite(3000);
		
		//interest
		account.setAnnualInterestRate(4.5);
		
		//withdraw
		account.withdraw(2500);
		
		//print account details
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date: " + account.getDateCreated());
		System.out.printf("Monthly interest: $%.2f", account.getMonthlyInterest());
		System.out.printf("\nBalance $%.2f", account.getBalance());

	}

}
