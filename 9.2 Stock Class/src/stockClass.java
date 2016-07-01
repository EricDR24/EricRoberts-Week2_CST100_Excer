/** Program:  9.2 stock class
  * File:     stockClass.java 
  * Summary:  create class for stock
  * Author:   Eric Roberts
  * Date:     June 30, 2016
**/
public class stockClass {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	//Stock name
	stockClass(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
				
	}
	//get percentage
	double getPercentChange() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}

}
