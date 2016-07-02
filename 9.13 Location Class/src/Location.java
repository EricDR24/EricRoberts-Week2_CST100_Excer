/** Program:  9.13 Location
  * File:     location.java 
  * Summary:  return the location of the largest element
  * Author:   Eric Roberts
  * Date:     July 1, 2016
**/
public class Location {
		//public data fields
		int row;
		int column;
		double maxValue;
		
		//location constructor
		Location(double[][] a) {
			maxValue = a[0][0];
			row = 0;
			column = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] > maxValue) {
						maxValue = a[i][j];
						row = i;
						column = j;
					}
				}
			}
		}

}
