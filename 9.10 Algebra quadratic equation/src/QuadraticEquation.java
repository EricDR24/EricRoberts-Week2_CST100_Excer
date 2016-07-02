/** Program:  9.10 Quadratic Equations
  * File:     QuadraticEquations.java 
  * Summary:  Solve Quadratic Equations
  * Author:   Eric Roberts
  * Date:     July 1, 2016
**/
public class QuadraticEquation {
			//private data fields a, b, c
			private double a;
			private double b;
			private double c;
			
			//constructor arguments for a, b, c
			QuadraticEquation(double a, double b, double c) {
				this.a = a;
				this.b = b;
				this.c = c;				
			}
			//getter methods
			public double getA() {
				return a;
			}
			
			public double getB() {
				return b;
			}
			
			public double getC() {
				return c;
			}
			
			public double getDiscriminant() {
				return Math.pow(b, 2) - 4 * a * c;
				
			}
			
			public double getRoot1() {
				double disc = getDiscriminant();
				if (disc < 0) { 
					return 0;
					
				} else {
					return (-b) + Math.sqrt(disc) / 2 * a;
				}
				
				
			}
			
			public double getRoot2() {
				double disc = getDiscriminant();
				return disc < 0 ? 0 : (-b) - Math.sqrt(disc) / 2 * a;
				
			}

}
