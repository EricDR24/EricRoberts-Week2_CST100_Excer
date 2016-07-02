/** Program:  account
  * File:     accountClass.java 
  * Summary:  create a class for Account
  * Author:   Eric Roberts
  * Date:     June 30, 2016
**/
import java.util.Date;

public class accountClass {
	//private fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	//constructors for class
	accountClass() {
		id = 0;
		balance = 0;
		dateCreated = new Date();
	}
	
	accountClass(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	//mutator methods
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	//accessor methods
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	//regular methods
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	public void deposite(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
