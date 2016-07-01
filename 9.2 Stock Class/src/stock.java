/** Program:  9.2 stock
  * File:     stock.java 
  * Summary:  create objects for stock
  * Author:   Eric Roberts
  * Date:     June 30, 2016
**/
public class stock {

	public static void main(String[] args) {
		// objects for stock
		stockClass stock = new stockClass("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		
		//print price change
		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f\n", stock.getPercentChange());

	}

}
