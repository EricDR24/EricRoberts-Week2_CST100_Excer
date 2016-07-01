/** Program:  9.6 stopwatch
  * File:     stopwatch.java 
  * Summary:  create objects for stopwatch
  * Author:   Eric Roberts
  * Date:     June 30, 2016
  */ 
public class stopwatch {

	public static void main(String[] args) {
		// create stopWatch
		stopwatchClass stopWatch = new stopwatchClass();
		
		//array of 100,000 number
		int[] array = getArray();
		
		//start
		stopWatch.start();
		
		//array selection
		selection(array);
		
		//stop
		stopWatch.stop();
		
		//print time
		System.out.println("The execution of time of sorting 100,000 numbers using selection sort: " + stopWatch.getElapsedTime() + " in milliseconds");
		

	}

	private static void selection(int[] array) {
		//selection for array
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;
			
			for (int j = i +1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
		}
		
	}

	private static int[] getArray() {
		//create array
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() + 100000);
		}
		return array;
	}

}
